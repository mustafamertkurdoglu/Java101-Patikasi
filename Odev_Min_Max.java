import java.util.Scanner;

public class Odev_Min_Max {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int i;
        int b = 1, s = 1;

        System.out.print("How many numbers will you enter? : ");
        n = inp.nextInt();
        for ( i=1; i<=n ; i++){
        System.out.print( "Enter "  + i +". number:");
           int m = inp.nextInt();
           if  (i == 1 ) {
               b = m;
               s = m;

           }
           if (m > b ) {
               b = m;
           }
           if ( m<s) {
               s = m;
           }

           }
        System.out.println("Max Number is :" + b + "\nMin Number is :" +s);
           }





    }

