/**
 * Main class for the online store application.
 */
public class Main {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Create some products
        Product product1 = new Product("Bakso", 9000);
        Product product2 = new Product("Cilok", 2000);

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Display the cart summary
        cart.displayCart();

        // Checkout
        cart.checkout();
    }
}
