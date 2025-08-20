import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.concurrent.*;

public class Server{
    public static void main(String[] args){
        int port = Integer.parseInt(args[0]);

        ExecutorService pool = Executors.newFixedThreadPool(50);
        try(ServerSocket socket = new ServerSocket(port)){
            while(true){
                try{
                    Socket connection = socket.accept();
                    Callable<Void> task = new ServerThread(connection);

                    pool.submit(task);
                }catch(IOException e){
                    System.out.println("E: Erro no socket connection: "+e);
                }
            }
        }catch (IOException e) {
            System.out.println("E: Servidor não inicicializado: "+e);
        }
    }

    private static class ServerThread implements Callable<Void>{
        private Socket connection;
        public ServerThread(Socket connection){
            this.connection = connection;
        }

        @Override public Void call(){
            try {
                Writer out = new OutputStreamWriter(connection.getOutputStream());
                Date now = new Date();
                out.write(now.toString() +"\r\n");
                out.flush();
            } catch (IOException e) {
                System.out.println("E: Erro no call do ServerThread: "+e);
            }
            finally{
                try {
                    connection.close();
                } catch (IOException e) {
                    // TODO: handle exception
                }
            }
            return null;
        }
    }
}

