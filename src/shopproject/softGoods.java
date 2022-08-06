
package shopproject;


public class softGoods extends Product{
    private double size_in_MB;

    public softGoods(double size_in_MB, String name, String discription, double price, double discount, int quantitty) {
        super(name, discription, price, discount, quantitty);
        this.size_in_MB = size_in_MB;
    }

    public double getSize_in_MB() {
        return size_in_MB;
    }

    public void setSize_in_MB(double size_in_MB) {
        this.size_in_MB = size_in_MB;
    }

    @Override
    public String toString() {
        return "softGoods{" + "size_in_MB=" + size_in_MB + '}';
    }
    
    
}
