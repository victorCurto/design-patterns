package CreationalPatterns.FactoryMethod.Example2.factory;

import CreationalPatterns.FactoryMethod.Example2.products.Button;
import CreationalPatterns.FactoryMethod.Example2.products.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}