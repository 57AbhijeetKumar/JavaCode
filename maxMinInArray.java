import java.util.Scanner;

public class maxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter elements in array");
        int array[] = new int[size];
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i=0;i<size;i++){
            if (array[i]>max) {
                max = array[i];
            }
        }
        int min = array[0];
        for (int i=0;i<size;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Maximum element in array is "+max);
        System.out.println("Minimum element in array is "+min);
    }
}
