package CreationalPatterns.FactoryMethod.Example2.factory;

import CreationalPatterns.FactoryMethod.Example2.buttons.Button;
import CreationalPatterns.FactoryMethod.Example2.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}