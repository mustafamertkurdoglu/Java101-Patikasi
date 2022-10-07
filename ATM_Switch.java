import java.util.Scanner;

public class ATM_Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int balance = 15000;
        int amount;
        int select;
        int right = 3;
        String userName, password;
        while (right > 0) {
            System.out.println("Enter Your UserName:");
            userName = inp.nextLine();
            System.out.println("Enter Your Password:");
            password = inp.nextLine();

            if (userName.equals("javaATM") && (password.equals("1234"))) {
                System.out.println("Wellcome to Mert Bank");
                do {
                    System.out.println("1-Deposit\n" + "2-Withdraw\n" + "3-Balance\n" + "4-Exit");
                    System.out.println("Please make your selection:");
                    select = inp.nextInt();
                    switch (select) {

                        case 1:
                            System.out.println("Please enter deposit amount:");
                            amount = inp.nextInt();
                            balance += amount;
                            System.out.println("Your New Balance : " + balance + "  USD");
                            break;

                        case 2:
                            System.out.println("Please enter withdrawal amount:");
                            amount = inp.nextInt();
                            if (balance > amount) {
                                balance -= amount;
                                System.out.println("Your New Balance : " + balance + "  USD");
                            } else {
                                System.out.println("Your account balance is not avaliable for withdrawal");
                                System.out.println("Your New Balance : " + balance + "  USD");
                            }
                            break;

                        case 3:
                            System.out.println("Your Balance : " + balance + "  USD");
                            break;

                        case 4:
                        default:
                    }
                    System.out.println("See you again");
                } while (select != 4);
            } else {
                right--;
                System.out.println("You have entered invalid username or password.\n" + "Your remaining right :" + right);
            }
            if (right == 0) {
                System.out.println("Your account is blocked. PLease reach your bank CR");
            }
        }
    }
}


