package info.helton.creational_patterns.singleton.connectionPool;

import info.helton.creational_patterns.singleton.connectionPool.conn.Connection;
import info.helton.creational_patterns.singleton.connectionPool.conn.ConnectionPool;

public class ClientSingleton {

    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A1");
            pool.leaveConnection(conn);
        }
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void doQuery4() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A4");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
        doQuery4();
    }
}
