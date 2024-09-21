package assignment0913;

public class CatTest {

    public static void main(String[] args) {

        Cat cat = new Cat("코숏", "노랑", 10);

        System.out.println(cat);
        cat.eat("아침");
        cat.meow();
        cat.scratch();
    }
}
