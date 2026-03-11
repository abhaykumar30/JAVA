package Intro;
class Mobile{
    int price;
    static String brand;        //Static Variable

    //static block
    static{
        brand = "Phone";
        System.out.println("Static block");

    }

    Mobile(){
        price = 5000;
        System.out.println("Constructor block");

    }

    public void show(){
        System.out.println("price: "  + price + " Brand: " + brand);
    }


    //Static Method
    // static void show1(Mobile obj){
    //     System.out.println("Inside the static Method");
    //     System.out.println("price: "  + obj.price + " Brand: " + brand);
    // }

}

public class Ststic {
    public static void main(String a[]){
        Mobile obj = new Mobile();
        // obj.price = 10000;
        // Mobile.brand = "Soni";

        // Mobile obj1 = new Mobile();
        // obj1.price = 12000;
        // Mobile.brand = "Apple";

        obj.show();


        // //Static Method
        // Mobile.show1(obj);
    }
}
