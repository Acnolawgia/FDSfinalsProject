import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField UsersName_TF;
    private JTable table;

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
        DeleteAcc_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmployeeListDelete frame = new EmployeeListDelete();
                frame.setVisible(true);
            }
        });
        DeleteAcc_Button.setFont(new Font("Tahoma", Font.PLAIN, 15));
        DeleteAcc_Button.setBackground(Color.LIGHT_GRAY);
        DeleteAcc_Button.setBounds(10, 71, 174, 40);
        Buttons_Panel.add(DeleteAcc_Button);

        JButton LogOut_Button = new JButton("Log Out");
        LogOut_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login frame = new Login();
                frame.setVisible(true);
                dispose();
            }
        });

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

        // Initialize table data and column names
        String[] columnNames = {"ID", "Name", "User Type", "View", "Edit"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4;
            }
        };

        // Set column properties
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(25);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(4).setPreferredWidth(25);
        table.setRowHeight(30);
        table.setBounds(39, 468, 589, 177);

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();
        TableCellEditor buttonEditor = new JTableButtonEditor(new JCheckBox());

        // Set custom renderer and editor for "View" and "Edit" columns
        table.getColumnModel().getColumn(3).setCellRenderer(buttonRenderer);
        table.getColumnModel().getColumn(3).setCellEditor(buttonEditor);
        table.getColumnModel().getColumn(4).setCellRenderer(buttonRenderer);
        table.getColumnModel().getColumn(4).setCellEditor(buttonEditor);

        scrollPane.setViewportView(table);

        // Load data from database
        loadDataFromDatabase(model);
    }

    private void loadDataFromDatabase(DefaultTableModel model) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root");

            // Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT id, CONCAT(name, ' ', lastname) AS full_name, usertype FROM employees";
            rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("full_name");
                String userType = rs.getString("usertype");
                model.addRow(new Object[]{id, name, userType, "View", "Edit"});
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean-up environment
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private class JTableButtonRenderer implements TableCellRenderer {
        private final JButton button = new JButton();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            return button;
        }
    }

    private class JTableButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;
        private int row;
        private int column;

        public JTableButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.label = (value == null) ? "" : value.toString();
            this.row = row;
            this.column = column;
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                String action = column == 3 ? "view" : "edit";
                System.out.println("Button clicked in row " + row + " to " + action);

                if (action.equals("view")) {
                    SalaryGUIView frame = new SalaryGUIView();
                    frame.setVisible(true);
                }
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
}

