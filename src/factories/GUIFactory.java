package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * A interface GUIFactory define os métodos para criação dos componentes da interface (botões e caixas de seleção).
 * Ela é um exemplo do padrão de design Factory, onde uma fábrica abstrai a criação de objetos concretos.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
