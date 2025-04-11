//Declaração de pacotes:
package factorymethod.example.buttons;

//Interaface comum para todos os botões 
public interface Button {
    //Métodos que serão utilzados para utilização do contrato
    void render();
    void onClick();
}