import java.util.Scanner;

public class HackerRank2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        n = input.nextInt();
        if (n >= 1 && n <= 100) {
            if ((n % 2 == 0) && (n <= 5 && n >= 2)) {
                System.out.print("Not Weird");
            } else if ((n % 2 == 0) && (n <= 20 && n >= 6)) {
                System.out.print("Weird");
            } else if ((n % 2 == 0) && (n > 20)) {
                System.out.print("Not Weird");
            } else if ((n % 2 == 1) && (n<=100)){
                System.out.print("Weird");
            }
        } else {
            System.out.print("Please enter a numeric value between 1 to 100");
        }

    }
}
