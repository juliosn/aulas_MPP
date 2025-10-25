package commands;

import domain.Luz;
import interfaces.Command;

/**
 *
 * @author Júlio Neves
 */
public class DesligarLuzCommand implements Command {
    private Luz luz;
    
    public DesligarLuzCommand(Luz luz) {
        this.luz = luz;
    }
    
    public void execute() {
        luz.desligar();
    }
}
