package factorymethod.example.factory;

import factorymethod.example.veiculo.Trator;
import factorymethod.example.veiculo.Veiculo;

public class TratorFactory extends Factory {

    @Override
    public Veiculo createVeiculo() {
        return new Trator();
    }

    @Override
    public void ligar() {
        this.createVeiculo().ligar();
    }

    @Override
    public void desligar() {
        this.createVeiculo().desligar();
    }
}