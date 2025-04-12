package factorymethod.example.factory;

import factorymethod.example.veiculo.Caminhao;
import factorymethod.example.veiculo.Veiculo;

public class CaminhaoFactory extends Factory {

    @Override
    public Veiculo createVeiculo() {
        return new Caminhao();
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