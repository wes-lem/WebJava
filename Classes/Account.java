public class Account{
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if (balance >= 0) this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name; 
    }

    public void depositar(double valor){
        if(valor > 0) balance = balance + valor;
        System.out.println("Depositado "+valor+"");
    }

    public void sacar(double valor){
        if(balance > 0 && balance > valor) balance = balance - valor;
    }

    public double getBalance(){
        return balance; 
    }
}