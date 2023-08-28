public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String securityNumber;
    protected SavingAccount savingAccount;

    public abstract double earnings();

    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        securityNumber = ssn;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public Card getCard() {
        return (DebitCard) savingAccount.getCard();
    }

    public String getSecurityNumber() {
        String[] newString = securityNumber.split("-");
        return "xxx-xxx-" + newString[2];
    }

    public String toString() {
        return String.format("employee: %s %s\nsocial security number: %s",
                firstName, lastName, securityNumber);
    }

}