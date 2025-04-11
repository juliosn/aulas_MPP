package factorymethod.example.factory;

import factorymethod.example.buttons.Button;
import factorymethod.example.buttons.WindowsButton;

/**
 * A caixa de diálogo Windows produzirá botões em Windows. Utilizando o classe de fábrica padrão.
 */
public class WindowsDialog extends Dialog {

    // Sobrescrita do método para criar um botão Windows específico para esta caixa de diálogo
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}