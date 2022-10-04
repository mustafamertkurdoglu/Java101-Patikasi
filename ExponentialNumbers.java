import java.util.Scanner;

public class  ExponentialNumbers {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number :");
        n = inp.nextInt();
        System.out.println("Exp. Number of 4 :");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Exp. Number of 5 :");
        for ( int i = 1; i <= n; i *= 5) {
            System.out.println(i);
            }

        }
    }







