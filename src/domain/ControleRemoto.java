package domain;


/**
 *
 * @author Júlio Neves
 */
public class ControleRemoto {
    private Luz luz;
    
    public ControleRemoto (Luz luz) {
        this.luz = luz;
    }
    
    public void apertarBotaoLigar() {
        this.luz.ligar();
    }
    
    public void apertarBotaoDesligar() {
        this.luz.desligar();
    }
}
