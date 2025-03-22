package buttons;

/**
 * Esta classe representa uma implementação do botão para o sistema MacOS.
 */
public class MacOSButton implements Button {

    /**
     * Método paint() que imprime a mensagem indicando que o botão MacOS foi criado.
     */
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
