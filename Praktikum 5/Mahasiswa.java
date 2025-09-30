package Praktikum;

public class Mahasiswa {
	String nama;
	String npm;
	double hadir, tugas, uts, uas;
	
	public Mahasiswa (String nama, String npm, double hadir, double tugas, double uts, double uas) {
		this.nama = nama;
		this.npm = npm;
		this.hadir = hadir;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
	}
	
	public double hitungNilaiAkhir() {
		return(0.10*hadir) + (0.20*tugas) + (0.30*uts) + (0.40*uas);
	}
	
	public String getGrade() {
		double nilai = hitungNilaiAkhir();
		if (nilai>=76) return "A";
		else if (nilai>=66) return "B";
		else if (nilai>=56) return "C";
		else if (nilai>=46) return "D";
		else return "E";
	}
	
	public String getKeterangan() {
		switch(getGrade()) {
		case "A": return "Istimewa";
		case "B": return "Baik";
		case "C": return "Cukup";
		case "D": return "Kurang";
		default: return "Kurang Sekali";
		}
	}
	
	public void tampilkanData() {
		System.out.println("\n=== Data Nilai ===");
		System.out.println("NPM Mahasiswa: " + npm);
		System.out.println("Nama Mahasiswa: " + nama);
		System.out.println("Nilai Rata-rata: " + hitungNilaiAkhir());
		System.out.println("Grade: " + getGrade());
		System.out.println("Keterangan: " + getKeterangan());
	}
}
