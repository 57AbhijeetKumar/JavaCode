import java.util.Scanner;

public class duplicacyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<size-1;i++){
            for (int j=i+1;j<=size;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element is "+arr[j]);
                }
            }

        }

    }
}
