package com.company;

import java.util.Scanner;

public class Ques3 {

    String account;
    int balance;
    int acc_num;
    int bal;

    public void withdraw() {

        Scanner a = new Scanner(System.in);

        System.out.println("How much you want to withdraw?");
        int wd = a.nextInt();

        System.out.println("Final Balance: " + (wd - bal));

    }

    public void deposit() {

        Scanner a = new Scanner(System.in);

        System.out.println("How much you want to deposit?");
        int de = a.nextInt();

        System.out.println("Final Balance: " + (bal + de));

    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Initial Bal?");
        int bal = a.nextInt();

        if (bal < 0) {
            System.out.println("Error!!");
        }

        System.out.println("Withdraw or deposit? (1/2)");
        int in = a.nextInt();

        switch (in) {

            case 1: {
                if (bal == 0) {
                    System.out.println("You cannot withdraw any money!!");
                } else {
                    Ques3 obj = new Ques3();
                    obj.withdraw();
                    break;
                }
            }

            case 2: {
                if (bal > 0) {
                    Ques3 obj = new Ques3();
                    obj.deposit();
                    break;
                }
            }
        }


    }
}


