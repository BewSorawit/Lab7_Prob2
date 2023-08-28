public class FixedSalary extends Employee {

    private double salary;

    public FixedSalary(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        this.salary = salary;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double earnings() {
        return salary;
    }

    @Override
    public String toString() {
        return "Fixed salary " + super.toString() + "\nmonthly salary: $" + salary;
    }
  
}
