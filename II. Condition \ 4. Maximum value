import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);\

        //Input a, b and c
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        //Assign the maximum value equal to a
        int max = a;

        //Filter the case where 3 identical numbers are entered
        if (a == b && b == c) {
            System.out.println("Re-enter 3 different integers");
        }

        //Compare with b and c to find the maximum value
        if (max < b) {
            max = b;
        } 
        if ( max < c) {
            max = c;
        }
        System.out.println("The largest number is: " + max);
    }
}
