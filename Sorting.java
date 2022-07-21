import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        int temp=0;
        System.out.println("Enter five numbers in the Array");
        for (int i=0;i<5;i++){
            number[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5-i-1;j++){
                if (number[i]>number[i+1]){
                    temp = number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        }
        System.out.println("Numbers after Sorting");
        for (int i=0;i<5;i++){
            System.out.println(number[i]);
        }
    }
}
