import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Değişkenler
        double KM, TutKM=2.20, TakAc = 10, Tutar ;

        //KM başına 2.20 TL
        //Min Tutar=20 TL
        //Taksimetre açılış = 10 TL

        //Scanner tanımladık
        Scanner girdi= new Scanner(System.in);
        //Kullanıcıı değerlerini al

        System.out.print("KM Giriniz :");
        KM = girdi.nextDouble();
        Tutar = TakAc + (KM*TutKM) ;
        Tutar = (Tutar<20) ? 20 : Tutar;

        System.out.print("Taksimetre Tutarı :" +Tutar );

    }
}
