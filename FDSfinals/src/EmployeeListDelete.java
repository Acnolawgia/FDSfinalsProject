import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class EmployeeListDelete extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeListDelete frame = new EmployeeListDelete();
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
    public EmployeeListDelete() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 949, 484);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 10, 910, 426);
        contentPane.add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_1.setBackground(Color.LIGHT_GRAY);
        panel_1.setBounds(10, 10, 890, 406);
        panel.add(panel_1);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(10, 10, 870, 87);
        panel_1.add(panel_2);

        JLabel AccountCreation_label = new JLabel("Account Deletion");
        AccountCreation_label.setFont(new Font("Tahoma", Font.PLAIN, 40));
        AccountCreation_label.setBounds(261, 0, 320, 54);
        panel_2.add(AccountCreation_label);

        JLabel MiddleName_Label_1 = new JLabel("List of Employees");
        MiddleName_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        MiddleName_Label_1.setBounds(320, 44, 161, 36);
        panel_2.add(MiddleName_Label_1);

        JButton Return_Button = new JButton("Return");
        Return_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Admin frame = new Admin();
                frame.setVisible(true);
                dispose(); // Close the current frame
            }
        });
        Return_Button.setBounds(25, 30, 141, 36);
        panel_2.add(Return_Button);
        Return_Button.setFont(new Font("Tahoma", Font.PLAIN, 25));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        scrollPane.setBounds(10, 107, 870, 274);
        panel_1.add(scrollPane);

        // Create table model
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "User Type", "Delete"}, 0);
        table = new JTable(tableModel) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Make all cells non-editable except the "Delete" button column
                return column == 3;
            }
        };
        scrollPane.setViewportView(table);

        // Load employee data
        loadEmployeeData();

        // Add table cell renderer and editor for the delete button
        table.getColumn("Delete").setCellRenderer(new ButtonRenderer());
        table.getColumn("Delete").setCellEditor(new ButtonEditor(new javax.swing.JCheckBox()));
    }

    private void loadEmployeeData() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root")) {
            String sql = "SELECT id, name, usertype FROM employees";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String userType = resultSet.getString("usertype");
                        tableModel.addRow(new Object[]{id, name, userType, "Delete"});
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(int id) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb?user=root")) {
            String sql = "DELETE FROM employees WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private class ButtonRenderer extends JButton implements javax.swing.table.TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }
        @Override
        public java.awt.Component getTableCellRendererComponent(JTable table, Object value,
                                                                boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    private class ButtonEditor extends javax.swing.DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean isPushed;
        private int id;

        public ButtonEditor(javax.swing.JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public java.awt.Component getTableCellEditorComponent(JTable table, Object value,
                                                              boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            id = (int) table.getValueAt(row, 0);
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                int result = JOptionPane.showConfirmDialog(button, "Are you sure you want to delete this employee?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    deleteEmployee(id);
                    tableModel.removeRow(table.getSelectedRow());
                    JOptionPane.showMessageDialog(button, "Employee deleted successfully.");
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
