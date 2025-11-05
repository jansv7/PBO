package tugas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textAngka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->
			new Kalkulator().setVisible(true));
	}

	/**
	 * Create the frame.
	 */
	public Kalkulator() {
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		setLayout(null);
		
		JPanel panelInput = new JPanel(null);
		panelInput.setBackground(new Color(255, 182, 193));
		panelInput.setBounds(72, 30, 376, 53);
		add(panelInput);
		panelInput.setLayout(null);
		
		textAngka = new JTextField();
		textAngka.setBounds(32, 12, 310, 30);
		panelInput.add(textAngka);
		
		JPanel panelAngka = new JPanel(null);
		panelAngka.setBackground(new Color(248, 248, 255));
		panelAngka.setBounds(72, 93, 238, 173);
		add(panelAngka);
		panelAngka.setLayout(null);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(10, 10, 70, 34);
		panelAngka.add(btn8);
		btn8.addActionListener(e -> tambahAngka("8"));
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(84, 10, 70, 34);
		panelAngka.add(btn7);
		btn7.addActionListener(e -> tambahAngka("7"));
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(158, 10, 70, 34);
		panelAngka.add(btn9);
		btn9.addActionListener(e -> tambahAngka("9"));
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 49, 70, 34);
		panelAngka.add(btn4);
		btn4.addActionListener(e -> tambahAngka("4"));
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(84, 49, 70, 34);
		panelAngka.add(btn5);
		btn5.addActionListener(e -> tambahAngka("5"));
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(158, 49, 70, 34);
		panelAngka.add(btn6);
		btn6.addActionListener(e -> tambahAngka("6"));
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 89, 70, 34);
		panelAngka.add(btn1);
		btn1.addActionListener(e -> tambahAngka("1"));
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(84, 89, 70, 34);
		panelAngka.add(btn2);
		btn2.addActionListener(e -> tambahAngka("2"));
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(158, 89, 70, 34);
		panelAngka.add(btn3);
		btn3.addActionListener(e -> tambahAngka("3"));
		
		JButton btnKoma = new JButton(".");
		btnKoma.setBounds(10, 131, 70, 34);
		panelAngka.add(btnKoma);
		btnKoma.addActionListener(e -> tambahAngka("."));
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(84, 131, 70, 34);
		panelAngka.add(btn0);
		btn0.addActionListener(e -> tambahAngka("0"));
		
		JButton btnC = new JButton("C");
		btnC.setBounds(158, 131, 70, 34);
		panelAngka.add(btnC);
		btnC.addActionListener(e -> {
			textAngka.setText("");
		});		
		
		
		JPanel panelOperation = new JPanel(null);
		panelOperation.setBackground(new Color(248, 248, 255));
		panelOperation.setBounds(320, 93, 128, 173);
		add(panelOperation);
		setLayout(null);
		
		
		final double[] angkaPertama = new double[1];
		final String[] operator = new String[1];
		
		JButton btnTambah = new JButton("+");
		btnTambah.setBounds(10, 10, 49, 34);
		panelOperation.add(btnTambah);
		btnTambah.addActionListener(e -> {
			angkaPertama[0] = Double.parseDouble(textAngka.getText());
			operator[0] = "+";
			textAngka.setText("");
		});
		
		JButton btnKurang = new JButton("-");
		btnKurang.setBounds(70, 10, 49, 34);
		panelOperation.add(btnKurang);
		btnKurang.addActionListener(e -> {
			angkaPertama[0] = Double.parseDouble(textAngka.getText());
			operator[0] = "-";
			textAngka.setText("");
		});
		
		JButton btnKali = new JButton("*");
		btnKali.setBounds(10, 51, 49, 34);
		panelOperation.add(btnKali);
		btnKali.addActionListener(e -> {
			angkaPertama[0] = Double.parseDouble(textAngka.getText());
			operator[0] = "*";
			textAngka.setText("");
		});
		
		JButton btnBagi = new JButton("/");
		btnBagi.setBounds(70, 51, 49, 34);
		panelOperation.add(btnBagi);
		btnBagi.addActionListener(e -> {
			angkaPertama[0] = Double.parseDouble(textAngka.getText());
			operator[0] = "/";
			textAngka.setText("");
		});
		
		JButton btnSamaDengan = new JButton("=");
		btnSamaDengan.setBounds(10, 90, 49, 34);
		panelOperation.add(btnSamaDengan);
		btnSamaDengan.addActionListener(e -> {
			double angkaKedua = Double.parseDouble(textAngka.getText());
			double hasil = 0;
			
			switch (operator[0]) {
			case "+":
				hasil = angkaPertama[0] + angkaKedua;
				break;
			case "-":
				hasil = angkaPertama[0] - angkaKedua;
				break;
			case "*":
				hasil = angkaPertama[0] * angkaKedua;
				break;
			case "/":
				if (angkaKedua == 0) {
					JOptionPane.showMessageDialog(this, "Tidak bisa dibagi 0!");
					return;
				}
				hasil = angkaPertama[0] / angkaKedua;
				break;
			case "%":
				hasil = angkaPertama[0] % angkaKedua;
				break;
			}
			textAngka.setText(String.valueOf(hasil));
		});
		
		JButton btnMod = new JButton("%");
		btnMod.setBounds(70, 90, 49, 34);
		panelOperation.add(btnMod);
		btnMod.addActionListener(e -> {
			angkaPertama[0] = Double.parseDouble(textAngka.getText());
			operator[0] = "%";
			textAngka.setText("");
		});
		
		JButton btnB = new JButton("B");
		btnB.setBounds(10, 131, 49, 34);
		panelOperation.add(btnB);
		btnB.addActionListener(e -> {
			String textSekarang = textAngka.getText();
			if(!textSekarang.isEmpty()) {
				String textBaru = textSekarang.substring(0, textSekarang.length() - 1);
				textAngka.setText(textBaru);
			}
		});
		

		JButton btnE = new JButton("E");
		btnE.setBounds(70, 131, 49, 34);
		panelOperation.add(btnE);
		btnE.addActionListener(e -> {
			System.exit(0);
		});
		btnE.setToolTipText("Exit");
		}
	
	private void tambahAngka(String angka) {
		String teksSekarang = textAngka.getText();
		textAngka.setText(teksSekarang + angka);
	}
}
