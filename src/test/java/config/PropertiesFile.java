package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
    /*
    https://www.youtube.com/watch?v=1GeVbi1uj_8&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=19
    /What is a properties file
Properties file is a file with .properties as extension
Is used in Java (and related technologies) to store configurable parameters
Parameters as stored as key:value pairs (key=value)
example:
browser=firefox
How to create a properties file
Create a new file inside your java project and name it with .properties extension.
example config.properties
How to get data from properties file
Step 1
Create a object of class Properties class
private static Properties prop = new Properties();
Step 2
Create a object of class InputStream
InputStream input = new FileInputStream("location of properties file");
Step 3
Load Properties file
prop.load(input);
Step 4
Get values from Properties file
prop.getProperty("browser");
     */

    //declaring the objects so they can be used at the global level
    static String projectPath = System.getProperty("user.dir");
    static Properties prop = new Properties();

    public static void main(String[] args) {
        getProperties();
        setProperties();
    }

    public static void getProperties() {
        try {
            InputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
            prop.load(input);
            System.out.print(prop.getProperty("browser"));

        } catch (Exception exp) {
            System.out.print(exp.getMessage());
            System.out.print(exp.getCause());
            exp.printStackTrace();
        }
    }
    // Setting method to override the properties file
    public static void setProperties() {
        try {
            OutputStream output = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
            prop.setProperty("browser","chrome");
            prop.store(output,"overriding the the property file");//overriding the properties file

        } catch (Exception exp) {
            System.out.print(exp.getMessage());
            System.out.print(exp.getCause());
            exp.printStackTrace();
        }
    }
}