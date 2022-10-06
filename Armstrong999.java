
public class Armstrong999 {
    public static void main(String[] args) {
        int number;
        int tempNumber;
        int basValue;
        int basPow;
        int i;
        int basNumber ;
        int total ;
        for (number = 1; number <= 999; number++) {
            basNumber = 0;
            total =0;
            tempNumber = number;
            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                total += basPow;
                tempNumber /= 10;

            }if (number == total) {
                System.out.println("Total :" + total);

            }
        }
    }
}

