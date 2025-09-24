package Tugas;

public class Main {
	public static void main (String[] args) {
		BangunRuang b1 = new Kubus(5);
		BangunRuang b2 = new Balok(4, 3, 2);
		
		System.out.println("Kubus:");
		System.out.println("Volume = " + b1.volume());
		System.out.println("Luas Permukaan = " + b1.luasPermukaan());
		
		System.out.println("\nBalok:");
		System.out.println("Volume = " + b2.volume());
		System.out.println("Luas Permukaan = " + b2.luasPermukaan());
	}
}