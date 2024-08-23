package assignment;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args){
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요(cm): ");
        double radius = scanner.nextDouble();
        System.out.printf("원의 넓이는 %.2fcm입니다.", radius*radius*PI);
    }
}
