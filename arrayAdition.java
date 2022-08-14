import java.util.Scanner;

public class arrayAdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];
        System.out.println("Enter elements in array");
        for (int i=0;i<6;i++){
            array[i] = sc.nextInt();
        }
        for (int i=0;i<6;i++){
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i=0;i<6;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of Array is "+sum);
    }
}