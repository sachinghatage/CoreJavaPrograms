package numberPrograms;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        int balance=10000,withdraw,deposit;
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Choose operation you want to perform");

            int choice=scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter money to be withdrawn");
                    withdraw= scan.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("please collect your money");
                    }else{
                        System.out.println("Insufficient fund");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("enter money to be deposited");
                    deposit= scan.nextInt();
                    balance=balance+deposit;
                    System.out.println("money successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("balance "+balance);
                    System.out.println("");
                    break;


                case 4:
                    System.exit(0);
            }
        }
    }
}
