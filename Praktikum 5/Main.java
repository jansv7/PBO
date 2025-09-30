package Praktikum;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("NPM: ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        double hadir = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();
        
        Mahasiswa mhs = new Mahasiswa(npm, nama, hadir, tugas, uts, uas);
        mhs.tampilkanData();
	}
}
