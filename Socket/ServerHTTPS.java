import java.io.*;
import java.net.*;

public class ServerHTTPS {
    public static void main(String[] args) throws IOException {
        int port = 8001;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Servidor HTTP inicializado em http://localhost:" + port);

        while (true) {
            Socket socket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream out = socket.getOutputStream();

            String line = in.readLine();
            while (line != null && !line.isEmpty()) {
                System.out.println(line);
                line = in.readLine();
            }

            String responseBody = readFile("index.html");
        }
    }

    private static String readFile(String pathFile) {
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return "Erro 404: Arquivo não encontrado";
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Erro ao fechar o reader: " + e.getMessage());
                }
            }
        }
        return sb.toString();
    }
}