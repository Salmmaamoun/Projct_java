package shopproject;

public class Vistior {

    String Name;
    String email;
    ShoppingCart cart;

    public Vistior(String Name, String email, ShoppingCart cart) {
        this.Name = Name;
        this.email = email;
        this.cart = cart;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Vistior{" + "Name=" + Name + ", email=" + email + ", cart=" + cart + '}';
    }

}
