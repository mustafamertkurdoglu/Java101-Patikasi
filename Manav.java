import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        // Meyveler ve Fiyatları:
        // Armut = 2.14
        // Elma = 3.67
        // Domates = 1.11
        // Muz = 0.95
        // Patlıcan = 5.00

        double armut, elma, domates, muz, patlican, toplam;

        // Kullanıcı değerlerini giriniz
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armut = inp.nextDouble();
        System.out.print("Elm kaç kilo ? :");

        elma = inp.nextDouble();
        System.out.print(" Domates kaç kilo ? :");
        domates = inp.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        muz =  inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        patlican = inp.nextDouble();
        toplam = (2.14*armut) + (3.67*elma) +(1.11*domates) + (0.95*muz) + (5*patlican) ;
        System.out.print("Toplam Tutar :" +toplam + "TL");



    }
}
