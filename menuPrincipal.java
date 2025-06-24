import java.awt.*;
import javax.swing.*;

public class menuPrincipal {
    private somaApp soma;
    private multApp mult;
    private diviApp divi;
    private subApp sub;

    public menuPrincipal() {
        this.soma = new somaApp();
        this.mult = new multApp();
        this.divi = new diviApp();
        this.sub = new subApp();
        criarMenu();
    }

    private void criarMenu() {
        
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();

 
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.gridx = 0; 
        gbc.weightx = 1; 

       
        JLabel titulo = new JLabel("===== Menu Principal =====", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 0; 
        frame.add(titulo, gbc);


        JButton btnSoma = new JButton("Calcular Soma");
        gbc.gridy = 1; 
        frame.add(btnSoma, gbc);

        JButton btnSubtracao = new JButton("Calcular Subtração");
        gbc.gridy = 2; 
        frame.add(btnSubtracao, gbc);

        JButton btnMultiplicacao = new JButton("Calcular Multiplicação");
        gbc.gridy = 3;
        frame.add(btnMultiplicacao, gbc);

        JButton btnDivisao = new JButton("Calcular Divisão");
        gbc.gridy = 4; 
        frame.add(btnDivisao, gbc);

        JButton btnSair = new JButton("Sair");
        gbc.gridy = 5; 
        frame.add(btnSair, gbc);


        frame.setLocationRelativeTo(null);


        btnSoma.addActionListener(e -> soma.iniciar());
        btnSubtracao.addActionListener(e -> sub.iniciar());
        btnMultiplicacao.addActionListener(e -> mult.iniciar());
        btnDivisao.addActionListener(e -> divi.iniciar());
        btnSair.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Saindo...");
            System.exit(0);
        });


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(menuPrincipal::new);
    }
}
