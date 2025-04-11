package factorymethod.example.factory;

import factorymethod.example.buttons.Button;
import factorymethod.example.buttons.HtmlButton;

/**
 * A caixa de diálogo HTML produzirá botões em HTML. Utilizando o classe de fábrica padrão.
 */
public class HtmlDialog extends Dialog {

    // Sobrescrita do método para criar um botão HTML específico para esta caixa de diálogo
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}