package Satu;

abstract class Hewan implements hewanBeraksi {
	private String nama;
	private int umur;
	
	public Hewan (String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	//Encapsulation
	public String getNama() { return nama; }
	public void setNama(String nama) { this.nama = nama; }
	
	public int getUmur() { return umur; }
	public void setUmur(int umur) { this.umur = umur; }
	
	public abstract void info();
}