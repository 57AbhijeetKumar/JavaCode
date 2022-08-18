import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int temp[] = new int[size];
        System.out.println("Enter elements in Array");
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number from which the have to divide");
        int num = sc.nextInt();
        for (int i=(num-1);i<size;i++){
            for (int j=0;j<size;j++){
                temp[j] = arr[i];
            }
        }
        for (int i=0;i<size;i++){
            System.out.println(temp[i]);
        }
    }
}
