package tugas;

import java.awt.*;
import javax.swing.*;

public class PenentuNilaiMahasiswa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textNama;
	private JTextField textTugas;
	private JTextField textUTS;
	private JTextField textUAS;
	private JTextField textNamaOut;
	private JTextField textRataOut;
	private JTextField textGradeOut;
	private JTextField textHasilOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> 
			new PenentuNilaiMahasiswa().setVisible(true));
		}
		

	/**
	 * Create the frame.
	 */
	public PenentuNilaiMahasiswa() {
		setTitle("Penentu Nilai Mahasiswa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLayout(null);
		
		//Panel Nama Lengkap
		JPanel panelNama = new JPanel(null);
		panelNama.setBackground(new Color(255, 153, 204));
		panelNama.setBounds(10, 10, 460, 60);
		add(panelNama);
		
//		JLabel lblNamaLengkap = new JLabel("Nama Lengkap:");
//		lblNamaLengkap.setBounds(33, 17, 100, 25);
//		panelNama.add(lblNamaLengkap);
		
		panelNama.add(new JLabel("Nama Lengkap:")).setBounds(33, 17, 100, 25);
		
		textNama = new JTextField();
		textNama.setBounds(143, 30, 150, 20);
		add(textNama);
		
		//Panel Input Nilai
		JPanel panelInput = new JPanel(null);
		panelInput.setBackground(new Color(153, 255, 153));
		panelInput.setBounds(10, 80, 219, 230);
		add(panelInput);
		
		panelInput.add(new JLabel("Nilai")).setBounds(10, 10, 100, 25);
		panelInput.add(new JLabel("Tugas Murni: ")).setBounds(10, 40, 100, 25);
		panelInput.add(new JLabel("Nilai UTS: ")).setBounds(10, 75, 100, 25);
		panelInput.add(new JLabel("Nilai UAS: ")).setBounds(10, 110, 100, 25);
		
		textTugas = new JTextField(); 
		textTugas.setBounds(110, 40, 90, 25); 
		panelInput.add(textTugas);
		
		textUTS = new JTextField();
		textUTS.setBounds(110, 75, 90, 25);
		panelInput.add(textUTS);
		
		textUAS = new JTextField();
		textUAS.setBounds(110, 110, 90, 25);
		panelInput.add(textUAS);
		
		
		//Panel Hasil
		JPanel panelHasil = new JPanel(null);
		panelHasil.setBackground(new Color(255, 255, 153));
		panelHasil.setBounds(239, 80, 231, 230);
		add(panelHasil);
		
		panelHasil.add(new JLabel("Hasil")).setBounds(10, 10, 100, 25);
		panelHasil.add(new JLabel("Nama")).setBounds(10, 45, 100, 25);
		panelHasil.add(new JLabel("Nilai Rata-rata")).setBounds(10, 75, 100, 25);
		panelHasil.add(new JLabel("Grade")).setBounds(10, 105, 100, 25);
		panelHasil.add(new JLabel("Hasil")).setBounds(10, 135, 100, 25);
		
		textNamaOut = createOutputField(110, 45, panelHasil);
		textRataOut = createOutputField(110, 75, panelHasil);
		textGradeOut = createOutputField(110, 105, panelHasil);
		textHasilOut = createOutputField(110, 135, panelHasil);
				
		
		//Panel Tombol
		JPanel panelButton = new JPanel(null);
		panelButton.setBackground(new Color(204, 255, 255));
		panelButton.setBounds(10, 320, 460, 33);
		add(panelButton);
		
		JButton btnHitung = createButton("Hitung", 20, 4);
		JButton btnBersihkan = createButton("Bersihkan", 120, 4);
		JButton btnSimpan = createButton("Simpan", 247, 4);
		JButton btnKeluar = createButton("Keluar", 347, 4);
		
		panelButton.add(btnHitung);
		panelButton.add(btnBersihkan);
		panelButton.add(btnSimpan);
		panelButton.add(btnKeluar);
		
		
		//LOGIKA BUTTON
		
		//Button Hitung
		btnHitung.addActionListener(e -> {
			try {
				double tugas = Double.parseDouble(textTugas.getText());
				double uts = Double.parseDouble(textUTS.getText());
				double uas = Double.parseDouble(textUAS.getText());
				
				double rata = (tugas + uts + uas) /3;
				String grade, hasil;
				
				if (rata>=85) grade = "A";
				else if (rata>=75) grade = "B";
				else if (rata>=65) grade = "C";
				else if (rata>=50) grade = "D";
				else grade = "E";
				
				hasil = (rata>=65) ? "LULUS" : "TIDAK LULUS";
				
				textNamaOut.setText(textNama.getText());
				textRataOut.setText(String.format("%.2f", rata));
				textGradeOut.setText(grade);
				textHasilOut.setText(hasil);
				
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Input harus berupa angka!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        });

		
		//Button Bersihkan
		btnBersihkan.addActionListener(e -> {
			textNama.setText("");
			textTugas.setText("");
			textUTS.setText("");
			textUAS.setText("");
			textNamaOut.setText("");
			textRataOut.setText("");
			textGradeOut.setText("");
			textHasilOut.setText("");
		});
		
		//Button Simpan
		 btnSimpan.addActionListener(e -> {
	            JOptionPane.showMessageDialog(this,
	                "Data berhasil disimpan!",
	                "Sukses",
	                JOptionPane.INFORMATION_MESSAGE);
	        });
		
		//Button Keluar
		 btnKeluar.addActionListener(e -> {
	            int confirm = JOptionPane.showConfirmDialog(this,
	                    "Yakin ingin keluar?",
	                    "Konfirmasi",
	                    JOptionPane.YES_NO_OPTION);
	            if (confirm == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
	        });
	    }
	
	//Method untuk output TextField
	private JTextField createOutputField (int x, int y, JPanel panel) {
		JTextField text = new JTextField();
		text.setBounds(x, y, 100, 25);
		text.setEditable(false);
		panel.add(text);
		return text;
	}
	
	//Method bantu buat tombol
	private JButton createButton (String text, int x, int y) {
		JButton btn = new JButton(text);
		btn.setBounds(x, y, 95, 25);
		return btn;
	}
}
