package Satu;

public class Anjing extends Hewan {
	public Anjing (String nama, int umur) {
		super(nama, umur);
	}
	
	@Override
	public void makan() {
		System.out.println(getNama() + " sedang makan tulang.");
	}
	
	@Override
	public void tidur() {
		System.out.println(getNama() + " sedang tertidur.");
	}
	
	@Override
	public void bersuara() {
		System.out.println(getNama() + " Guk guk guk!.");
	}
	
	@Override
	public void info() {
		System.out.println("Anjing - Nama: " + getNama() + ", Umur: " + getUmur());
	}
}