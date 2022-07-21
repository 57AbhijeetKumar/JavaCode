import java.util.Scanner;

public class circumference {
    public static double circumference(int radius){
        double circum = 2*3.14*radius;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        int radius = sc.nextInt();
        double result = circumference(radius);

        System.out.println("Circumference of circle is "+result);
    }
}
