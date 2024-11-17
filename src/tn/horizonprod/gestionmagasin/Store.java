import tn.horizonprod.gestionproducts.*;

public class Store {
    long id;
    String address;
    int storeCapacity;
    private Product[] products;

    public Store(int id, String address, int storeCapacity, Product[] products) {

        if (checkCapacityProducts(storeCapacity)) {
            this.id = id;
            this.address = address;
            this.storeCapacity = storeCapacity;
            this.products = products;
        } else {
            if (storeCapacity < 0)
                System.out.printf("Sorry, %d is negative ! ", storeCapacity);
            else
                System.out.printf("Sorry %d exceeds 50 , we cannot store more than that !", storeCapacity);

        }

    }

    private boolean checkCapacityProducts(int numProducts) {
        return numProducts > 0 && numProducts <= 50;
    }

    public void displayProducts() {
        for (Product product : products) {
            product.display();
        }
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public Product[] getProducts() {
        return products;
    }

}
