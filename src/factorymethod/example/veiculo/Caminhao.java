package factorymethod.example.veiculo;

public class Caminhao implements Veiculo {

    public void ligar() {
        System.out.println("Ligando Caminhão...");
        desligar();
    }

    public void desligar() {
        System.out.println("Desligando Caminhão...");
    }
}