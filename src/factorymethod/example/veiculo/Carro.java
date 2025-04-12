package factorymethod.example.veiculo;

public class Carro implements Veiculo {

    public void ligar() {
        System.out.println("Ligando Carro...");
        desligar();
    }

    public void desligar() {
        System.out.println("Desligando Carro...");
    }
}