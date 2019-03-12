package sk.ormFramework.simpleormframework.dbaccess;

import java.io.InputStream;

public class PropertiesReader {
    // finalne premenne na nacitavanie dat z Databazy
    public static final String DB_URL = "db.url";
    public static final String DB_DRIVER = "db.driver";
    public static final String DB_USER = "db.user";
    public static final String DB_PSW = "db.psw";

    public String getProperty(String property) throws Exception{
        String filename = "sorm.properties";
        // sorm je konfiguracny subor
        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;
        input = getClass().getClassLoader().getResourceAsStream(filename);
        if (input == null) {
            throw new Exception("Could not find sorm.properties file");
        }

        prop.load(input);

        String propertyValue = prop.getProperty(property);
        if (propertyValue != null && !propertyValue.isEmpty()) {
            return propertyValue;
        } else {
            throw new Exception("property '"+property+"' not specified in sorm.properties file");
        }
    }
    }


