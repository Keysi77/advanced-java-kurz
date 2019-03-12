package sk.java.advanced15.databaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao {
    // pre pripojenie k databaze abstraktna trieda Dao
    private Connection connection = null;
    private PropertiesReader propertiesReader = new PropertiesReader();

    Dao() throws SQLException{
        String user = propertiesReader.getProperty(PropertiesReader.ORACLE_USER);
        String psw = propertiesReader.getProperty(PropertiesReader.ORACLE_PSW);
        connect(user,psw);
    }

    // metoda na pripojenie na databazu
    private void connect(String usr, String psw) throws SQLException {
        // pre Oracle Driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        connection = DriverManager.getConnection(getConnectionUrl(), usr, psw);

        if (connection!= null){
            connection.setAutoCommit(false);
        }else{
            throw new SQLException("Connection is null"); // ak sa nevytvori pripojenie
        }
    }

    private String getConnectionUrl() {
        String host = propertiesReader.getProperty(PropertiesReader.ORACLE_HOST);
        String port = propertiesReader.getProperty(PropertiesReader.ORACLE_PORT);
        String dbname = propertiesReader.getProperty(PropertiesReader.ORACLE_DB_NAME);

        return String.format("jdbc:oracle:thin:@%s:%s:%s", host, port, dbname);

    }

    // metody pre databazu

    public void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
           // LOG.err.println("Can not close connection", e);
        }
    }

    public void commit(){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollBack(){
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }


}
