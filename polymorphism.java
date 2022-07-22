class student{
    int age;
    String name;
        public void printName(String name){
            System.out.println(name);
        }
        public void printName(int age){
            System.out.println(age);
        }
        public void printName(String name,int age){
            System.out.println(name + " " + age);
        }
}

public class polymorphism {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Abhijeet";
        s1.age = 20;
        s1.printName(s1.name);
        s1.printName(s1.age);
        s1.printName(s1.name,s1.age);
    }
}
