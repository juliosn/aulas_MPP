package factorymethod.example.factory;

import factorymethod.example.veiculo.Veiculo;

public abstract class Factory {

    public abstract Veiculo createVeiculo();

    public abstract void ligar();
    
    public abstract void desligar();
}