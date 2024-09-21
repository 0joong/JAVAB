package assignment0913;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("원의 반지름 : ");
        c.radius = scanner.nextDouble();
        System.out.printf("반지름이 %.2f인 원의 넓이는 %.2f입니다.", c.radius, c.getArea());

    }
}
