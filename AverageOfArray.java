import java.util.Scanner;

public class AverageOfArray {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subjects are there");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter marks in array");
        for (int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<size;i++){
            sum = sum + marks[i];
        }
        int avg = sum/size;

        System.out.println("Sum of marks is "+sum);
        System.out.println("Average of marks is "+avg);
    }


    public static void main(String[] args) {
        input();
    }

}