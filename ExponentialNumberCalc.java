import java.util.Scanner;

public class ExponentialNumberCalc {
    public static void main(String[] args) {
        int n, k;
        int total = 1;
        int i ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number:");
        n = inp.nextInt();
        System.out.print("Enter Exponential Number:");
        k = inp.nextInt();
        if (k>0) {
            for (i = 1; i <= k; i++) {
                total *= n;
            } System.out.print(n + " exponent of " + k + " = " + total);
        } else {
            System.out.print("Exponent number must be greater than 0");
        }

    }
}
