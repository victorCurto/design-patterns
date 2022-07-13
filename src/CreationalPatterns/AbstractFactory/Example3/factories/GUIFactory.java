package CreationalPatterns.AbstractFactory.Example3.factories;

import CreationalPatterns.AbstractFactory.Example3.products.Button;
import CreationalPatterns.AbstractFactory.Example3.products.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
