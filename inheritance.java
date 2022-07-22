class Parent{
    String name;
    int age;
    public void printName(){
        System.out.println(name + " " + age);
        System.out.println("You are elligible for voting");
    }
}
class Child extends Parent{
    String caste;
    public void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(caste);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.name = "Abhijeet Singh";
        p1.age = 24;
        p1.printName();
        Child c1 = new Child();
        c1.name = "Avi Singh";
        c1.age = 28;
        c1.caste = "Rajput";
        c1.printDetails();
    }
}
