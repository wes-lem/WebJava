import java.util.*;

public class AccountTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        Account Weslem = new Account("Weslem", 0);
        Account Matheus = new Account("Matheus", 1000);
        System.out.println("Saldo de "+Weslem.getName()+": "+Weslem.getBalance());
        Weslem.depositar(100);
        System.out.println("Saldo de "+Weslem.getName()+": "+Weslem.getBalance());
        System.out.println("Saldo de "+Matheus.getName()+": "+Matheus.getBalance());
        Matheus.sacar(500);
        System.out.println("Saldo de "+Matheus.getName()+": "+Matheus.getBalance());
    }
}