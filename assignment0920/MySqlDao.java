package assignment0920;

public class MySqlDao implements DataAccessObject{

    public void select() {
        System.out.println("MySQL DB에서 검색");
    }

    public void update() {
        System.out.println("MySQL DB를 수정");
    }

    public void delete() {
        System.out.println("MySQL DB에서 삭제");
    }

    public void insert() {
        System.out.println("MySQL DB에 삽입");
    }

}
