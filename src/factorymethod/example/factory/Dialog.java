//Declaração de pacotes:
package factorymethod.example.factory;

//Importando bibliotecas
import factorymethod.example.buttons.Button;

/**
 * Classe base de fábrica. Note que "fábrica" é apenas um papel atribuído à classe.  
   Ela deve conter alguma lógica de negócio central que exija a criação de diferentes produtos.
 */

//Construção da classe abstrata de diálogo
public abstract class Dialog {

    
    //Método de renderização de janela
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    //Subclasses irão sobrescrever este método para criar objetos de botão específicos.
    public abstract Button createButton();
}