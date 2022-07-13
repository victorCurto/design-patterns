package CreationalPatterns.FactoryMethod.Example2.factory;

import CreationalPatterns.FactoryMethod.Example2.products.Button;
import CreationalPatterns.FactoryMethod.Example2.products.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}