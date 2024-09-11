public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Beras", 13000);
        Product product2 = new Product("Gula", 15000);
        Product product3 = new Product("Minyak", 17000);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayCart();

        cart.checkout();
    }
}
