package sk.java.advanced15.databaza;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesReader {
    // z properties vycita udaje o pripojeni k DB a pomocou finalnych premennych ich budeme pouzivat
    public static final String ORACLE_HOST= "oracledb.host";
    public static final String ORACLE_PORT= "oracledb.port";
    public static final String ORACLE_DB_NAME= "oracledb.dbname";
    public static final String ORACLE_USER= "oracledb.user";
    public static final String ORACLE_PSW= "oracledb.psw";

    public String getProperty(String property){
        String filename = "application.properties";
        String propertyValue = "";
        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;

        try{
            input = getClass().getClassLoader().getResourceAsStream(filename);
            if (input == null){ // ak sa nenajde subor application.properties
                return "Sorry, unable to find "+ filename;
            }

            prop.load(input);

            propertyValue = prop.getProperty(property);
            if (propertyValue != null && !propertyValue.isEmpty()){
                return propertyValue;
            }else{
                return null;

            }
        }catch (FileNotFoundException ex){
            // log chyba
        }catch (IOException ex){
            // log chyba
        }
        return propertyValue;
    }
}
