package assignment0920;

public class OracleDao implements DataAccessObject{

    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    public void update() {
        System.out.println("Oracle DB를 수정");
    }

    public void delete() {
        System.out.println("Oracle DB에서 삭제");
    }

    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }
}
