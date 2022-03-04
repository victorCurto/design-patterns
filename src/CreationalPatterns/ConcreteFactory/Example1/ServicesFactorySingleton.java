package CreationalPatterns.ConcreteFactory.Example1;

import CreationalPatterns.ConcreteFactory.Example1.TypesOfAdapter.IAccountingAdapter;
import CreationalPatterns.ConcreteFactory.Example1.TypesOfAdapter.IIventoryAdapter;
import CreationalPatterns.ConcreteFactory.Example1.TypesOfAdapter.ITaxCalculatorAdapter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//Applying UML and Patterns) chapter 26 - Applying GoF Design Patterns - Factory (pag 441)
public class ServicesFactorySingleton {

    private static IAccountingAdapter accountingAdapter;
    private static IIventoryAdapter iventoryAdapter;
    private static ITaxCalculatorAdapter taxCalculatorAdapter;

    public IAccountingAdapter getAccountingAdapter() {
        return accountingAdapter;
    }

    public IIventoryAdapter getIventoryAdapter() {
        return iventoryAdapter;
    }

    public static ITaxCalculatorAdapter getTaxCalculatorAdapter() {
        if(taxCalculatorAdapter == null){
            //a reflective or data-driven approach to finding the right class: read it from an external property
            try (InputStream input = new FileInputStream("src/CreationalPatterns/ConcreteFactory/Example1/factory.properties")) {
                Properties prop = new Properties();
                // load a properties file
                prop.load(input);

                String className = prop.getProperty("taxcalculator.name");
                taxCalculatorAdapter = (ITaxCalculatorAdapter) Class.forName(className).getDeclaredConstructor().newInstance();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return taxCalculatorAdapter;
    }
}
