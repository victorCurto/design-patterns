package CreationalPatterns.AbstractFactory.Example3.factories;

import CreationalPatterns.AbstractFactory.Example3.products.Button;
import CreationalPatterns.AbstractFactory.Example3.products.Checkbox;
import CreationalPatterns.AbstractFactory.Example3.products.WindowsButton;
import CreationalPatterns.AbstractFactory.Example3.products.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
