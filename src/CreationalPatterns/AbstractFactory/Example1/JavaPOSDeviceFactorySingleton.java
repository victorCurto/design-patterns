package CreationalPatterns.AbstractFactory.Example1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

// the abstract factory !!!
public abstract class JavaPOSDeviceFactorySingleton implements IJavaPOSDeviceFactory{

    private static IJavaPOSDeviceFactory instance;

    public static synchronized IJavaPOSDeviceFactory getInstance(){
        if(instance == null){
            //a reflective or data-driven approach to finding the right class: read it from an external property
            try (InputStream input = new FileInputStream("src/CreationalPatterns/AbstractFactory/Example1/factory.properties")) {
                Properties prop = new Properties();
                // load a properties file
                prop.load(input);

                String factoryClassName = prop.getProperty("jposfactory.classname");
                instance = (IJavaPOSDeviceFactory) Class.forName(factoryClassName).getDeclaredConstructor().newInstance();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return instance;
    }
}
