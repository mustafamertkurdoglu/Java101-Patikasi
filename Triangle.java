import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = inp.nextInt();
        int i;
        int k;
        int j;
        for (i =1; i<=n; i++){
            for (j=1; j<=i; j++){
                System.out.print(" ");}
            for (k=2*n+1; (k-2*i)>=1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }}

