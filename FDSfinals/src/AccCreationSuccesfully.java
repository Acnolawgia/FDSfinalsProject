import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AccCreationSuccesfully extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccCreationSuccesfully frame = new AccCreationSuccesfully();
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
	public AccCreationSuccesfully() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 218);
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
		
		JLabel Label_1 = new JLabel("Account Save!");
		Label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Label_1.setBounds(73, 0, 232, 61);
		MessageBox_LogIn.add(Label_1);
		
		JLabel Label_2 = new JLabel("A new Account has been “CREATED”");
		Label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_2.setBounds(17, 44, 332, 61);
		MessageBox_LogIn.add(Label_2);
		
		JButton Close_Button = new JButton("Close");
		Close_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Close_Button.setBounds(128, 126, 97, 27);
		MessageBox_LogIn.add(Close_Button);
		
		JLabel Label_3 = new JLabel("Successfully");
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_3.setBounds(128, 71, 128, 61);
		MessageBox_LogIn.add(Label_3);
	}

}
