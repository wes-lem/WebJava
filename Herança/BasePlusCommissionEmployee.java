public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0)
            throw new IllegalArgumentException("baseSalary deve ser >= 0");
        
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("baseSalary deve ser >= 0");
        
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","comission employee", getFirstName(), getLastName(),"social security number", getSocialSecurityNumber(),"gross sales",getGrossSales(), "comission rate", getCommissionRate(), "base salary", getBaseSalary());
    }
}
