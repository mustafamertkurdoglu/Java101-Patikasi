import java.util.Scanner;
public class Chinese_Zodiac {
    public static void main(String[] args) {
        int a,year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth  :");
        year = input.nextInt();
        a =  year%12;
        switch (a) {
            case 0:
                System.out.print("Your Chinese Zodiac : Monkey");
                break;
            case 1:
                System.out.print("Your Chinese Zodiac :  Hen");
                break;

            case 2:
                System.out.print("Your Chinese Zodiac : Dog");
                break;
            case 3:
                System.out.print("Your Chinese Zodiac :  Pig");
                break;
            case 4:
                System.out.print("Your Chinese Zodiac : Rat");
                break;
            case 5:
                System.out.print("Your Chinese Zodiac :  Ox");
                break;

            case 6:
                System.out.print("Your Chinese Zodiac : Tiger");
                break;
            case 7:
                System.out.print("Your Chinese Zodiac :  Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiac : Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiac :  Snake");
                break;

            case 10:
                System.out.print("Your Chinese Zodiac : Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiac :  Sheep");
            default :
                System.out.print("You have entered wrong value");

        }

    }
}

