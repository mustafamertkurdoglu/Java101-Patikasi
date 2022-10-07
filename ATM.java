import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password, userName;
        int balance=1500;

        int right = 3;
        int select;
        while (right > 0) {

            System.out.println("Enter Your Username :");
            userName = inp.nextLine();
            System.out.println("Enter Your Password :");
            password = inp.nextLine();
            if (userName.equals("javaATM") && password.equals("12345")) {
                System.out.println("Welcome to Mert Bank");
                do {
                    System.out.println(
                            "1- Deposit;\n" +
                            "2- Withdraw;\n" +
                            "3- Balance Check;\n" +
                            "4- Exit;");
                    System.out.print("Please make your selection :");
                    select = inp.nextInt();
                    if (select==1){
                        System.out.print("Please enter the deposit amount : ");
                        int amount = inp.nextInt();
                        balance += amount;
                        System.out.println("Your New Balance :" + balance +"  USD");
                    } if (select==2){
                        System.out.print("Please enter the withdrawal amount : ");
                        int amount = inp.nextInt();
                        if (amount>balance) {
                            System.out.println("Your balance is not available");} else{
                        balance -= amount;
                        System.out.println("Your New Balance :" + balance +"  USD");}
                    } if (select==3) {
                        System.out.println("Your Balance :" + balance + "  USD");
                    }
                }while(select!=4);
                System.out.println("See you soon:)");
            } else {
                right--;
                if (right  > 0) {
                System.out.println("You have entered invalid password or username.\n" +
                        "Remaining right :" + right  +
                        " \nPlease try again\n");

                }
                if (right  == 0) {
                    System.out.println("You have entered invalid password or username 3 times.");
                    System.out.println("Your account is blocked. Please reach your bank CR");
                }
            }
    }
    }}
