package factorymethod.example.veiculo;

public class Trator implements Veiculo {

    public void ligar() {
        System.out.println("Ligando Trator...");
        desligar();
    }

    public void desligar() {
        System.out.println("Desligando Trator...");
    }
}