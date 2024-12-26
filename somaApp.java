import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class somaApp {

    public void iniciar() {
        JFrame frame = new JFrame("Calculadora de Soma!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Número 1:");
        JTextField text1 = new JTextField(10);
        JLabel label2 = new JLabel("Número 2:");
        JTextField text2 = new JTextField(10);
        JButton buttonMult = new JButton("Somar");
        JLabel resultadoLabel = new JLabel("Resultado: ");

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(buttonMult);
        frame.add(resultadoLabel);

        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(text1.getText());
                    double num2 = Double.parseDouble(text2.getText());
                    double resultado = num1 + num2;
                    resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Por favor, insira números válidos.");
                }
            }
        });

        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }
}
