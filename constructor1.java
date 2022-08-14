
class Student{
    String name;
    int age;
        public void printInfo(){
            System.out.println(name);
            System.out.println(age);
        }
        Student(){
            name = "Abhijeet";
            age = 24;
        }
}


public class constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo();
    }
}
