import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
public class MainFrame {

	private JFrame frame;
	private JTextField CanNang;
	private JTextField ChCao;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(122, 125, 196, 33);
		frame.getContentPane().add(panel);
		
		JRadioButton Asian = new JRadioButton("Asian");
		buttonGroup.add(Asian);
		panel.add(Asian);
		
		JRadioButton NonAsian = new JRadioButton("Non-Asian");
		buttonGroup.add(NonAsian);
		panel.add(NonAsian);
		
		CanNang = new JTextField();
		CanNang.setBounds(195, 50, 86, 20);
		frame.getContentPane().add(CanNang);
		CanNang.setColumns(10);
		
		ChCao = new JTextField();
		ChCao.setBounds(195, 82, 86, 20);
		frame.getContentPane().add(ChCao);
		ChCao.setColumns(10);
		
		JLabel LabelChCao = new JLabel("Chi\u1EC1u cao (cm)");
		LabelChCao.setBounds(65, 84, 120, 17);
		frame.getContentPane().add(LabelChCao);
		
		JLabel LabelCanNang = new JLabel("C\u00E2n n\u1EB7ng (kg)");
		LabelCanNang.setBounds(65, 53, 120, 14);
		frame.getContentPane().add(LabelCanNang);
		
		JLabel lblNewLabel_2 = new JLabel("BMI c\u1EE7a b\u1EA1n");
		lblNewLabel_2.setBounds(82, 218, 82, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea BMIResult = new JTextArea();
		BMIResult.setBounds(174, 213, 89, 22);
		frame.getContentPane().add(BMIResult);
			
		JTextArea BMIRate = new JTextArea();
		BMIRate.setBounds(273, 213, 126, 22);
		frame.getContentPane().add(BMIRate);
		
		JButton btnNewButton = new JButton("Tính BMI");
		btnNewButton.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						String valueA = CanNang.getText();
						String valueB = ChCao.getText();
						
						double a,b,result;
						try 
						{
							a = Double.parseDouble(valueA);
						}
						catch (Exception ex)
						{
							a = 0;
							CanNang.setText(String.valueOf(a));
						}
						try 
						{
							b = Double.parseDouble(valueB);
						}
						catch (Exception ex)
						{
							b = 0;
							ChCao.setText(String.valueOf(a));
						}
						result = (100*100*a)/(b*b);
						BMIResult.setText(String.valueOf(result));
						if (Asian.isSelected() == true)
						{
							if (result <18.5) BMIRate.setText("Underweight");
							else if (result>=18.5 && result <=22.9)BMIRate.setText("Normal");

							else if (result >=23 && result <=24.9)	BMIRate.setText("Overweight");
							
							else if (result >= 30 && result <=40) BMIRate.setText("Obese");
							else if (result >= 40.1 && result <=50) BMIRate.setText("Morbid obese");
							else if (result >50) BMIRate.setText("Super obese");
						}
						else
						{
							if (result <18.5) BMIRate.setText("Underweight");
							else if (result>=18.5 && result <=24.9) BMIRate.setText("Normal");
							else if (result >=25 && result <=29.9) BMIRate.setText("Overweight");
							else if (result >= 30 && result <=40) BMIRate.setText("Obese");
							else if (result >= 40.1 && result <=50) BMIRate.setText("Morbid obese");
							else if (result >50) BMIRate.setText("Super obese");
						}
					}
			
				});
		btnNewButton.setBounds(171, 179, 89, 23);
		frame.getContentPane().add(btnNewButton);	

	}
}
