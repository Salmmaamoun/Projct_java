package shopproject;

import java.util.ArrayList;
import java.util.Iterator;

public class WebSite {

    private ArrayList<Product> products;
    private ArrayList<Vistior> visitors;

    public WebSite() {
        products = new ArrayList<Product>();
        visitors = new ArrayList<Vistior>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Vistior> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Vistior> visitors) {
        this.visitors = visitors;
    }

    public void add(Vistior vistor) {
        visitors.add(vistor);

    }

    public void add(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {

     if (products.isEmpty()) {
            System.out.println("The website is empty");
            return;
        }

        int index = this.products.indexOf(this.searchByName(productName));

        if (index == -1) {
            System.out.println("product is not found");
            return;
        }

        Product isRemoved = this.products.remove(index);

        System.out.println(isRemoved.getName() + " is removed from website");

    }

    public Product searchByName(String Name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(Name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> searchByPrice(double price) {
        ArrayList<Product> pro = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() == price) {
                pro.add(product);
            }
        }
        return pro;

    }
    public static void main(String[] args) {
        ArrayList<String> q=new ArrayList<>();
        q.remove(0);
        
    }
}
