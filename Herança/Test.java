public class Test {
    public static void main(String [] args){
        System.out.println("=".repeat(50));
        CommissionEmployee employee1 = new CommissionEmployee("Weslem", "Rodrigues", "12345678", 10000, 0.05);
        System.out.println(employee1);
        System.out.println("Earnings: " + employee1.earnings());

        System.out.println("=".repeat(50));

        CommissionEmployee employee2 = new BasePlusCommissionEmployee("Joyceara", "Farias", "987654321", 8000, 0.05, 2000);
        System.out.println(employee2);
        System.out.println("Earnings: " + employee2.earnings());
        System.out.println("=".repeat(50));
    }
}
