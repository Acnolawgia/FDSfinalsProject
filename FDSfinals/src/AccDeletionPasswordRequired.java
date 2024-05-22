import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class AccDeletionPasswordRequired extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccDeletionPasswordRequired frame = new AccDeletionPasswordRequired();
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
	public AccDeletionPasswordRequired() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MessageBox_LogIn = new JPanel();
		MessageBox_LogIn.setLayout(null);
		MessageBox_LogIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MessageBox_LogIn.setBackground(Color.WHITE);
		MessageBox_LogIn.setBounds(10, 10, 385, 358);
		contentPane.add(MessageBox_LogIn);
		
		JLabel Label_1 = new JLabel("Warning!");
		Label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Label_1.setBounds(108, 0, 148, 61);
		MessageBox_LogIn.add(Label_1);
		
		JLabel Label_2 = new JLabel("Type “User’s Password” to");
		Label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_2.setBounds(74, 41, 246, 61);
		MessageBox_LogIn.add(Label_2);
		
		JButton Cancel_Button = new JButton("Cancel");
		Cancel_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cancel_Button.setBounds(202, 316, 97, 27);
		MessageBox_LogIn.add(Cancel_Button);
		
		JLabel Label_3 = new JLabel("“DELETE” this account");
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_3.setBounds(84, 86, 215, 61);
		MessageBox_LogIn.add(Label_3);
		
		JButton Enter_Buttonn = new JButton("Enter");
		Enter_Buttonn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Enter_Buttonn.setBounds(61, 316, 97, 27);
		MessageBox_LogIn.add(Enter_Buttonn);
		
		JPanel Password_Panel = new JPanel();
		Password_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Password_Panel.setLayout(null);
		Password_Panel.setBackground(Color.LIGHT_GRAY);
		Password_Panel.setBounds(10, 163, 360, 46);
		MessageBox_LogIn.add(Password_Panel);
		
		JTextArea Password = new JTextArea();
		Password.setBounds(10, 10, 340, 22);
		Password_Panel.add(Password);
		
		JPanel ConfirmPassowrd_Panel = new JPanel();
		ConfirmPassowrd_Panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		ConfirmPassowrd_Panel.setLayout(null);
		ConfirmPassowrd_Panel.setBackground(Color.LIGHT_GRAY);
		ConfirmPassowrd_Panel.setBounds(10, 260, 360, 46);
		MessageBox_LogIn.add(ConfirmPassowrd_Panel);
		
		JTextArea ConfirmPassword = new JTextArea();
		ConfirmPassword.setBounds(10, 10, 340, 22);
		ConfirmPassowrd_Panel.add(ConfirmPassword);
		
		JLabel Password_Label = new JLabel("Password:");
		Password_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Password_Label.setBounds(10, 115, 148, 61);
		MessageBox_LogIn.add(Password_Label);
		
		JLabel ConfirmPassword_Label = new JLabel("Confirm Password:");
		ConfirmPassword_Label.setBounds(10, 208, 265, 61);
		MessageBox_LogIn.add(ConfirmPassword_Label);
		ConfirmPassword_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
	}

}
