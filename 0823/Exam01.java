package assignment;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("직사각형의 가로 길이 : ");
            double width = scanner.nextDouble();
            System.out.print("직사각형의 세로 길이 : ");
            double length = scanner.nextDouble();
            System.out.printf("직사각형의 넓이는 %.1fcm입니다. ", width * length);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
