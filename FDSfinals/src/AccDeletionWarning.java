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
import javax.swing.JTextField;

public class AccDeletionWarning extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccDeletionWarning frame = new AccDeletionWarning();
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
	public AccDeletionWarning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 290);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MessageBox_LogIn = new JPanel();
		MessageBox_LogIn.setLayout(null);
		MessageBox_LogIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		MessageBox_LogIn.setBackground(Color.WHITE);
		MessageBox_LogIn.setBounds(10, 10, 380, 239);
		contentPane.add(MessageBox_LogIn);
		
		JLabel Label_1 = new JLabel("Warning!");
		Label_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Label_1.setBounds(108, 0, 148, 61);
		MessageBox_LogIn.add(Label_1);
		
		JLabel Label_2 = new JLabel("Are you sure you want to “DELETE” ");
		Label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_2.setBounds(27, 43, 332, 61);
		MessageBox_LogIn.add(Label_2);
		
		JButton No_Button = new JButton("No");
		No_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		No_Button.setBounds(207, 202, 97, 27);
		MessageBox_LogIn.add(No_Button);
		
		JLabel Label_3 = new JLabel("This account?");
		Label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Label_3.setBounds(128, 71, 128, 61);
		MessageBox_LogIn.add(Label_3);
		
		JButton Yes_Button = new JButton("Yes");
		Yes_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Yes_Button.setBounds(67, 202, 97, 27);
		MessageBox_LogIn.add(Yes_Button);
		
		JPanel EmployeeInfo_Panel = new JPanel();
		EmployeeInfo_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		EmployeeInfo_Panel.setBackground(new Color(192, 192, 192));
		EmployeeInfo_Panel.setBounds(10, 114, 360, 78);
		MessageBox_LogIn.add(EmployeeInfo_Panel);
		EmployeeInfo_Panel.setLayout(null);
		
		JTextArea EmployeeName = new JTextArea();
		EmployeeName.setBounds(10, 10, 163, 22);
		EmployeeInfo_Panel.add(EmployeeName);
		
		JTextArea EmployeePosition = new JTextArea();
		EmployeePosition.setBounds(10, 42, 163, 22);
		EmployeeInfo_Panel.add(EmployeePosition);
		
		JTextArea EmployeeID = new JTextArea();
		EmployeeID.setBounds(187, 10, 163, 22);
		EmployeeInfo_Panel.add(EmployeeID);
		
		JTextArea IDNumber = new JTextArea();
		IDNumber.setBounds(187, 42, 163, 22);
		EmployeeInfo_Panel.add(IDNumber);
	}
}
