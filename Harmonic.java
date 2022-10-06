import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number :");
        double n = inp.nextDouble();
        double total = 0;
        double i = 1;
        while (i <= n) {
            total += (1 / i);
            i++;
        }
        System.out.print(total);
    }
}
