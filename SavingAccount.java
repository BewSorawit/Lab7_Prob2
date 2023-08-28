public class SavingAccount extends BaseAccount {

    private double amount;
    private Card card;
    private Employee employee;

    public SavingAccount(Employee employee) {
        this.employee = employee;
        this.card = new DebitCard(this);
        this.employee.setSavingAccount(this);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    public Card getCard() {
        return (DebitCard)card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
