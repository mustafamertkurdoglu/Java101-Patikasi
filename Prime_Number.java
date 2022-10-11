import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number :");
        int n = inp.nextInt();
        int i ;
        int j ;

        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (j = 1; j <= n; j++) {
                if (i % j == 0) {
                    counter++;
                }


            }
            if (counter == 2) {
                System.out.print(i + " ");

            }

        }

    }
}



