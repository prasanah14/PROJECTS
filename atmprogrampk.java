import java.util.*;

public class Main {
    static Scanner s = new Scanner(System.in);
    static int balance = 10000;
    static String admin1 = "prasanah";
    static String admin2 = "kumar";
    static String admin3 = "anyone";
    static int pin = 5678;
    static int pass = 1234;
    static int l[] = new int[4];

    public static void Admin() {
        // System.out.print("\033[H\033[2Jm");
        System.out.println("********************Welcome to Admin************************");
        System.out.println("1.Load amount");
        System.out.println("2.Check balance");
        System.out.println("3.Logout admin");
        int r = s.nextInt();
        switch (r) {
            case 1:
                System.out.println("Enter 2000 rupee notes : ");
                int q = s.nextInt();
                System.out.println("Enter 500 rupee notes : ");
                int w = s.nextInt();
                System.out.println("Enter 200 rupee notes : ");
                int x = s.nextInt();
                System.out.println("Enter 100 rupee notes : ");
                int y = s.nextInt();
                int i = q * 2000;
                int j = w * 500;
                int k = x * 200;
                int l = y * 100;
                System.out.println("Number of 2000s = " + i);
                System.out.println("Number of 500s = " + j);
                System.out.println("Number of 200s = " + k);
                System.out.println("Number of 100s = " + l);
                int m = i + j + k + l;
                System.out.println("Amount loaded sucessfully!...");
                System.out.println("Total amount has been debited in ATM Machine : " + m);
                int n = balance + m;
                System.out.println("ATM Machine's total balance is : " + n);
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Current Balance:" + balance);
                System.out.println("Enter 0 to continue:");
                break;
            case 3:
                // System.out.print("\033[H\033[2J");
                System.out.println("Exit successfully...");
                break;
            default:
                System.out.println("Enter an Valid option");
        }

    }

    public static void user() {
        // System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("Welcome User");
        System.out.println();
        System.out.println("1.Withdraw amount");
        System.out.println("2.Deposit");
        System.out.println("3.Pin Change");
        System.out.println("4.Mini Statement");
        System.out.println("5.Amount Transfer");
        System.out.println("6.Exit");
        int u = s.nextInt();
        switch (u) {
            case 1:
                System.out.print("Enter withdraw amount : ");
                int i = s.nextInt();
                if (i > balance) {
                    System.out.println("Amount unavailable please enter less amount!!");
                    System.out.println("Available amount in card is :" + balance);
                } else {
                    System.out.println("Your card balance amount is : " + (balance - i));
                    System.out.println("Your amount has been processed \n Please wait and take it");
                    System.out.println("Thank you for using ATM");
                    System.out.println("***********************************");
                }
                break;
            case 2:
                System.out.println("Enter amount to be deposit : ");
                int g = s.nextInt();
                System.out.println("Amount deposited sucessfully...");
                System.out.println("Current Balance is : " + (balance + g));
                System.out.println("Enter 0 to continue : ");
                break;
            case 3:
                System.out.println("Enter your current pin to change : ");
                int o = s.nextInt();
                o = pin;
                System.out.println("Enter new pin to change : ");
                int z = s.nextInt();
                System.out.println("Pin changed sucessfully!...");
                break;
            case 4:
                System.out.println("Mini Statement! ");
                int r = s.nextInt();
                for (int t = 0; t < r; t++) {
                    System.out.println(t);
                }
                break;
            case 5:
                System.out.println("Enter the amount to transfer : ");
                break;
            case 6:
                // System.out.print("\033[H\033[2J");
                System.out.println("Exit successfully!..................");
                break;
            default:
                System.out.println("Enter an Valid option");
        }

    }

    public static void main(String[] args) {
        System.out.println("---------------WELCOME TO ATM MACHINE-------------");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("3.Exit");
        System.out.println("Enter Choice : ");
        int d = s.nextInt();
        switch (d) {
            case 1:
                System.out.println("Enter your Username : ");
                String a = s.next();
                s.nextLine();
                System.out.println("Enter your Password : ");
                int p = s.nextInt();
                if (a.equals(admin1) || a.equals(admin2) || a.equals(admin3) && p == pass) {
                    System.out.println("Logined Sucessfully!............");
                    System.out.println("Welcome " + a);
                    System.out.println("*************************");
                    Admin();
                    break;
                } else {
                    System.out.println("Username or Password is incorrect");
                }
                System.out.println("Enter 0 to continue:");
                break;
            case 2:
                user();
                break;
            case 3:
                // System.out.println("\033[H\033[2J");
                System.out.println("Exit successfully...");
                System.out.println("Thank you for using ATM");
                System.out.println("***********************************");
                break;
            default:
                System.out.println("Enter an Valid option");
        }
    }
}