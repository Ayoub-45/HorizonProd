
import java.time.LocalDate;

public class Product {
    int id;
    String label;
    String brand;
    double price;

    LocalDate expirationDate;

    public Product() {

    }

    public Product(int id, String label, String brand, LocalDate expirationDate) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.expirationDate = expirationDate;

    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    public Product(int id, String label, String brand, double price) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.price = price;

    }

    public void display() {
        System.out.println("Product " + id + ":");
        System.out.println("label: " + label);
        System.out.println("brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("ExpirationDate: " + expirationDate);
    }
    // In case we want to display meaningful data about each object
    /*
     * 
     * @Override
     * public String toString() {
     * return "Product:{id:" + id + "\n label:" + label + "\nbrand:" + brand +
     * "\nprice:" + price + "}";
     * }
     */

}
