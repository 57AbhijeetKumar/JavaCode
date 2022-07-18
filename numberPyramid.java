public class numberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0;i<=n;i++){
            // Printing Spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // Printing number
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
