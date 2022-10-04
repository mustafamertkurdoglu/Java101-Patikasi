import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n;
        int r;
        int i;
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;
        // C(n,r)=n!/(r!*(n-r)!)
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter First Set :");
        n = inp.nextInt();
        System.out.print("Enter Second Set :");
        r = inp.nextInt();
        if (n >= r) {
            for (i = 1; i <= n; i++) {
                total1 = total1 * i;
            }
            System.out.println(n + ". Factorial Total :" + total1);

            for (i = 1; i <= r; i++) {
                total2 = total2 * i;
            }
            System.out.println(r + ". Factorial Total :" + total2);
            for (i = 1; i <= (n - r); i++) {
                total3 = total3 * i;
            }
            System.out.println((n - r) + ". Factorial Total :" + total3);
            System.out.println("C(n,r)= " + (total1 / (total2 * total3)));
        } else {
            System.out.print("First set number must be greater than second set");
        }
    }
}
