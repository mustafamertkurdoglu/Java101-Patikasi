import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = input.nextInt();
        if (month<1||month>12) {
            System.out.println("Hatalı ay  girişi yaptınız");
        }
        System.out.print("Doğduğunuz gün :");
        day = input.nextInt();
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }

        if (month == 2) {
            if (day >= 1 && day < 29) {
                if (day < 21) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 3) {
            if (day >= 1 && day < 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Balık");
                } else {
                    System.out.println("Burcunuz Koç");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 4) {
            if (day >= 1 && day < 30) {
                if (day < 21) {
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }

        if (month == 5) {
            if (day >= 1 && day < 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 6) {
            if (day >= 1 && day < 30) {
                if (day < 21) {
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 7) {
            if (day >= 1 && day < 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Arslan");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 8) {
            if (day >= 1 && day < 30) {
                if (day < 21) {
                    System.out.println("Burcunuz Arslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 9) {
            if (day >= 1 && day < 30) {
                if (day < 21) {
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 10) {
            if (day >= 1 && day < 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }

        if (month == 11) {
            if (day >= 1 && day < 30) {
                if (day < 21) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }
        if (month == 12) {
            if (day >= 1 && day < 31) {
                if (day < 21) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else  {
                System.out.print("Hatalı gün girişi yaptınız");
            }
        }

        }

    }






