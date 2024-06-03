import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ForgetPassword extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField NewPasswordField;
    private JPasswordField PreviousPasswordField;
    private JTextField UserTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ForgetPassword frame = new ForgetPassword();
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
    public ForgetPassword() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 443);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(10, 10, 606, 384);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel.setBackground(new Color(192, 192, 192));
        panel.setBounds(242, 10, 354, 361);
        panel_1.add(panel);
        panel.setForeground(new Color(255, 255, 255));
        panel.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(10, 14, 334, 332);
        panel.add(panel_3);
        panel_3.setLayout(null);

        JButton Updatebtn = new JButton("Update");
        Updatebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (authenticateUser()) {
                    if (updatePassword()) {
                        JOptionPane.showMessageDialog(null, "Password updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Password update failed.", "Update Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or previous password.", "Authentication Error", JOptionPane.ERROR_MESSAGE);
                }
                
                Login frame = new Login();
                frame.setVisible(true);
                dispose();
            }  
        });
        Updatebtn.setBackground(new Color(192, 192, 192));
        Updatebtn.setBounds(87, 288, 171, 34);
        panel_3.add(Updatebtn);
        Updatebtn.setFont(new Font("Tahoma", Font.BOLD, 16));

        NewPasswordField = new JPasswordField();
        NewPasswordField.setBounds(20, 244, 289, 34);
        panel_3.add(NewPasswordField);
        NewPasswordField.setBackground(new Color(192, 192, 192));

        JLabel NewPasswordlbl = new JLabel("New Password:");
        NewPasswordlbl.setBounds(20, 220, 158, 24);
        panel_3.add(NewPasswordlbl);
        NewPasswordlbl.setFont(new Font("Tahoma", Font.BOLD, 16));

        JLabel PreviousPasswordlb = new JLabel("Previous Password:");
        PreviousPasswordlb.setBounds(20, 152, 158, 24);
        panel_3.add(PreviousPasswordlb);
        PreviousPasswordlb.setFont(new Font("Tahoma", Font.BOLD, 16));

        JLabel LogIn_Label = new JLabel("Forget Password");
        LogIn_Label.setFont(new Font("Tahoma", Font.PLAIN, 45));
        LogIn_Label.setBounds(0, 0, 334, 73);
        panel_3.add(LogIn_Label);

        PreviousPasswordField = new JPasswordField();
        PreviousPasswordField.setBackground(Color.LIGHT_GRAY);
        PreviousPasswordField.setBounds(20, 176, 289, 34);
        panel_3.add(PreviousPasswordField);

        JLabel UserNamelbl = new JLabel("Username:");
        UserNamelbl.setFont(new Font("Tahoma", Font.BOLD, 16));
        UserNamelbl.setBounds(21, 83, 90, 24);
        panel_3.add(UserNamelbl);

        UserTextField = new JTextField();
        UserTextField.setColumns(10);
        UserTextField.setBackground(Color.LIGHT_GRAY);
        UserTextField.setBounds(20, 108, 289, 34);
        panel_3.add(UserTextField);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setBounds(10, 10, 222, 65);
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_4.setBackground(new Color(255, 255, 255));
        panel_4.setBounds(69, 10, 143, 45);
        panel_2.add(panel_4);
        panel_4.setLayout(null);

        JLabel Payroll_Label = new JLabel("Payroll System");
        Payroll_Label.setBounds(5, 10, 129, 25);
        panel_4.add(Payroll_Label);
        Payroll_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));

        JLabel lblNewLabel = new JLabel(" $");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
        lblNewLabel.setBounds(10, -5, 64, 65);
        panel_2.add(lblNewLabel);

        JPanel Panel_AsLine = new JPanel();
        Panel_AsLine.setBackground(new Color(64, 0, 64));
        Panel_AsLine.setBounds(10, 82, 222, 10);
        panel_1.add(Panel_AsLine);

        JPanel Panel_AsLine_1 = new JPanel();
        Panel_AsLine_1.setBackground(new Color(64, 0, 64));
        Panel_AsLine_1.setBounds(10, 356, 222, 10);
        panel_1.add(Panel_AsLine_1);

        JLabel WelcomeBack_Label = new JLabel("Welcome Back!");
        WelcomeBack_Label.setBounds(3, 102, 238, 60);
        panel_1.add(WelcomeBack_Label);
        WelcomeBack_Label.setFont(new Font("Tahoma", Font.PLAIN, 35));

        JPanel panel_5 = new JPanel();
        panel_5.setBounds(10, 159, 222, 189);
        panel_1.add(panel_5);
        panel_5.setLayout(null);

        JLabel Image_PeoplWaving_Label = new JLabel("New label");
        Image_PeoplWaving_Label.setIcon(new ImageIcon("D:\\GithubRepository\\FDSfinalsProject\\FDSfinals\\Images\\PeopleWaving.png"));
        Image_PeoplWaving_Label.setBounds(-46, 0, 290, 222);
        panel_5.add(Image_PeoplWaving_Label);
    }

    private boolean authenticateUser() {
        String username = UserTextField.getText();
        String previousPassword = new String(PreviousPasswordField.getPassword());
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root")) {
            String sql = "SELECT * FROM employees WHERE username = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, previousPassword);
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // Return true if user exists
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Return false if authentication fails
    }

    private boolean updatePassword() {
        String username = UserTextField.getText();
        String newPassword = new String(NewPasswordField.getPassword());
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root")) {
            String sql = "UPDATE employees SET password = ? WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, newPassword);
                statement.setString(2, username);
                int rowsUpdated = statement.executeUpdate();
                return rowsUpdated > 0; // Return true if update is successful
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Return false if update fails
    }
}
