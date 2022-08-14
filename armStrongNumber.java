import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int n = num;
        int sum=0, rev;
        while (num!=0){
            rev = num%10;
            sum = sum + (rev*rev*rev);
            num = num/10;
        }
        if(n==sum){
            System.out.println(n +" is Armstrong number");
        }
        else{
            System.out.println(n +" is not Armstrong number");
        }
    }
}
