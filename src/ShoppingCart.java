import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        System.out.println("Keranjang Belanja:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void checkout() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.printf("Jumlah total yang harus dibayar: Rp%d \n", total);
        products.clear();
    }
}
