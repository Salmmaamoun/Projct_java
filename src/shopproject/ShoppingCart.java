package shopproject;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {

    ArrayList<Product> Products;

    public ShoppingCart() {
        Products = new ArrayList<Product>();
    }

    public void add(Product product) {
        Products.add(product);
    }

    public void remove(String productName) {

        Iterator<Product> itr = Products.iterator();
        while (itr.hasNext()) {
            Product num = itr.next();
            if (num.getName().equals(productName)) {
                itr.remove();
            }

        }

        System.out.println("Removed the Product !! " + productName);
    }

    public double getTotal() {
        double sum=0;
        for (Product Product1 : Products) {
            sum+=Product1.getPrice()*Product1.getQuantitty();
        }
        return sum;
                
    }

    public double getTotalAfterDiscount() {
        double sum = 0.0;
      
        for (int i = 0; i < Products.size(); i++) {
            sum +=( Products.get(i).getPrice()*Products.get(i).getDiscount()/100 ) * Products.get(i).getQuantitty();

        }
        return sum;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" + "Products=" + Products + '}';
    }

    
}
