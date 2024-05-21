import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UserTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 30, 548, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		UserTextField = new JTextField();
		UserTextField.setBounds(265, 118, 153, 34);
		panel.add(UserTextField);
		UserTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(267, 202, 151, 34);
		panel.add(passwordField);
		
		JLabel UserNamelbl = new JLabel("Username");
		UserNamelbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		UserNamelbl.setBounds(124, 120, 90, 24);
		panel.add(UserNamelbl);
		
		JLabel Passwordlbl = new JLabel("Password");
		Passwordlbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		Passwordlbl.setBounds(124, 204, 90, 24);
		panel.add(Passwordlbl);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		Loginbtn.setBounds(222, 292, 106, 34);
		panel.add(Loginbtn);
		
		//jomsa
	}
}
