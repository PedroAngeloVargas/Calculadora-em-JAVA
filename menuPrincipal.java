import javax.swing.*;
import java.awt.*;

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
        // Configuração da janela principal
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout()); // Usar GridBagLayout para centralização
        GridBagConstraints gbc = new GridBagConstraints();

        // Configuração do layout
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenchimento horizontal dos botões
        gbc.gridx = 0; // Coluna única para centralizar os botões
        gbc.weightx = 1; // Permitir que os botões se expandam horizontalmente

        // Título do menu
        JLabel titulo = new JLabel("===== Menu Principal =====", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridy = 0; // Primeira linha
        frame.add(titulo, gbc);

        // Botões
        JButton btnSoma = new JButton("Calcular Soma");
        gbc.gridy = 1; // Segunda linha
        frame.add(btnSoma, gbc);

        JButton btnSubtracao = new JButton("Calcular Subtração");
        gbc.gridy = 2; // Terceira linha
        frame.add(btnSubtracao, gbc);

        JButton btnMultiplicacao = new JButton("Calcular Multiplicação");
        gbc.gridy = 3; // Quarta linha
        frame.add(btnMultiplicacao, gbc);

        JButton btnDivisao = new JButton("Calcular Divisão");
        gbc.gridy = 4; // Quinta linha
        frame.add(btnDivisao, gbc);

        JButton btnSair = new JButton("Sair");
        gbc.gridy = 5; // Sexta linha
        frame.add(btnSair, gbc);

        // Centralizar a janela
        frame.setLocationRelativeTo(null);

        // Ações dos botões
        btnSoma.addActionListener(e -> soma.iniciar());
        btnSubtracao.addActionListener(e -> sub.iniciar());
        btnMultiplicacao.addActionListener(e -> mult.iniciar());
        btnDivisao.addActionListener(e -> divi.iniciar());
        btnSair.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Saindo...");
            System.exit(0);
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(menuPrincipalGUI::new);
    }
}
