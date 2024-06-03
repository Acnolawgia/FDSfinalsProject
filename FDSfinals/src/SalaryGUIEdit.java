import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalaryGUIEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EmployeeID_TF;
	private JTextField EmpIDtextField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField Rates_TF;
	private JTextField NumOfDays_TF;
	private JTextField RegularOT_TF;
	private JTextField SpecialHolidays_TF;
	private JTextField DoublePay_TF;
	private JTextField SSS_TF;
	private JTextField PhilHealth_TF;
	private JTextField PagIbigFunds_TF;
	private JTextField PagIbigLoans_TF;
	private JTextField SSSLoan_TF;
	private JTextField Deduction_TF;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryGUIEdit frame = new SalaryGUIEdit();
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
	public SalaryGUIEdit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Employee_Panel = new JPanel();
		Employee_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Employee_Panel.setBackground(new Color(255, 255, 255));
		Employee_Panel.setBounds(10, 10, 909, 423);
		contentPane.add(Employee_Panel);
		Employee_Panel.setLayout(null);
		
		JLabel EmployeeName_Label = new JLabel("Employee Name:");
		EmployeeName_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		EmployeeName_Label.setBounds(10, 10, 185, 39);
		Employee_Panel.add(EmployeeName_Label);
		
		JLabel EmployeeID_Label = new JLabel("Employee ID:");
		EmployeeID_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		EmployeeID_Label.setBounds(10, 59, 185, 39);
		Employee_Panel.add(EmployeeID_Label);
		
		EmployeeID_TF = new JTextField();
		EmployeeID_TF.setBackground(new Color(192, 192, 192));
		EmployeeID_TF.setBounds(205, 10, 257, 39);
		Employee_Panel.add(EmployeeID_TF);
		EmployeeID_TF.setColumns(10);
		
		EmpIDtextField = new JTextField();
		EmpIDtextField.setColumns(10);
		EmpIDtextField.setBackground(Color.LIGHT_GRAY);
		EmpIDtextField.setBounds(205, 59, 257, 39);
		Employee_Panel.add(EmpIDtextField);
		
		JLabel SalaryMethod_Label = new JLabel("Salary Method:");
		SalaryMethod_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		SalaryMethod_Label.setBounds(472, 59, 170, 39);
		Employee_Panel.add(SalaryMethod_Label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(642, 65, 257, 39);
		Employee_Panel.add(textField_1);
		
		JLabel IDNumber_Label = new JLabel("ID No.:");
		IDNumber_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		IDNumber_Label.setBounds(472, 10, 93, 39);
		Employee_Panel.add(IDNumber_Label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(642, 16, 130, 39);
		Employee_Panel.add(textField_2);
		
		JPanel Rates_Panel = new JPanel();
		Rates_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Rates_Panel.setBounds(10, 108, 292, 305);
		Employee_Panel.add(Rates_Panel);
		Rates_Panel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 272, 285);
		Rates_Panel.add(panel);
		panel.setLayout(null);
		
		JLabel Rates_Label = new JLabel("Rates, Overtime, and Others");
		Rates_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Rates_Label.setBounds(10, 0, 260, 39);
		panel.add(Rates_Label);
		
		JPanel Panel_AsLine = new JPanel();
		Panel_AsLine.setBackground(new Color(64, 0, 64));
		Panel_AsLine.setBounds(0, 36, 270, 3);
		panel.add(Panel_AsLine);
		
		JLabel Rates = new JLabel("Rates:");
		Rates.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Rates.setBounds(10, 49, 126, 39);
		panel.add(Rates);
		
		JLabel NumOfDays = new JLabel("No of Days:");
		NumOfDays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NumOfDays.setBounds(10, 88, 126, 39);
		panel.add(NumOfDays);
		
		JLabel RegularOT = new JLabel("Regular OT:");
		RegularOT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		RegularOT.setBounds(10, 124, 126, 39);
		panel.add(RegularOT);
		
		JLabel SpecialHolidays = new JLabel("Special Holidays:");
		SpecialHolidays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SpecialHolidays.setBounds(10, 162, 126, 39);
		panel.add(SpecialHolidays);
		
		JLabel DoublePay = new JLabel("Double Pay:");
		DoublePay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DoublePay.setBounds(10, 192, 126, 39);
		panel.add(DoublePay);
		
		Rates_TF = new JTextField();
		Rates_TF.setBackground(new Color(192, 192, 192));
		Rates_TF.setBounds(126, 49, 136, 29);
		panel.add(Rates_TF);
		Rates_TF.setColumns(10);
		
		NumOfDays_TF = new JTextField();
		NumOfDays_TF.setColumns(10);
		NumOfDays_TF.setBackground(Color.LIGHT_GRAY);
		NumOfDays_TF.setBounds(126, 88, 136, 29);
		panel.add(NumOfDays_TF);
		
		RegularOT_TF = new JTextField();
		RegularOT_TF.setColumns(10);
		RegularOT_TF.setBackground(Color.LIGHT_GRAY);
		RegularOT_TF.setBounds(126, 124, 136, 29);
		panel.add(RegularOT_TF);
		
		SpecialHolidays_TF = new JTextField();
		SpecialHolidays_TF.setColumns(10);
		SpecialHolidays_TF.setBackground(Color.LIGHT_GRAY);
		SpecialHolidays_TF.setBounds(126, 160, 136, 29);
		panel.add(SpecialHolidays_TF);
		
		DoublePay_TF = new JTextField();
		DoublePay_TF.setColumns(10);
		DoublePay_TF.setBackground(Color.LIGHT_GRAY);
		DoublePay_TF.setBounds(126, 199, 136, 29);
		panel.add(DoublePay_TF);
		
		JPanel Taxes_Panel = new JPanel();
		Taxes_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Taxes_Panel.setBounds(308, 108, 292, 305);
		Employee_Panel.add(Taxes_Panel);
		Taxes_Panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 10, 272, 285);
		Taxes_Panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Taxes_Label = new JLabel("Deduction and Taxes");
		Taxes_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Taxes_Label.setBounds(46, 0, 191, 39);
		panel_1.add(Taxes_Label);
		
		JPanel Panel_AsLine_1 = new JPanel();
		Panel_AsLine_1.setBackground(new Color(64, 0, 64));
		Panel_AsLine_1.setBounds(0, 36, 270, 3);
		panel_1.add(Panel_AsLine_1);
		
		JLabel SSS = new JLabel("SSS:");
		SSS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SSS.setBounds(10, 49, 126, 39);
		panel_1.add(SSS);
		
		JLabel PhilHealth = new JLabel("Phil-Health:");
		PhilHealth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PhilHealth.setBounds(10, 87, 126, 39);
		panel_1.add(PhilHealth);
		
		JLabel PagIbigFunds = new JLabel("Pag-ibig\r\n Funds:");
		PagIbigFunds.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PagIbigFunds.setBounds(10, 124, 126, 39);
		panel_1.add(PagIbigFunds);
		
		JLabel PagIbigLoans = new JLabel("Pag-ibig \r\nLoans:");
		PagIbigLoans.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PagIbigLoans.setBounds(10, 163, 126, 39);
		panel_1.add(PagIbigLoans);
		
		JLabel SSSLoans = new JLabel("SSS Loan:");
		SSSLoans.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SSSLoans.setBounds(10, 200, 126, 39);
		panel_1.add(SSSLoans);
		
		JLabel Deduction = new JLabel("Deduction:");
		Deduction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Deduction.setBounds(10, 236, 126, 39);
		panel_1.add(Deduction);
		
		SSS_TF = new JTextField();
		SSS_TF.setColumns(10);
		SSS_TF.setBackground(Color.LIGHT_GRAY);
		SSS_TF.setBounds(126, 49, 136, 29);
		panel_1.add(SSS_TF);
		
		PhilHealth_TF = new JTextField();
		PhilHealth_TF.setColumns(10);
		PhilHealth_TF.setBackground(Color.LIGHT_GRAY);
		PhilHealth_TF.setBounds(126, 87, 136, 29);
		panel_1.add(PhilHealth_TF);
		
		PagIbigFunds_TF = new JTextField();
		PagIbigFunds_TF.setColumns(10);
		PagIbigFunds_TF.setBackground(Color.LIGHT_GRAY);
		PagIbigFunds_TF.setBounds(126, 124, 136, 29);
		panel_1.add(PagIbigFunds_TF);
		
		PagIbigLoans_TF = new JTextField();
		PagIbigLoans_TF.setColumns(10);
		PagIbigLoans_TF.setBackground(Color.LIGHT_GRAY);
		PagIbigLoans_TF.setBounds(126, 163, 136, 29);
		panel_1.add(PagIbigLoans_TF);
		
		SSSLoan_TF = new JTextField();
		SSSLoan_TF.setColumns(10);
		SSSLoan_TF.setBackground(Color.LIGHT_GRAY);
		SSSLoan_TF.setBounds(126, 200, 136, 29);
		panel_1.add(SSSLoan_TF);
		
		Deduction_TF = new JTextField();
		Deduction_TF.setColumns(10);
		Deduction_TF.setBackground(Color.LIGHT_GRAY);
		Deduction_TF.setBounds(126, 236, 136, 29);
		panel_1.add(Deduction_TF);
		
		JPanel Total_Panel = new JPanel();
		Total_Panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Total_Panel.setBounds(605, 108, 292, 305);
		Employee_Panel.add(Total_Panel);
		Total_Panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 10, 272, 285);
		Total_Panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Total_Label = new JLabel("Total");
		Total_Label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Total_Label.setBounds(120, 0, 52, 39);
		panel_2.add(Total_Label);
		
		JPanel Panel_AsLine_2 = new JPanel();
		Panel_AsLine_2.setBackground(new Color(64, 0, 64));
		Panel_AsLine_2.setBounds(0, 36, 270, 3);
		panel_2.add(Panel_AsLine_2);
		
		JLabel Salary = new JLabel("Salary");
		Salary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Salary.setBounds(10, 49, 126, 39);
		panel_2.add(Salary);
		
		JLabel TotalPayOT = new JLabel("Total Pay OT:");
		TotalPayOT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TotalPayOT.setBounds(10, 87, 126, 39);
		panel_2.add(TotalPayOT);
		
		JLabel TotalDeduction = new JLabel("Total Deduction:");
		TotalDeduction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TotalDeduction.setBounds(10, 125, 126, 39);
		panel_2.add(TotalDeduction);
		
		JLabel TotalSalary = new JLabel("Total Salary:");
		TotalSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TotalSalary.setBounds(10, 163, 126, 39);
		panel_2.add(TotalSalary);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(130, 49, 136, 29);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(130, 87, 136, 29);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(130, 125, 136, 29);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(130, 163, 136, 29);
		panel_2.add(textField_6);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setBounds(782, 15, 117, 40);
		Employee_Panel.add(btnSave);
	}
}
