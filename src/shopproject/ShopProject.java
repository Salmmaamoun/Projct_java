
package shopproject;


public class ShopProject {

    public static void main(String[] args) {
       Product p1 = new Product("Lenovo", "ggjjkx", 13000, 30, 3);
        Product p2 = new Product("Hp", "ssdd", 12000, 20, 2);
        Product p3 = new Product("Apple", "ssaerv", 9000, 10, 3);
        Product p4 = new Product("Dell", "sllxuuaasdd", 10000, 50, 1);
        ShoppingCart sc = new ShoppingCart();
        Vistior v1 = new Vistior("salma", "allam@gmail.com", sc);
        Vistior v2 = new Vistior("mohmed", "mam123@gmail.com", sc);

        sc.add(p1);
        sc.add(p2);
        sc.add(p3);
        System.out.println(sc.Products);
        System.out.println("Total price: " + sc.getTotal());
        System.out.println("Total price after discount: " + sc.getTotalAfterDiscount());
        sc.remove("Hp");
        System.out.println(sc.Products);
        sc.add(p4);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        WebSite ws = new WebSite();
        ws.add(p1);
        ws.add(p4);
        ws.add(v1);
        ws.add(v2);
        System.out.println(ws.getProducts());
        System.out.println(ws.getVisitors());
        ws.removeProduct("app");
        ws.searchByName("salma");
        ws.searchByName("menna");
        ws.searchByPrice(13000);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Finished");
    }
    
}
