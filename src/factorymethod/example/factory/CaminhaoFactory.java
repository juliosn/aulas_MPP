package factorymethod.example.factory;

import factorymethod.example.veiculo.Caminhao;
import factorymethod.example.veiculo.Veiculo;

public class CaminhaoFactory extends Factory {

    @Override
    public Veiculo createVeiculo() {
        return new Caminhao();
    }
}