import java.util.Scanner;

public class OneDimentionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subject are there");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter marks in Array");
        for (int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks are");
        for (int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
