import java.util.*;

public class Test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double lenght;
        double widht;

        Rectangle retangulo = new Rectangle();

        System.out.println("Retângulo inicial: "+ retangulo);

        System.out.println("Insira a altura e largura: ");
        lenght = scan.nextDouble();
        widht = scan.nextDouble();

        try{
            retangulo.setMedidas(lenght, widht);
            System.out.println("\nRetângulo após:\n"+ retangulo);
        }catch(IllegalArgumentException e){
            System.out.println("Erro: "+ e.getMessage());
        }

        scan.close();
    }
}