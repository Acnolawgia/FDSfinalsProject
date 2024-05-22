import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class LogOut extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LogOut dialog = new LogOut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LogOut() {
		setBounds(100, 100, 391, 191);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel MessageBox_LogIn = new JPanel();
			MessageBox_LogIn.setLayout(null);
			MessageBox_LogIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			MessageBox_LogIn.setBackground(Color.WHITE);
			MessageBox_LogIn.setBounds(10, 10, 359, 139);
			contentPanel.add(MessageBox_LogIn);
			{
				JLabel Label_1 = new JLabel("Logging Out");
				Label_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
				Label_1.setBounds(72, 0, 224, 61);
				MessageBox_LogIn.add(Label_1);
			}
			{
				JLabel Label_2 = new JLabel("Are you Sure you want to Log Out?");
				Label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				Label_2.setBounds(24, 45, 313, 61);
				MessageBox_LogIn.add(Label_2);
			}
			{
				JButton Yes_Button = new JButton("Yes");
				Yes_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
				Yes_Button.setBounds(72, 102, 97, 27);
				MessageBox_LogIn.add(Yes_Button);
			}
			{
				JButton No_Button = new JButton("No");
				No_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
				No_Button.setBounds(203, 102, 97, 27);
				MessageBox_LogIn.add(No_Button);
			}
		}
	}

}
