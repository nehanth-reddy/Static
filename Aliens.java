
class Human
{
    private int age;
    private String name;
  
    public Human()
    {
        System.out.println("in constructor");
    }
  
  
  
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

}

public class Aliens 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human();

        // obj.setAge(13);
        // obj.setName("Nehanth");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
