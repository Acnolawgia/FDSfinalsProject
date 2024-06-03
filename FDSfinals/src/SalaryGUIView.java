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

public class SalaryGUIView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryGUIView frame = new SalaryGUIView();
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
	public SalaryGUIView() {
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
		
		JLabel SalaryMethod_Label = new JLabel("Salary Method:");
		SalaryMethod_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		SalaryMethod_Label.setBounds(472, 59, 170, 39);
		Employee_Panel.add(SalaryMethod_Label);
		
		JLabel IDNumber_Label = new JLabel("ID No.:");
		IDNumber_Label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		IDNumber_Label.setBounds(472, 10, 93, 39);
		Employee_Panel.add(IDNumber_Label);
		
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
		NumOfDays.setBounds(10, 88, 93, 39);
		panel.add(NumOfDays);
		
		JLabel RegularOT = new JLabel("Regular OT:");
		RegularOT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		RegularOT.setBounds(10, 124, 93, 39);
		panel.add(RegularOT);
		
		JLabel SpecialHolidays = new JLabel("Special Holidays:");
		SpecialHolidays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SpecialHolidays.setBounds(10, 162, 113, 39);
		panel.add(SpecialHolidays);
		
		JLabel DoublePay = new JLabel("Double Pay:");
		DoublePay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DoublePay.setBounds(10, 192, 126, 39);
		panel.add(DoublePay);
		
		JLabel lblRatesValue = new JLabel("Rates value");
		lblRatesValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRatesValue.setBounds(60, 49, 93, 39);
		panel.add(lblRatesValue);
		
		JLabel lblNoOfDays = new JLabel("No of Days value");
		lblNoOfDays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNoOfDays.setBounds(100, 88, 151, 39);
		panel.add(lblNoOfDays);
		
		JLabel lblRegularOtValue = new JLabel("Regular OT value\r\n");
		lblRegularOtValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegularOtValue.setBounds(110, 124, 126, 39);
		panel.add(lblRegularOtValue);
		
		JLabel lblSpecialHolidaysValue = new JLabel("Special Holidays value");
		lblSpecialHolidaysValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSpecialHolidaysValue.setBounds(120, 162, 126, 39);
		panel.add(lblSpecialHolidaysValue);
		
		JLabel lblDoublePayValue = new JLabel("Double Pay value");
		lblDoublePayValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDoublePayValue.setBounds(99, 192, 126, 39);
		panel.add(lblDoublePayValue);
		
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
		SSS.setBounds(10, 49, 47, 39);
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
		
		JLabel Deduction = new JLabel("Other Deduction:");
		Deduction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Deduction.setBounds(10, 229, 126, 39);
		panel_1.add(Deduction);
		
		JLabel SSS_value = new JLabel("SSS value");
		SSS_value.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SSS_value.setBounds(46, 49, 126, 39);
		panel_1.add(SSS_value);
		
		JLabel lblPhilhealthValue = new JLabel("Phil-Health value");
		lblPhilhealthValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhilhealthValue.setBounds(92, 87, 126, 39);
		panel_1.add(lblPhilhealthValue);
		
		JLabel PagIbigFunds_value = new JLabel("Pag-ibig\r\n Funds value");
		PagIbigFunds_value.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PagIbigFunds_value.setBounds(118, 124, 144, 39);
		panel_1.add(PagIbigFunds_value);
		
		JLabel lblPagibigLoansValue = new JLabel("Pag-ibig \r\nLoans value");
		lblPagibigLoansValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPagibigLoansValue.setBounds(118, 163, 144, 39);
		panel_1.add(lblPagibigLoansValue);
		
		JLabel lblSssLoanValue = new JLabel("SSS Loan value");
		lblSssLoanValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSssLoanValue.setBounds(81, 200, 126, 39);
		panel_1.add(lblSssLoanValue);
		
		JLabel lblOtherDeductionValue = new JLabel("Other Deduction value");
		lblOtherDeductionValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOtherDeductionValue.setBounds(128, 229, 134, 39);
		panel_1.add(lblOtherDeductionValue);
		
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
		
		JLabel Salary = new JLabel("Salary:");
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
		
		JLabel lblSalaryValue = new JLabel("Salary value");
		lblSalaryValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalaryValue.setBounds(64, 49, 126, 39);
		panel_2.add(lblSalaryValue);
		
		JLabel lblTotalPayOt = new JLabel("Total Pay OT value");
		lblTotalPayOt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalPayOt.setBounds(108, 87, 137, 39);
		panel_2.add(lblTotalPayOt);
		
		JLabel lblTotalDeductionValue = new JLabel("Total Deduction value");
		lblTotalDeductionValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalDeductionValue.setBounds(120, 125, 142, 39);
		panel_2.add(lblTotalDeductionValue);
		
		JLabel lblTotalSalaryValue = new JLabel("Total Salary value");
		lblTotalSalaryValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalSalaryValue.setBounds(97, 163, 148, 39);
		panel_2.add(lblTotalSalaryValue);
		
		JButton Backbtn = new JButton("Back");
		Backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                Admin frame = new Admin();
                frame.setVisible(true);
                dispose();
			}
		});
		Backbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		Backbtn.setBackground(Color.LIGHT_GRAY);
		Backbtn.setBounds(782, 15, 117, 40);
		Employee_Panel.add(Backbtn);
		
		JLabel EmployeeName_value = new JLabel("Employee name value");
		EmployeeName_value.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EmployeeName_value.setBounds(205, 10, 237, 39);
		Employee_Panel.add(EmployeeName_value);
		
		JLabel ID_NO_value = new JLabel("ID No value");
		ID_NO_value.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ID_NO_value.setBounds(561, 10, 137, 39);
		Employee_Panel.add(ID_NO_value);
		
		JLabel Employee_ID_value = new JLabel("Employee ID value");
		Employee_ID_value.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Employee_ID_value.setBounds(170, 59, 237, 39);
		Employee_Panel.add(Employee_ID_value);
		
		JLabel EmployeeID_value = new JLabel("Salary value");
		EmployeeID_value.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EmployeeID_value.setBounds(647, 61, 137, 39);
		Employee_Panel.add(EmployeeID_value);
	}
}
