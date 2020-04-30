package chap09;

public class Sample08 {

    public static void main(String[] args) {
        // Oracle에 접속합니다.
        Database db1 = new OracleDatabase();
        db1.getConnection();       //DB에 접속한다
        System.out.println(db1.getDbInfo());

        // MS-SQL에 접속합니다.
        Database db2 = new MsDatabase();
        System.out.println(db2.getDbInfo());
    }

}

interface Database {	
    public void getConnection();

    public String getDbInfo();
}

class OracleDatabase implements Database {

    boolean conn = false;

    @Override
    public void getConnection() {
        this.conn = true;
    }

    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "Oracle에 접속되었습니다.";
        else     ret = "Oracle에 접속되지 않았습니다.";
        return ret;
    }

}

class MsDatabase implements Database {

    boolean conn = false;

    @Override
    public void getConnection() {
        this.conn = true;
    }

    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "MS-SQL에 접속되었습니다.";
        else     ret = "MS-SQL에 접속되지 않았습니다.";
        return ret;
    }

}
