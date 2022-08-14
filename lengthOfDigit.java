import java.util.Scanner;

public class lengthOfDigit {

    public int countDigit(int n){
        int count = 0;
        while (n!=0){
            n = n/10;
            count = count+1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int sizes = sc.nextInt();
        int array[] = new int[sizes];
        System.out.println("Enter element in array");
        for (int i=0;i<sizes;i++){
            array[i] = sc.nextInt();
        }
        int size = array.length;
        lengthOfDigit obj = new lengthOfDigit();
        for (int i=0;i<size;i++){
            int count = obj.countDigit(array[i]);
            System.out.println("The length of number "+array[i]+" is " +count);
        }
    }
}
