import java.util.Scanner;

public class Find_Even {
    public static void main(String[] args) {
        int k, total=0, a=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        k = inp.nextInt();

        for (int i =0; i<=k ;  i++) {
            if ((i % 3 == 0)&&(i%4==0)) {
                System.out.println(i + ",");
                total += i;
                 a++;
            }

        } System.out.println("count :" + a);
        System.out.println("Total :" + total);
        System.out.println("Average :"  + (total/a));

    }
}






