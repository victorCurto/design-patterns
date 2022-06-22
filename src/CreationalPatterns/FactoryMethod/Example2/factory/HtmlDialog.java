package CreationalPatterns.FactoryMethod.Example2.factory;

import CreationalPatterns.FactoryMethod.Example2.buttons.Button;
import CreationalPatterns.FactoryMethod.Example2.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}