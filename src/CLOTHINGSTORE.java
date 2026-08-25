import java.util.*;
abstract class Product {
    private int productID;
    private String productName;
    private double productPrice;

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getproductPrice() {
        return productPrice;
    }

    public abstract double calculateDiscount();
}
class Electronics extends Product {
    Electronics(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }

    double disc;

    public double calculateDiscount() {
        double j = getproductPrice();
        disc = j * (10 / 100);
        return disc;
    }

    public double finalPrice() {
        double j = getproductPrice();
        double finalp = j - disc;
        return finalp;
    }
}
class Clothing extends Product {
    Clothing(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }

    double disc;

    public double calculateDiscount() {
        double j = getproductPrice();
        disc = j * (20 / 100);
        return disc;
    }

    public double finalPrice() {
        double j = getproductPrice();
        double finalp = j - disc;
        return finalp;
    }
}
class Grocery extends Product {
    Grocery(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }

    double disc;

    public double calculateDiscount() {
        double j = getproductPrice();
        disc = j * (5 / 100);
        return disc;
    }

    public double finalPrice() {
        double j = getproductPrice();
        double finalp = j - disc;
        return finalp;
    }
}





    public class CLOTHINGSTORE {
    public static void main(String[] args)
    {

    }
}
