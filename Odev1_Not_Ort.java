import java.util.Scanner;

public class Odev1_Not_Ort {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int turkce, mat, fizik, kimya, muzik, tarih;
        //Scanner sınıfımızı tanımladık
        Scanner inp =new Scanner (System.in);
        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        int toplam =(mat + tarih + muzik + kimya + fizik +turkce );
        double sonuc = toplam /6.0;
        System.out.print("Ortalamanız : " + sonuc);
        boolean kosul1 = sonuc>= 60;
        System.out.println(kosul1 ? " Sınıfı Geçti" :" sınıfta Kaldı");




    }
}
