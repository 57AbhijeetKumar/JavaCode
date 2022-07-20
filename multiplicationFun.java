import java.util.Scanner;

public class multiplicationFun {
    public static int multiplication(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        System.out.println("Enter two number");
        int mul;
        mul = multiplication();
        System.out.println("Multiplication of these number is "+mul);
    }
}
