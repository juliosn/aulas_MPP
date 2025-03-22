package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * A classe Application representa a aplicação principal que irá interagir com os componentes
 * da interface do usuário (GUI), como botões e caixas de seleção.
 */
public class Application {
    private Button button;     // Um botão da interface
    private Checkbox checkbox; // Uma caixa de seleção da interface

    /**
     * O construtor recebe uma fábrica (GUIFactory) e cria os componentes da interface
     * usando a fábrica passada.
     */
    public Application(GUIFactory factory) {
        // Cria o botão e a caixa de seleção usando a fábrica fornecida.
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * O método paint() é responsável por renderizar a interface, chamando o método paint()
     * dos componentes Button e Checkbox.
     */
    public void paint() {
        button.paint();   // Desenha o botão
        checkbox.paint(); // Desenha a caixa de seleção
    }
}
