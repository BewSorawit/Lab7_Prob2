public class Cashier {
    private InventoryCart ic;
    private Card card;

    public void doPayment(InventoryCart ic, Card card) {
        this.ic = ic;
        this.card = (DebitCard) card;
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("\t\tCARD TYPE: " + card.type());
        System.out.println("\tCARD NUMBER: " + ((DebitCard) card).getEmployee().getSecurityNumber());
        System.out.println("\t\tpumpkin Shop");
        for (Product i : ic.getAllProducts()) {
            if (i != null) {
                System.out.println(
                        "\t" + i.getAmount() + " x " + i.getName() + "\t" + i.getPrice());
                total += i.getPrice() * i.getAmount();
            }
        }
        System.out.println("\t---------------");
        System.out.println("\tCARD DISCOUNT " + card.discount());
        total -= card.discount() / 100 * total;
        card.withdraw(total);
        System.out.println("\t\tTotal\t" + total + "$");
        System.out.println("SavingAccount = " + ((DebitCard) card).getSavingAccount().getAmount());
    }
}
