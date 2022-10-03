import java.util.Scanner;

public class Find_Odd {
    public static void main(String[] args) {
        int k, total = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Enter a number :");
            k = inp.nextInt();
            if (k % 4 == 0) {
                total += k;

            }
        } while ((k % 2 == 0) );
        System.out.println("Total Odd Number :" + total);

    }
}
