import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class AccountCreation extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField FirstName_TF;
    private JTextField PhoneNumber_TF;
    private JTextField Username_TF;
    private JTextField MIddleName_TF;
    private JTextField EMail_TF;
    private JPasswordField Password_TF;
    private JTextField LastName_TF;
    private JTextField Usertype_TF;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AccountCreation frame = new AccountCreation();
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
    public AccountCreation() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 944, 483);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(10, 10, 910, 426);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBounds(10, 10, 890, 406);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_2.setBackground(new Color(255, 255, 255));
        panel_2.setBounds(282, 23, 325, 56);
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        JLabel AccountCreation_label = new JLabel("Account Creation");
        AccountCreation_label.setBounds(10, -16, 300, 72);
        panel_2.add(AccountCreation_label);
        AccountCreation_label.setFont(new Font("Tahoma", Font.PLAIN, 40));

        JPanel AccCreation_Panel = new JPanel();
        AccCreation_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        AccCreation_Panel.setBackground(new Color(255, 255, 255));
        AccCreation_Panel.setBounds(10, 89, 870, 307);
        panel_1.add(AccCreation_Panel);
        AccCreation_Panel.setLayout(null);

        JButton Confirm_Button = new JButton("Confirm");
        Confirm_Button.setBounds(629, 255, 211, 36);
        AccCreation_Panel.add(Confirm_Button);
        Confirm_Button.setFont(new Font("Tahoma", Font.PLAIN, 25));

        JLabel FirsName_Label = new JLabel("First Name:");
        FirsName_Label.setBounds(10, 20, 161, 36);
        AccCreation_Panel.add(FirsName_Label);
        FirsName_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));

        FirstName_TF = new JTextField();
        FirstName_TF.setBounds(10, 66, 211, 35);
        AccCreation_Panel.add(FirstName_TF);
        FirstName_TF.setBackground(new Color(192, 192, 192));
        FirstName_TF.setColumns(10);

        JLabel PhoneNumber_Label = new JLabel("Phone Number:");
        PhoneNumber_Label.setBounds(10, 111, 211, 36);
        AccCreation_Panel.add(PhoneNumber_Label);
        PhoneNumber_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));

        PhoneNumber_TF = new JTextField();
        PhoneNumber_TF.setBounds(10, 157, 211, 42);
        AccCreation_Panel.add(PhoneNumber_TF);
        PhoneNumber_TF.setColumns(10);
        PhoneNumber_TF.setBackground(Color.LIGHT_GRAY);

        JLabel Username_Label = new JLabel("Username:");
        Username_Label.setBounds(10, 209, 161, 36);
        AccCreation_Panel.add(Username_Label);
        Username_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));

        Username_TF = new JTextField();
        Username_TF.setBounds(10, 255, 211, 36);
        AccCreation_Panel.add(Username_TF);
        Username_TF.setColumns(10);
        Username_TF.setBackground(Color.LIGHT_GRAY);

        JLabel MiddleName_Label = new JLabel("Middle Name:");
        MiddleName_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        MiddleName_Label.setBounds(318, 20, 211, 36);
        AccCreation_Panel.add(MiddleName_Label);

        MIddleName_TF = new JTextField();
        MIddleName_TF.setColumns(10);
        MIddleName_TF.setBackground(Color.LIGHT_GRAY);
        MIddleName_TF.setBounds(318, 66, 211, 35);
        AccCreation_Panel.add(MIddleName_TF);

        JLabel EMail_Label = new JLabel("E - Mail:");
        EMail_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        EMail_Label.setBounds(318, 111, 161, 36);
        AccCreation_Panel.add(EMail_Label);

        EMail_TF = new JTextField();
        EMail_TF.setColumns(10);
        EMail_TF.setBackground(Color.LIGHT_GRAY);
        EMail_TF.setBounds(318, 157, 211, 42);
        AccCreation_Panel.add(EMail_TF);

        JLabel Password_Label = new JLabel("Password:");
        Password_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Password_Label.setBounds(318, 209, 161, 36);
        AccCreation_Panel.add(Password_Label);

        Password_TF = new JPasswordField();
        Password_TF.setColumns(10);
        Password_TF.setBackground(Color.LIGHT_GRAY);
        Password_TF.setBounds(318, 255, 211, 36);
        AccCreation_Panel.add(Password_TF);

        JLabel LastName_Label = new JLabel("Last Name:");
        LastName_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        LastName_Label.setBounds(629, 20, 161, 36);
        AccCreation_Panel.add(LastName_Label);

        LastName_TF = new JTextField();
        LastName_TF.setColumns(10);
        LastName_TF.setBackground(Color.LIGHT_GRAY);
        LastName_TF.setBounds(629, 66, 211, 35);
        AccCreation_Panel.add(LastName_TF);

        JLabel Usertype_Label = new JLabel("User Type");
        Usertype_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        Usertype_Label.setBounds(629, 111, 161, 36);
        AccCreation_Panel.add(Usertype_Label);

        Usertype_TF = new JTextField();
        Usertype_TF.setColumns(10);
        Usertype_TF.setBackground(Color.LIGHT_GRAY);
        Usertype_TF.setBounds(629, 157, 211, 42);
        AccCreation_Panel.add(Usertype_TF);

        JLabel CreateAccount_Label = new JLabel("Create Account");
        CreateAccount_Label.setFont(new Font("Tahoma", Font.PLAIN, 30));
        CreateAccount_Label.setBounds(629, 209, 211, 36);
        AccCreation_Panel.add(CreateAccount_Label);

        JButton Return_Button = new JButton("Return");
        Return_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin frame = new Admin();
                frame.setVisible(true);
                dispose();
            }
        });
        Return_Button.setBounds(10, 35, 141, 36);
        panel_1.add(Return_Button);
        Return_Button.setFont(new Font("Tahoma", Font.PLAIN, 25));

        // Add action listener to the Confirm button
        Confirm_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = FirstName_TF.getText();
                String phoneNumber = PhoneNumber_TF.getText();
                String username = Username_TF.getText();
                String middleName = MIddleName_TF.getText();
                String email = EMail_TF.getText();
                String password = new String(Password_TF.getPassword());
                String lastName = LastName_TF.getText();
                String userType = Usertype_TF.getText();

                if (!userType.equals("admin") && !userType.equals("employee")) {
                    JOptionPane.showMessageDialog(null, "User type must be 'admin' or 'employee'.");
                    return;
                }

                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root");
                    String query = "INSERT INTO employees (username, password, usertype, name, lastname, middleinitial) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, userType);
                    pst.setString(4, firstName);
                    pst.setString(5, lastName);
                    pst.setString(6, middleName);

                    int rowsAffected = pst.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Account created successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error creating account.");
                    }

                    pst.close();
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database connection error.");
                }
                
                dispose();
                Admin frame = new Admin();
				frame.setVisible(true);
            }
        });
    }
}
