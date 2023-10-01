import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap n
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //Cau dieu kien de tim so duong, am hay so 0
        if (n > 0) {
            System.out.println("This is a positive integer.");
        } else if (n < 0) {
            System.out.println("This is a negative integer.");
        } else {
            System.out.println("This is zero.");
        }
    }
}
