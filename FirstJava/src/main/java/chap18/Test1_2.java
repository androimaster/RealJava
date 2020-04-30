package chap18;

public class Test1_2 {

    public static void main(String[] args) {
        try(OracleDatabase db1 = new OracleDatabase();
            MsDatabase     db2 = new MsDatabase()) {
            db1.getConnection();       //DB에 접속한다
            System.out.println(db1.getDbInfo());
            System.out.println(db2.getDbInfo());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}