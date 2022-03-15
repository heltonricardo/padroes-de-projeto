package src.main.java.io.github.heltonricardo.creational_patterns.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConnectionPool {

    private final static int POOL_SIZE = 2;
    private final static ConnectionPool singleton = new ConnectionPool();

    private final List<Connection> connectionsPool;

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public static ConnectionPool getInstance() {
        return singleton;
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
