import java.util.Scanner;

public class Odev_Artik_Yil {
    public static void main(String[] args) {
        int year, a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        year = input.nextInt();
        a = year % 4;
        b = year % 400;
        c = year % 100;
        System.out.println("Kalan :" + a);
        if (b == 0) {
            System.out.print(year + " artık yıldır.");
        } else if (c == 0)  {
            System.out.print(year + " artık yıl değildir.");
        }
        if ((c != 0) && (a == 0)) {
            System.out.print(year + " artık yıldır.");
        }
        if (a != 0) {
            System.out.print(year + " artık yıl değildir.");

        }
    }
}


