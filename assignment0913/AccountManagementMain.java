package assignment0913;

import java.util.Scanner;

public class AccountManagementMain {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------");
        System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        BankApplication bank = new BankApplication();

        MAIN:
        while (true) {
            System.out.print("선택>");
            int menu = Integer.parseInt(scanner.nextLine());
            System.out.println("--------------------");

            switch (menu) {
                case 1 -> {
                    System.out.println("계좌생성");
                    System.out.println("---------------");
                    bank.generateAccount();
                }

                case 2 -> {
                    System.out.println("계좌목록");
                    System.out.println("---------------");
                    bank.showAccountList();
                }

                case 3 -> {
                    System.out.println("예금");
                    System.out.println("---------------");
                    bank.deposit();
                }

                case 4 -> {
                    System.out.println("출금");
                    System.out.println("---------------");
                    bank.withDraw();
                }

                case 5 -> {
                    System.out.println("프로그램 종료");
                    System.out.println("---------------");
                    break MAIN;

                }

                default -> {
                    System.out.println("다시 입력하세요");
                }


            }

        }
    }
}
