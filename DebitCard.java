public class DebitCard extends Card {
    private SavingAccount savingAccount;

    public DebitCard(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= savingAccount.getAmount()) {
            savingAccount.withdraw(amount);
            return true;
        }
        return false;
    }

    @Override
    public String type() {
        return "Visa";
    }

    @Override
    public double discount() {
        return 2.5;
    }

    public Employee getEmployee() {
        return savingAccount.getEmployee();
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

}
