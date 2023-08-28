public class HourlySalary extends Employee{

    private double hour;
    private double work;

    public HourlySalary(String first, String last, String ssn,double hour, double work) {
        super(first, last, ssn);
        this.hour = hour;
        this.work = work;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double earnings() {
        return hour * work;
    }

    @Override
    public String toString() {
        return "Hourly salary "+super.toString()+"\nhourly pay: $"+hour+"; hours worked: "+work;
    }
    
    
}
