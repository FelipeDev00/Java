import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args)
    {
        JFrame janela = new JFrame();
        janela.setSize(300, 200);
        janela.setTitle("Minha 1ª Janela!");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        //criando label
        JLabel rotulo = new JLabel();
        rotulo.setText("Digite seu nome");
        janela.add(rotulo);

         //criando campo de entrada
        JTextField campo = new JTextField(10);
        janela.add(campo);

        //criando botão
        JButton botao = new JButton();
        botao.setText("clique aqui");
        janela.add(botao);

        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(janela, "Boas vindas " + campo.getText() + "!" );
            }
        });

        janela.setVisible(true);
    }
}