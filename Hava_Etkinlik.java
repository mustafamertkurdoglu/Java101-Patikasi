import java.util.Scanner;

public class Hava_Etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık değeri ? :");
        heat = inp.nextInt();

        if (heat <= 5) {
            System.out.print("Kayak yapabilirsin");}
        if (heat > 5 && heat <= 10) {
            System.out.print("Sinemaya gidebilirsin");}
        if (heat>10&&heat<15) {
            System.out.println("Sinemaya gidebilirsin");
            System.out.print("Pikniğe gidebilirsin");
        }
        if (heat>15&&heat<25) {System.out.print("Pikniğe gidebilirsin");}
        if (heat >= 25) {System.out.print("Yüzmeye gidebilirsin");}
        }
    }
