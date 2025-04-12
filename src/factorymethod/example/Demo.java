package factorymethod.example;

import factorymethod.example.factory.CaminhaoFactory;
import factorymethod.example.factory.Factory;
import factorymethod.example.factory.CarroFactory;
import factorymethod.example.factory.TratorFactory;
import factorymethod.example.veiculo.Veiculo;
import java.util.Scanner;

public class Demo {
    private static Factory factory;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        Scanner ler = new Scanner(System.in);    

        System.out.println("Insira qual veículo você deseja utilizar: \n 1 - Caminhão \n 2 - Carro \n 3 - Trator");
        int numero = ler.nextInt();

        switch(numero){
            case 1:
                factory = new CaminhaoFactory();
                break;
            case 2:
                factory = new CarroFactory();
                break;
            case 3:
                factory = new TratorFactory();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    static void runBusinessLogic() {
        if (factory != null) {
            Veiculo veiculo = factory.createVeiculo();
            veiculo.ligar();  
            veiculo.desligar(); 
        } else {
            System.out.println("Nenhuma fábrica configurada.");
        }
    }
}
