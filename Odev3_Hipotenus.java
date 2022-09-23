
import java.util.Scanner;

public class Odev3_Hipotenus {
    public static void main(String[] args) {
        // Değişkenleri oluşturduk
        double a , b, c, u, alan ;

        //Scanner tanımladık
        Scanner inp= new Scanner(System.in);
        // Kullanıcı değerlerini al

        System.out.print("a kenarı uzunluğu :" );
        a = inp.nextDouble();
        System.out.print("b kenarı uzunluğu :" );
        b = inp.nextDouble();
        System.out.print("c kenarı uzunluğu :" );
        c = inp.nextDouble();
        // Formüller
        // üçgenin çevresi=2u
        // alan*alan= u*(u-a)(u-b)(u-c)
        // u = (a+b+c)/2

        u = (a+b+c)/2;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.print("Üçgenin alanı :" + alan);
    }
}
