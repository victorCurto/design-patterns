package CreationalPatterns.AbstractFactory.Example3.factories;

import CreationalPatterns.AbstractFactory.Example3.products.Button;
import CreationalPatterns.AbstractFactory.Example3.products.Checkbox;
import CreationalPatterns.AbstractFactory.Example3.products.MacOSButton;
import CreationalPatterns.AbstractFactory.Example3.products.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}