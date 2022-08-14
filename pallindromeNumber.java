import java.util.Scanner;

public class pallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int n = num;
        int sum = 0,rev;
        while (num!=0){
            rev = num%10;
            sum = sum*10+rev;
            num = num/10;
        }
        if (n == sum){
            System.out.println(n +" is Pallindrome Number");
        }
        else{
            System.out.println(n+" is not a Pallindrome Number");
        }
    }
}
