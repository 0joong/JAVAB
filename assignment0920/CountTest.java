package assignment0920;

public class CountTest {

    public static void main(String[] args){
        CountableInterface[] ci = {new Bird("뻐꾸기", 5), new Bird("독수리", 2)
                , new Tree("사과나무", 10), new Tree("밤나무", 7)};

        for(CountableInterface i : ci) {
            i.count();
            if(i instanceof Bird) {
                ((Bird) i).fly();
            } else if(i instanceof Tree) {
                ((Tree) i).ripen();
            }
        }
    }
}
