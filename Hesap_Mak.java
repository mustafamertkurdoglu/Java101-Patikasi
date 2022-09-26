import java.util.Scanner;


public class Hesap_Mak {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = inp.nextInt();
        System.out.println("1-Toplama : \n2-Çıkarma : \n3-Çarpma : \n4-Bölme :");
        System.out.print("Seçiminizi yapınız :");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Sonuç :" +(n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç : " +(n1-n2));
                break;
            case 3:
                System.out.print("Sonuç : " +(n1*n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Sonuç : " +(n1/n2));
                } else {
                    System.out.print("Bir sayı sıfıra bölünemez");
                }
                break;
            default:
                System.out.print("Hatalı seçim yaptınız. Tekrar deneyiniz");

        }
    }
}
