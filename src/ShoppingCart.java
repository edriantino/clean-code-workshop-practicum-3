import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a shopping cart for the online store.
 */
public class ShoppingCart {
    private final List<Product> products;

    /**
     * Constructor to initialize the shopping cart.
     */
    public ShoppingCart() {
        products = new ArrayList<>();
    }

    /**
     * Adds a product to the shopping cart.
     * @param product The product to be added.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Displays the items in the shopping cart.
     */
    public void displayCart() {
        System.out.println("Keranjang Belanja:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Checks out the shopping cart and displays the total price.
     */
    public void checkout() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.printf("Jumlah total yang harus dibayar: Rp%d \n", total);
        products.clear();
    }
}
