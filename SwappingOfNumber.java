import java.util.Scanner;

public class SwappingOfNumber {

    public static void Swap(){
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int rev = 0;
        System.out.print("Number before Swapping is "+x);
        System.out.println(" and "+y);
        rev = x;
        x = y;
        y = rev;
        System.out.print("Number after Swapping is "+x);
        System.out.println(" and "+y);
    }
    public static void main(String[] args) {

        Swap();
    }
}
