import java.util.Scanner;

public class sumOfNumberUsingFun {
    public static int sumOfDigits(int num1,int num2){
        int num3 = num1+num2;
        return num3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sumOfDigits(num1,num2);
        System.out.println("Sum is "+num3);
    }
}
