

class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Staticv
{
    public static void main(String a[])
    {
        Mobile obj1= new Mobile(); 
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2= new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";

        Mobile.name = "phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
