class Parent1{
    String Fname;
    int age;
}

class Child1 extends Parent1{
    String name;
    int amount;
}

public class Inheritance1 {

    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        Child1 c1 = new Child1();
        c1.name = "Abhijeet";
        c1.amount = 5000;
        c1.Fname = "Ashok SIngh";
        c1.age = 24;
        System.out.println("Name "+c1.name +" Father name "+c1.Fname+" Age "+c1.age+" AMount "+c1.amount);
    }
}
