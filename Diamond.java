import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = inp.nextInt();
        int k ;

        for (int i = 1; i <= n; i++) {
            for (k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * i) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; (i <= n)&&(i>0); i--) {
            for (k = 1; k <= (n - i); k++) {
                System.out.print(" ");}
            for (int z = 2*i-1; (z <= (2 * i)-1)&&((z>0) ); z--) {
                System.out.print("*");
            } System.out.println();
        }


    }

}
