import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountCreate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountCreate frame = new AccountCreate();
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
	public AccountCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 218);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MessageBox_LogIn = new JPanel();
		MessageBox_LogIn.setLayout(null);
		MessageBox_LogIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MessageBox_LogIn.setBackground(Color.WHITE);
		MessageBox_LogIn.setBounds(10, 10, 359, 163);
		contentPane.add(MessageBox_LogIn);
		
		JLabel Label_1 = new JLabel("Creating An Account");
		Label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Label_1.setBounds(24, 0, 326, 61);
		MessageBox_LogIn.add(Label_1);
		
		JLabel Label_2 = new JLabel("Are you sure you want to “CREATE”");
		Label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_2.setBounds(24, 43, 332, 61);
		MessageBox_LogIn.add(Label_2);
		
		JButton Yes_Button = new JButton("Yes");
		Yes_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Yes_Button.setBounds(73, 125, 97, 27);
		MessageBox_LogIn.add(Yes_Button);
		
		JButton No_Button = new JButton("No");
		No_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		No_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		No_Button.setBounds(204, 125, 97, 27);
		MessageBox_LogIn.add(No_Button);
		
		JLabel Label_3 = new JLabel("a new Account?");
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_3.setBounds(118, 71, 149, 61);
		MessageBox_LogIn.add(Label_3);
	}

}
