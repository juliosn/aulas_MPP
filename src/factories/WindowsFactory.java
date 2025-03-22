package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 * A classe WindowsFactory é uma implementação concreta de GUIFactory.
 * Ela cria instâncias dos componentes específicos do Windows.
 */
public class WindowsFactory implements GUIFactory {

    /**
     * Cria e retorna um botão específico para Windows.
     * @return Uma instância de WindowsButton.
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * Cria e retorna uma caixa de seleção específica para Windows.
     * @return Uma instância de WindowsCheckbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
