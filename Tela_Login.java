package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Acesso");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(42, 71, 46, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(42, 93, 353, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(42, 124, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(42, 148, 353, 20);
		contentPane.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtLogin.getText().equals("Usuario") && txtSenha.getText().equals("1234")){
					JOptionPane.showMessageDialog(null,"Acesso Permitido");
				}else{
					JOptionPane.showMessageDialog(null,"Acesso Negado");
				}
			}
		});
		btnEntrar.setBounds(306, 179, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/suekoLogin.png")));
		lblNewLabel.setBounds(133, 11, 189, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblSuekoInc = new JLabel("sueko inc.\u00A9");
		lblSuekoInc.setBounds(10, 247, 78, 14);
		contentPane.add(lblSuekoInc);
	}
}
