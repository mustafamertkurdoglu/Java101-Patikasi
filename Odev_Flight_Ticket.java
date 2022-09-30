import java.util.Scanner;

public class Odev_Flight_Ticket {
    public static void main(String[] args) {
        int age, type, km;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age:");
        age = input.nextInt();
        System.out.print("Please enter flight km:");
        km = input.nextInt();
        System.out.print("Please enter your flight type. 1-One-way , 2-Round :");
        type = input.nextInt();

        if (km < 1 || age < 0) {
            System.out.println("You have entered incorrect  value");
        } else switch (type) {
            case 1:

                if (age > 0 && age <= 12) {
                    price = (km * 0.1) * (0.5);
                    System.out.print("Flight price is " + price);
                } else if (age > 12 && age <= 24) {
                    price = (km * 0.1) * (0.9);
                    System.out.print("Flight price is " + price);
                } else if (age >= 65) {
                    price = (km * 0.1) * (0.7);
                    System.out.print("Flight price is " + price);
                } else {
                    price = (km * 0.1);
                    System.out.print("Flight price is " + price);
                }
                break;

            case 2:
                if (age <= 12) {
                    price = 2 * (km * 0.1) * (0.5) * (0.8);
                    System.out.print("Flight price is " + price);
                } else if (age > 12 && age <= 24) {
                    price = 2 * (km * 0.1) * (0.9) * (0.8);
                    System.out.print("Flight price is " + price);
                } else if (age >= 65) {
                    price = 2 * (km * 0.1) * (0.7) * (0.8);
                    System.out.print("Flight price is " + price);
                } else {
                    price = 2 * (km * 0.1) * (0.8);
                    System.out.print("Flight price is " + price);
                }

                break;

            default:
                System.out.print("You have selected incorrect flight type");
        }
    }
}
