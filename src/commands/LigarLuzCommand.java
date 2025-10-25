package commands;

import domain.Luz;
import interfaces.Command;

/**
 *
 * @author Júlio Neves
 */
public class LigarLuzCommand implements Command {
    private Luz luz;
    
    public LigarLuzCommand(Luz luz) {
        this.luz = luz;
    }
    
    public void execute() {
        luz.ligar();
    }
}
