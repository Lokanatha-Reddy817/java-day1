class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}
public class St {
    public static void main(String[]args){
        Mobile mb =new Mobile();
        mb.brand="vivo";
        mb.price=22000;
        Mobile.name="smartphone";
        mb.show();
    }
}
