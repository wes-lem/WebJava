import java.util.*;

public class TimeTest{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Time t = new Time();

        System.out.println("Digite hora/segundo/minuto: ");

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();

        try {
            t.setTime(hour, minute, second);
            System.out.println("t1: "+t);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: "+ e.getMessage());
        }

        Time t2 = new Time(12,30,41);
        System.out.println("t2: "+t2);

        Time t3 = new Time(t);
        System.out.println("t3: "+t3);

        scan.close();
    }
}
