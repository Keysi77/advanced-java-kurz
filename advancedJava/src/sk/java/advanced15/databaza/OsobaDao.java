package sk.java.advanced15.databaza;


import sk.java.advanced01.Osoba;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OsobaDao extends Dao {
    public OsobaDao() throws SQLException{
        super();
    }

    public long create(Osoba osoba)throws Exception{
        long id = -1L;
        PreparedStatement preparedStatement = null;
        try {
            String[] generatedId = {"ID"}; // pole IDečiek
            preparedStatement = getConnection().prepareStatement("INSERT INTO Osoba(MENO, VEK, DATUM_NARODENIA) VALUES (?,?,?)");
            preparedStatement.setString(1, osoba.getName());
            preparedStatement.setInt(2, osoba.getAge());
            preparedStatement.setDate(3, new java.sql.Date(osoba.getDatumNarodenia().getTime()));
            preparedStatement.executeQuery();

            try(ResultSet generatedColumn = preparedStatement.getGeneratedKeys() ) {
                if (generatedColumn.next()){
                    id = generatedColumn.getLong(1);
                }else{
                    throw new SQLException("Nevratilo sa ziadne ID");
                }

            }
        }catch (Exception e){

            throw new Exception(e);
        }finally {
            try{
                if (preparedStatement!=null)
                    preparedStatement.close();
            }catch (SQLException e){
                System.err.println("chyba");
            }
        }
        return id;
    }

    public static void main(String[] args) {
        OsobaDao dao = null;
        try{
            dao = new OsobaDao();
            long id = dao.create(null);
            dao.commit();
        }catch (Exception e){
            if (dao!= null)
            dao.rollBack();
        }finally {
            if (dao!= null)
                dao.disconnect();
        }
    }
}
