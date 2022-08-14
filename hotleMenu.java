import java.util.Scanner;

public class hotleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, choice;
        System.out.println("Please Choose From Menu");
        System.out.println("1:-Morning");
        System.out.println("2:-After Noon");
        System.out.println("3:-Evening");
        x = sc.nextInt();
        if (x == 1) {
            System.out.println("Good Morning! Please Choose the Breakfast in the below menu");
            System.out.println("1:- Kathauri Chole");
            System.out.println("2:- Pasta");
            System.out.println("3:- Poha");
            System.out.println("4:- Tea Bread");
            System.out.println("5:- Fruits");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You Have Ordered for Katchauri Chole");
                    break;
                case 2:
                    System.out.println("You Have Ordered for Pasta");
                    break;
                case 3:
                    System.out.println("You Have Ordered for Poha");
                    break;
                case 4:
                    System.out.println("You Have Ordered for Tea Bread");
                    break;
                case 5:
                    System.out.println("You Have Ordered for Fruits");
                    break;
                default:
                    System.out.println("You Have Entered Invalid Choice....Thank You Visit Again");
            }
        }
        if (x == 2) {
            System.out.println("Good Afternoon! Please Choose the Lunch in the below menu");
            System.out.println("1:- Chaval Daal Sbzi");
            System.out.println("2:- Roti Sbzi");
            System.out.println("3:- Paneer with Fried Rice");
            System.out.println("4:- Chicken with fried rice");
            System.out.println("5:- Mutton with fried rice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You Have Ordered for Chaval Daal Sbzi");
                    break;
                case 2:
                    System.out.println("You Have Ordered for Roti Sbzi");
                    break;
                case 3:
                    System.out.println("You Have Ordered for Paneer with Fried Rice");
                    break;
                case 4:
                    System.out.println("You Have Ordered for Chicken with fried rice");
                    break;
                case 5:
                    System.out.println("You Have Ordered for Mutton with fried rice");
                    break;
                default:
                    System.out.println("You Have Entered Invalid Choice....Thank You Visit Again");

            }
        }
            if (x == 3) {
                System.out.println("Good Evening! Please Choose the Dinner in the below menu");
                System.out.println("1:- Puri Sbzi with fried rice");
                System.out.println("2:- Veg Biryani");
                System.out.println("3:- Paneer chilli");
                System.out.println("4:- Chicken Biryani");
                System.out.println("5:- Mutton Biryani");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You Have Ordered for Puri Sbzi with fried rice");
                        break;
                    case 2:
                        System.out.println("You Have Ordered for Veg Biryani");
                        break;
                    case 3:
                        System.out.println("You Have Ordered for Paneer chilli");
                        break;
                    case 4:
                        System.out.println("You Have Ordered for Chicken Biryani");
                        break;
                    case 5:
                        System.out.println("You Have Ordered for Mutton Biryani");
                        break;
                    default:
                        System.out.println("You Have Entered Invalid Choice....Thank You Visit Again");

                }
            }
        }
    }

