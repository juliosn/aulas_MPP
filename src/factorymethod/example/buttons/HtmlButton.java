//Declaração de pacotes:
package factorymethod.example.buttons;

//Implementação da interface como botão HTML 
public class HtmlButton implements Button {

    //Método de renderização implementado através do contrato de interface
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    //Método de clique implementado através do contrato de interface
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}