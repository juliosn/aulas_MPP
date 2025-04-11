//Declaração de pacotes:
package factorymethod.example.buttons;

//Declaração de bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Implementação do botão windows
public class WindowsButton implements Button {
    
    //Criação de objetos para construção de interface gráfica
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    //Método de renderização implementado através do contrato de interface
    public void render() {
        //Construção de objetos de interface gráfica:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    //Método de clique implementado através do contrato de interface
    public void onClick() {
        //Construção do objeto para o botão da saída e cancelamento/encerramento do sistema.
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}