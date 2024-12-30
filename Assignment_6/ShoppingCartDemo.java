package Assignment_6;

public class ShoppingCartDemo {

    static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "ID=" + id +
                    ", Name='" + name + '\'' +
                    ", Price=" + price +
                    '}';
        }
    }

    // ShoppingCart Class
    static class ShoppingCart {
        private Product[] cart;
        private int itemCount;

        public ShoppingCart(int capacity) {
            cart = new Product[capacity];
            itemCount = 0;
        }

        // Add product to cart
        public void addProduct(Product product) {
            if (itemCount < cart.length) {
                cart[itemCount++] = product;
                System.out.println(product.getName() + " has been added to the cart.");
            } else {
                System.out.println("The cart is full. Cannot add more products.");
            }
        }

        // Remove product from cart
        public void removeProduct(int productId) {
            boolean found = false;
            for (int i = 0; i < itemCount; i++) {
                if (cart[i].getId() == productId) {
                    found = true;
                    System.out.println(cart[i].getName() + " has been removed from the cart.");
                    // Shift elements to fill the gap
                    for (int j = i; j < itemCount - 1; j++) {
                        cart[j] = cart[j + 1];
                    }
                    cart[--itemCount] = null; // Clear the last slot
                    break;
                }
            }
            if (!found) {
                System.out.println("Product with ID " + productId + " not found in the cart.");
            }
        }

        // View all products in the cart
        public void viewCart() {
            if (itemCount == 0) {
                System.out.println("The cart is empty.");
            } else {
                System.out.println("Products in the cart:");
                for (int i = 0; i < itemCount; i++) {
                    System.out.println(cart[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);
        Product product3 = new Product(3, "Headphones", 79.99);

        // Create a shopping cart with a fixed capacity
        ShoppingCart cart = new ShoppingCart(5);

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);

        // View cart
        cart.viewCart();

        // Remove a product
        cart.removeProduct(2);

        // View cart again
        cart.viewCart();

        // Attempt to remove a non-existent product
        cart.removeProduct(5);

        // Add another product
        cart.addProduct(product3);

        // View cart
        cart.viewCart();
    }
}
