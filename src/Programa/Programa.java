package Programa;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Programa {
    public static void main(String[] args) {
        final String USER = "user";
        final String PASS = "123";

        JFrame frame = new JFrame("Programa :: Acesso ao Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblUsuario = new JLabel("Usuário: ");
        JTextField txtUsuario = new JTextField(2);
        txtUsuario.setPreferredSize(new Dimension(100, 5));
        txtUsuario.setToolTipText("Informe seu usuário de acesso ");

        JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField(2);
        txtSenha.setPreferredSize(new Dimension(100, 5));
        txtSenha.setToolTipText("Informe sua senha: ");

        JButton btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)){
                    JOptionPane.showMessageDialog(frame, "Acesso autorizado!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Acesso negado!");
                }
            }
        });

        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblSenha);
        panel.add(txtSenha);

        panel.add(btnLogin);

        frame.setContentPane(panel);


        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
