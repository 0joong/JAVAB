package assignment;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("변수 a에 넣을 숫자 입력 : ");
            a = scanner.nextInt();
            System.out.print("변수 b에 넣을 숫자 입력 : ");
            b = scanner.nextInt();
            System.out.println("Swapping 결과 >");
            System.out.printf("변수 a의 값 = %d\n", b);
            System.out.printf("변수 b의 값 = %d", a);
        } catch (Exception e) {
            System.out.println("error~");
        }


    }
}
