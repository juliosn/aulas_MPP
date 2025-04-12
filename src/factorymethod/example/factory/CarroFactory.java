package factorymethod.example.factory;

import factorymethod.example.veiculo.Carro;
import factorymethod.example.veiculo.Veiculo;

public class CarroFactory extends Factory {

    @Override
    public Veiculo createVeiculo() {
        return new Carro();
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