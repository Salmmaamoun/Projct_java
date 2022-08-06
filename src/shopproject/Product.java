
package shopproject;


public class Product {
   private String name;
   private String discription;
   private double price;
   private double discount;
   private int quantitty;

    public Product(String name, String discription, double price, double discount, int quantitty) {
        this.name = name;
        this.discription = discription;
        this.price = price;
        this.discount = discount;
        this.quantitty = quantitty;
    }

    public int getQuantitty() {
        return quantitty;
    }

    public void setQuantitty(int quantitty) {
        this.quantitty = quantitty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", discription=" + discription + ", price=" + price + ", discount=" + discount + ", quantitty=" + quantitty + '}';
    }
   
}
