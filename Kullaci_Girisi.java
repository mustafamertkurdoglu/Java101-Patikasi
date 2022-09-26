import java.util.Scanner;

public class Kullaci_Girisi {
    public static void main(String[] args) {
        String username, password, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:" );
        username = inp.nextLine();
        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (username.equals("patika")&& password.equals("java123")) {
            System.out.print("Giriş Yaptınız!");
        }
        else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? Yes/No: ");
            select = inp.nextLine();
            if (select.equals("Yes")) {
                System.out.println("Yeni şifrenizi belirleyiniz.Yeni  şifreniniz hatalı girdiğiniz veya unuttuğunuz şifre ile aynı olmamalı.");
                System.out.print("Yeni Şifreniz :");
                password = inp.nextLine();
                if (password.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else {
                    System.out.print("Yeni şifreniz oluşturuldu!");
                }
            }
            else {
                System.out.print("Şifre Yenilenemedi");

            }
        }



    }
}
