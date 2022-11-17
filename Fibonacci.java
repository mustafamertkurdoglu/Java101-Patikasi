import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("PLease Enter A Number:");
        int n = inp.nextInt();
        int i;
        int a = 0;
        int b = 1;
        int f;
        System.out.print(a + " " +b +" ");
        for (i =2 ;  i<=n ; i++){
            f =a+b;
            a=b;
            b=f;
            System.out.print(f + " ");

        }



    }
}
