public class Milk extends Product {

    private int volumn;

    public Milk(int price) {
        super("Milk", price);
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", amount=" + amount + ", volumn=" + volumn + "]";
    }

}