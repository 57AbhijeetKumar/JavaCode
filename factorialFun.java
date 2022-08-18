import java.util.Scanner;

public class factorialFun {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorail = 1;
        for (int i=n;i>=1;i--){
            factorail = factorail*i;
        }
        System.out.println(factorail);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
