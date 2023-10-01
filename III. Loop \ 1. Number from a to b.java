import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //Input a and b
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        //Filter the case where a is greater than b
        if (a > b) {
            System.out.println("a must be less than b");
        } else {
            System.out.print("The numbers form a to b are: ");

            //Print the numbers from a to b
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
