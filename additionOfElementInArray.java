import java.util.Scanner;

public class additionOfElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target Element");
        int target = sc.nextInt();
        for (int i=0;;){
            for (int j=i+1;j<size;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(i+ " "+ j);
                }
            }
            break;
        }
    }
}
