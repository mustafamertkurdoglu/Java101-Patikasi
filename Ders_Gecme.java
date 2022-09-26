import java.util.Scanner;

public class Ders_Gecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, toplam=0, ders=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();
        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();
        if (mat <= 100 && mat > 0) {
            toplam = mat;
            ++ders;
        }

        if (fizik <= 100 && fizik > 0) {
            toplam = toplam + fizik;
            ++ders;
        }

        if (kimya <= 100 && kimya > 0) {
            toplam = toplam + kimya;
            ++ders;
        }

        if (muzik <= 100 && muzik > 0) {
            toplam = toplam + muzik;
            ++ders;
        }

        if (turkce <= 100 && turkce > 0) {
            toplam = toplam + turkce;
            ++ders;
        }

           double average;
        average = toplam /ders;

        if (average >= 55) {
                System.out.println("Sınıfı Geçtiniz");
            } else {
                System.out.println("Sınıfta Kaldınız. Yine bekleriz");

            }
            System.out.println("Ortalama Notunuz :" + average);

        }
    }



