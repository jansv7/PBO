package Satu;

public class Kucing extends Hewan {
	public Kucing (String nama, int umur) {
		super(nama, umur);
	}
	
	@Override
	public void makan() {
		System.out.println(getNama() + " sedang makan ikan.");
	}
	
	@Override
	public void tidur() {
		System.out.println(getNama() + " sedang tertidur.");
	}
	
	@Override
	public void bersuara() {
		System.out.println(getNama() + " Meong meong!");
	}
	
	@Override
	public void info() {
		System.out.println("Kucing - Nama: " + getNama() + ", Umur: " + getUmur());
	}
}