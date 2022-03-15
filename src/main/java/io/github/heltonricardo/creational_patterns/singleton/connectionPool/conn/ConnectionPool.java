package src.main.java.io.github.heltonricardo.creational_patterns.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private final static int POOL_SIZE = 2;
    private final List<Connection> connectionsPool;

    public ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for (Connection conn : connectionsPool) {
            if (!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }
        if (avaiable == null) {
            System.out.println("No Connections avaiable");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
