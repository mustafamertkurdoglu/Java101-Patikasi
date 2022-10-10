import java.util.Scanner;

public class Odev_Perfect_Number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int i;
        int total = 0;
        System.out.print("Enter A Number :");
        n = inp.nextInt();
        if (n > 0) {
            for (i = 1; i < n; i++) {
                if (n % i == 0) {
                    total += i;

                }
            }
            if (total == n) {
                System.out.println(n + " is a perfect number");
            } else {
                System.out.println(n + " is not a perfect number");
            }
        } else {
            System.out.println(" Please enter a positive number");
        }
    }
}

