import java.util.Scanner;

public class lcmOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b?a:b;
        for (int i=max;i<=a*b;i++){
            if (a%i==0 && b%i==0){
                System.out.println("LCM of "+a +" and "+b +" is "+i);
            }
            break;
        }
    }
}
