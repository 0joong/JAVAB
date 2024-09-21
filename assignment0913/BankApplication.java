package assignment0913;

import java.util.Scanner;

public class BankApplication {

    private Account[] Account = new Account[100];
    private int accountCnt = 0;

    public Account[] getAccount() {
        return Account;
    }

    public void setAccount(Account[] Account) {
        this.Account = Account;
    }

    public void generateAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("계좌주 : ");
        String accountName = scanner.nextLine();
        System.out.print("초기입금액 : ");
        int balance = scanner.nextInt();

        Account[accountCnt++] = new Account(accountNumber, accountName, balance);
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    public void deposit() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호 : ");
        String accountNum = scanner.nextLine();
        System.out.println("예금액 : ");
        int money = scanner.nextInt();

        for(int i = 0; i<accountCnt; i++) {
            if(Account[i].getAccountNumber().equals(accountNum)){
                Account[i].setBalance(Account[i].getBalance()+money);
            }
        }
    }
    public void withDraw() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호 : ");
        String accountNum = scanner.nextLine();
        System.out.println("출금액 : ");
        int money = scanner.nextInt();
        for(int i = 0; i<accountCnt; i++) {
            if(Account[i].getAccountNumber().equals(accountNum)){
                Account[i].setBalance(Account[i].getBalance()-money);
                System.out.println("출금이 성공되었습니다.");
            }
        }
    }

    public void showAccountList() {
        System.out.println("계좌목록");
        System.out.println("-----------------");
        for(int i = 0; i<accountCnt; i++) {
            System.out.printf("%10s %10s %10d\n", Account[i].getAccountNumber(), Account[i].getName(), Account[i].getBalance());
        }
    }
}
