
import java.util.Scanner;

public class App {
    public static boolean hasDifferentConstructor(Object obj1, Object obj2) {
        return obj1.getClass() != obj2.getClass();
    }

    public static void displayProducts(Product[] products) {
        for (Product product : products) {
            product.display();
            System.out.println("*****************");

        }
    }

    public static void displayModifiedProducts(Product[] products) {
        for (Product product : products) {
            if (product.label.equals("Milk") || product.label.equals("Yogurt"))
                product.display();

        }
    }

    public static void main(String[] args) throws Exception {
        Product prod = new Product();
        Product prod1 = new Product(1021, "Milk", "Delight"); // Price is not initalized so It will display 0 by default
        Product prod2 = new Product(2510, "Yogurt", "Vitalait"); // Price is not initalized so It will display 0 by
                                                                 // default
        Product prod3 = new Product(3250, "Tomato", "Sicam", 1.200);
        Product[] products = new Product[3];
        products[0] = prod1;
        products[1] = prod2;
        products[2] = prod3;
        System.out.println("Products we have so far:\n******************");
        displayProducts(products);
        // Assign 0.700 price to Milk specifically
        int i = 0;
        while (i < products.length) {
            if (products[i].label.equals("Milk")) {
                System.out.println("Modified products:\n ");
                products[i].price = 0.700;
                products[i].display();
            }
            i++;
        }
        try ( // Completing the missing information for each product (Yogurt)
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the price of the missing product: ");
            double priceOfProduct = scanner.nextDouble();
            for (Product product : products) {
                if (product.label.equals("Yogurt")) {
                    product.price = priceOfProduct;
                    break;
                }
            }

            // Display each product
            System.out.println("Products we have so far:\n*****************");
            displayProducts(products);
            displayModifiedProducts(products);
            System.out.println("H");
            for (Product product : products) {
                // display different address : Each object has been allocated to a memory space
                System.out.println(product.toString());
            }
        }

    }
}
