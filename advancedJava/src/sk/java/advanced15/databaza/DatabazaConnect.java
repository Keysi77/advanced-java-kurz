package sk.java.advanced15.databaza;

import java.sql.*;

public class DatabazaConnect {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String user = "jaro";
        String password = "heslo123";
        String host = "localhost";
        String port = "3306";
        String dbName = "databasename";
        Connection connection = null;
        Statement st = null;

        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/databasename?characterEncoding=UTF-8", user, password);
            // aby sa necommitovalo automaticky (bude mozne vratit data spat)
            connection.setAutoCommit(false);
            // STATEMENT - pre jendoduche SQL prikazy - SELECT * FROM meno;
            connection.createStatement();
            // Result set vracia data ktore sa nachadzaju v DV
            ResultSet rs = st.executeQuery("SELECT * FROM Osoba");

            // PREPAREDSTATEMENT - pre parametrizovane SQL prikazy INSERT INTO meno (meno, vek, datum...) VALUES (?,?,?....)
            //                   - zabrani utoky zvonka, aby sa nezistili udaje ktore vkladame do DB

            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO Osoba (Meno, Vek, Datum_Narodenia) VALUES (?,?,?)");

            preparedStatement.setString(1, "Jaro");
            preparedStatement.setInt(2,30);
            preparedStatement.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
            preparedStatement.executeQuery();

            // vypis pomocou cyklu while
            while (rs.next()){
                String meno = rs.getString(1);
                int vek = rs.getInt("AGE");
            }
            // treba uzavriet statement aj connection
            connection.commit(); // ak nič nepadlo tak potvrdit zmeny pomocou commit();

        } catch (SQLException e) {
            try {
                connection.rollback(); // ak padne nejaky SQL prikaz tak sa zmeny vratia pomocou rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // je jedno čo sa stane vzdy sa zavrie statement aj connection
            if(st != null)
            st.close();
            connection.close();
        }

    }
}
