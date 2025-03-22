package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 * A classe MacOSFactory é uma implementação concreta de GUIFactory.
 * Ela cria instâncias dos componentes específicos do MacOS.
 */
public class MacOSFactory implements GUIFactory {

    /**
     * Cria e retorna um botão específico para MacOS.
     * @return Uma instância de MacOSButton.
     */
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    /**
     * Cria e retorna uma caixa de seleção específica para MacOS.
     * @return Uma instância de MacOSCheckbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
