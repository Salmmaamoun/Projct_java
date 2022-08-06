
package shopproject;


public class HardGoods extends Product{
    private String delivery_adress;

    public HardGoods(String delivery_adress, String name, String discription, double price, double discount, int quantitty) {
        super(name, discription, price, discount, quantitty);
        this.delivery_adress = delivery_adress;
    }

    public String getDelivery_adress() {
        return delivery_adress;
    }

    public void setDelivery_adress(String delivery_adress) {
        this.delivery_adress = delivery_adress;
    }

    @Override
    public String toString() {
        return "HardGoods{" + "delivery_adress=" + delivery_adress + '}';
    }
    
    
}
