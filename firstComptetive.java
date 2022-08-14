import java.util.Scanner;

public class firstComptetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of Array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element in Array");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.println("Enter target value");
        target = sc.nextInt();
        int sum=0;
        for (int i=0;i<size;i++){
            if (arr[i]+arr[i+1] == target){
                System.out.println(i+" "+ (i+1));
            }
//            sum = sum+arr[i];
        }
//        System.out.println(sum);
    }
}
