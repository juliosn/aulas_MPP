import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * A classe Demo serve para demonstrar o funcionamento do padrão Abstract Factory.
 * Aqui, a aplicação escolhe uma fábrica em tempo de execução com base no sistema operacional
 * e cria os componentes correspondentes (botões e caixas de seleção).
 */
public class Demo {

    /**
     * Configura a aplicação com base no sistema operacional.
     * Se o sistema for MacOS, usa a MacOSFactory. Caso contrário, usa a WindowsFactory.
     * @return Uma instância da aplicação configurada com a fábrica apropriada.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(); // Obtém o nome do sistema operacional
        if (osName.contains("mac")) {  // Se o sistema for MacOS
            factory = new MacOSFactory();
        } else {  // Caso contrário, assume-se que é Windows
            factory = new WindowsFactory();
        }
        app = new Application(factory); // Cria a aplicação com a fábrica escolhida
        return app;
    }

    /**
     * O método main inicia a aplicação e chama o método paint para desenhar a interface.
     */
    public static void main(String[] args) {
        Application app = configureApplication(); // Configura a aplicação
        app.paint();  // Desenha a interface da aplicação
    }
}
