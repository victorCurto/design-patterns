package CreationalPatterns.AbstractFactory.Example2.factories;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ShapeFactorySingleton{

    private static IShapeFactory instance = null;

    public static IShapeFactory getInstance(){
        if(instance == null){
            //a reflective or data-driven approach to finding the right class: read it from an external property
            try (InputStream input = new FileInputStream("src/CreationalPatterns/AbstractFactory/Example2/factory.properties")) {
                Properties prop = new Properties();
                // load a properties file
                prop.load(input);

                String factoryClassName = prop.getProperty("shapeFactory.classname");
                instance = (IShapeFactory) Class.forName(factoryClassName).getDeclaredConstructor().newInstance();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return instance;
    }

}
