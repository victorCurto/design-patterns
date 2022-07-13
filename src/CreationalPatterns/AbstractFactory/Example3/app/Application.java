package CreationalPatterns.AbstractFactory.Example3.app;

import CreationalPatterns.AbstractFactory.Example3.factories.GUIFactory;
import CreationalPatterns.AbstractFactory.Example3.products.Button;
import CreationalPatterns.AbstractFactory.Example3.products.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}