import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1;
        int n2;
        int s;
        int b;

        int i = 1;
        int k = 1;
        System.out.print("Enter n1 value:");
        n1 = inp.nextInt();
        System.out.print("Enter n2 value:");
        n2 = inp.nextInt();

        // Using "While" for solution:

        if (n1<n2){
         s = n1;
         b = n2;
        }else {
            b = n1;
            s = n2;
        }
        while (k <=n1*n2) {

            if ((k % n1 == 0) && (k % n2 == 0)) {

                System.out.println("EKOK: " + k);
                break;

            } else { k++;}
        }
        i=s;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("EBOB :" + i);
                break;

            } else {
                i--;}
            }


        }
    }



        /*Using "For" for solution:

            for (int i = 1; i <= n1; i++) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
            }
            System.out.println("EBOB :" + ebob);
            for (int k = 1; k <= (n1 * n2); k++) {
                if ((k % n1 == 0) && (k % n2 == 0)) {
                    System.out.println("EKOK: " + k);
                    break;
                }
            }
        */


