package domain;

import interfaces.Command;

/**
 *
 * @author Júlio Neves
 */
public class ControleRemoto {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void apertarBotao() {
        this.command.execute();
    }
}
