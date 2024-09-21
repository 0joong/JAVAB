package assignment0920;

public class Bird implements CountableInterface{

    String name;
    int num;

    public Bird(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void count() {
        System.out.println(name + "가 " + num + "마리 있다.");
    }

    public void fly() {
        System.out.printf("%d마리 %s가 날아간다.\n", num, name);
    }
}
