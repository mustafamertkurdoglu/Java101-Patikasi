import java.util.Scanner;

public class Vucut_Kitle_Ind {
    public static void main(String[] args) {
      // Formula VKI = kg/boy (m)* boy (m)
        double kg, m , vki;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz :");
        kg = inp.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        m = inp.nextDouble();

        vki = kg/(m*m);
        System.out.print("Vucut kitle indeksiniz :" + vki);

    }
}
