/**
 * Class representing a product in the online store.
 */
public class Product {
    private final String name;
    private final int price;

    /**
     * Constructor to initialize a product.
     * @param name The name of the product.
     * @param price The price of the product.
     */
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the product.
     * @return The product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the product.
     * @return The product price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the product.
     * @return A string in the format "Product Name: Price".
     */
    @Override
    public String toString() {
        return getName() + ": Rp" + price;
    }
}
