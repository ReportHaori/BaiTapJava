package phan_quang_huy;


import java.awt.*;
import java.awt.event.*;
public class GuiTong extends Frame {
	TextField txtX, txtY, txtSum;
	Label lblX, lblY, lblSum;
	Button btnAdd;

	public GuiTong() {
		setSize(300, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setTitle("Tinh tong 2 so X va Y");

		lblX = new Label("X = ");
		lblY = new Label("Y = ");
		lblSum = new Label("X + Y = ");

		txtX = new TextField();
		txtY = new TextField();
		txtSum = new TextField();

		txtSum.setEditable(false);

		btnAdd = new Button("X + Y");

		add(lblX);
		add(txtX);
		add(lblY);
		add(txtY);
		add(btnAdd);
		add(lblSum);
		add(txtSum);

		lblX.setLocation(50, 80);
		lblX.setSize(20, 20);
		txtX.setLocation(80, 80);
		txtX.setSize(160, 20);

		lblY.setLocation(50, 140);
		lblY.setSize(20, 20);
		txtY.setLocation(80, 140);
		txtY.setSize(160, 20);

		btnAdd.setLocation(125, 220);
		btnAdd.setSize(50, 30);

		lblSum.setLocation(40, 300);
		lblSum.setSize(50, 20);
		txtSum.setLocation(90, 300);
		txtSum.setSize(160, 20);

		btnAdd.addActionListener(new BtnAddActionListener());

		addWindowListener(new CloseWindowListener());

		setVisible(true);
	}
	
	class BtnAddActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtX.getText();
			String strB = txtY.getText();

			double a, b, sum;

			try {
				a = Double.parseDouble(strA);
			} catch (Exception ex) {
				a = 0;
				txtX.setText(String.valueOf(a));
			}

			try {
				b = Double.parseDouble(strB);
			} catch (Exception ex) {
				b = 0;
				txtY.setText(String.valueOf(b));
			}

			sum = a + b;
			txtSum.setText(String.valueOf(sum));
		}

	}

	class CloseWindowListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}