import java.util.Scanner;

public class DigitNumbersTotal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = inp.nextInt();
        int basValue;
        int total = 0;


        System.out.println("Digit Values: ");
        while (number != 0) {

            basValue = number % 10;
            number /= 10;
            total += basValue;
            System.out.println(basValue);

        }
        System.out.print("Total of Digit Values: " + total);

    }
}
