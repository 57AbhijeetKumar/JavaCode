import java.util.Scanner;

public class fabonciiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for Faboncii Series");
        int num = sc.nextInt();
        int a = -1;
        int b = 1;
        int c;
        for (int i=0;i<num;i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
