import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsersName_TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 906, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 10, 214, 406);
		panel.add(panel_1);
		
		JPanel UsersName_Panel = new JPanel();
		UsersName_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		UsersName_Panel.setBackground(new Color(255, 255, 255));
		UsersName_Panel.setBounds(10, 10, 194, 104);
		panel_1.add(UsersName_Panel);
		UsersName_Panel.setLayout(null);
		
		JLabel Admin_Label = new JLabel("Admin");
		Admin_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Admin_Label.setBounds(69, 69, 61, 25);
		UsersName_Panel.add(Admin_Label);
		
		UsersName_TF = new JTextField();
		UsersName_TF.setBackground(new Color(192, 192, 192));
		UsersName_TF.setBounds(10, 10, 174, 55);
		UsersName_Panel.add(UsersName_TF);
		UsersName_TF.setColumns(10);
		
		JPanel Buttons_Panel = new JPanel();
		Buttons_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Buttons_Panel.setBackground(new Color(255, 255, 255));
		Buttons_Panel.setBounds(10, 132, 194, 189);
		panel_1.add(Buttons_Panel);
		Buttons_Panel.setLayout(null);
		
		JButton AddAcc_Button = new JButton("Add Account");
		AddAcc_Button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AddAcc_Button.setBackground(new Color(192, 192, 192));
		AddAcc_Button.setBounds(10, 10, 174, 40);
		Buttons_Panel.add(AddAcc_Button);
		
		JButton DeleteAcc_Button = new JButton("Delete Account");
		DeleteAcc_Button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DeleteAcc_Button.setBackground(Color.LIGHT_GRAY);
		DeleteAcc_Button.setBounds(10, 71, 174, 40);
		Buttons_Panel.add(DeleteAcc_Button);
		
		JButton LogOut_Button = new JButton("Log Out");
		LogOut_Button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LogOut_Button.setBackground(Color.LIGHT_GRAY);
		LogOut_Button.setBounds(10, 136, 174, 40);
		Buttons_Panel.add(LogOut_Button);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(228, 10, 668, 406);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel ScrollBar_Panel = new JPanel();
		ScrollBar_Panel.setBackground(new Color(255, 255, 255));
		ScrollBar_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ScrollBar_Panel.setBounds(10, 10, 648, 386);
		panel_4.add(ScrollBar_Panel);
		ScrollBar_Panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 64, 628, 312);
		ScrollBar_Panel.add(scrollPane);
		
		JPanel EmployeeList_Panel = new JPanel();
		EmployeeList_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		EmployeeList_Panel.setBounds(145, 12, 383, 42);
		ScrollBar_Panel.add(EmployeeList_Panel);
		EmployeeList_Panel.setLayout(null);
		
		JLabel EmployeeList_Label = new JLabel("List Of Employees");
		EmployeeList_Label.setBounds(110, 10, 166, 25);
		EmployeeList_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EmployeeList_Panel.add(EmployeeList_Label);
	}
}
