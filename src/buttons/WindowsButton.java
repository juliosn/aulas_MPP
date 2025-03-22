package buttons;

/**
 * Esta classe representa uma implementação do botão para o sistema Windows.
 */
public class WindowsButton implements Button {

    /**
     * Método paint() que imprime a mensagem indicando que o botão Windows foi criado.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
