package io.github.heltonricardo.creational_patterns.singleton.connectionPool.conn;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Object query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
        return null;
    }
}
