package chap18;

import java.io.IOException;

public class Test1_1 {

    public static void main(String[] args) {
        // Oracle DB 생성
        Database db1 = new OracleDatabase();
        // MS-SQL DB 생성
        Database db2 = new MsDatabase();
        try {
            db1.getConnection();       //DB에 접속한다
            System.out.println(db1.getDbInfo());
            System.out.println(db2.getDbInfo());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                db1.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }

}

interface Database {
    public void getConnection() throws IOException;

    public String getDbInfo();
    
    public void close() throws Exception;
}

class OracleDatabase implements Database, AutoCloseable {

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

    public void close() throws Exception {
        this.conn = false;
        System.out.println("Oracle에 접속을 끊었습니다.");
    }

}

class MsDatabase implements Database, AutoCloseable {

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

    public void close() throws Exception {
        this.conn = false;
        System.out.println("MS-SQL에 접속을 끊었습니다.");
    }

}
