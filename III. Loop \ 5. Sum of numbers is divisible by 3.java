import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //Input a and b
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        //Create variable su,
        int sum = 0;

        //Calculate the sum of the numbers
        for (int i = a; i <= b; i++) {

           //Find the numbers is divisible by 3
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }

        //Print screen
        System.out.print("The sum of odd numbers form 0 to n is: " + sum);
    }
}
