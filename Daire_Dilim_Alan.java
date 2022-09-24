import java.util.Scanner;

public class Daire_Dilim_Alan {
    public static void main(String[] args) {
        double r, pi=3.14, a ;

        //Formulas :
        // Alan = pi*r*r
        // Çevre = 2*pi*r
        // Alan = (pi*r*r*a)/360

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz :" );
        r = inp.nextDouble();
        System.out.print("Merkez açı değerini giriniz :" );
        a = inp.nextDouble();

        double alan = (pi*r*r*a)/360;

        System.out.println("Dairenin Diliminin Alanı :" +alan);
        double cevre = 2*pi*r;
        System.out.println("Dairenin Çevresi : " +cevre);

    }
}
