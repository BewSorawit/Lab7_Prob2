public class InventoryCart {
    private int num;
    private Product[] products;
    private int index = 0;

    public InventoryCart(int num) {
        this.num = num;
        this.products = new Product[num];
    }

    public void addProduct(Product product) {
        if (index == 0) {
            this.products[index++] = product;
        } else {
            boolean chk = true;
            for (int i = 0; i < index; i++) {
                if (this.products[i].equals(product)) {
                    this.products[i].setAmount(this.products[i].getAmount() + 1);
                    index++;
                    chk = false;
                    break;
                }
            }
            if (chk) {
                this.products[index++] = product;
            }
        }
    }

    public void showAllProduct() {
        for (Product i : products) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public Product getProduct(int index) {
        return products[index];
    }

    public Product[] getAllProducts() {
        return products;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
