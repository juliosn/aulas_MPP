package commandexample;

import commands.DesligarLuzCommand;
import commands.LigarLuzCommand;
import domain.ControleRemoto;
import domain.Luz;
import interfaces.Command;

/**
 *
 * @author Júlio Neves
 */
public class CommandExample {
    public static void main(String[] args) {
        Luz luz = new Luz();
        
        Command ligar = new LigarLuzCommand(luz);
        Command desligar = new DesligarLuzCommand(luz);
        
        ControleRemoto controle = new ControleRemoto();
        
        controle.setCommand(ligar);
        controle.apertarBotao();
        
        controle.setCommand(desligar);
        controle.apertarBotao();
    }
}