package Tugas;

public class Balok extends BangunRuang {
	double panjang, lebar, tinggi;
	
	Balok(double panjang, double lebar, double tinggi) {
		this.panjang=panjang;
		this.lebar=lebar;
		this.tinggi=tinggi;
	}
	
	@Override
	double volume () {
		return panjang*lebar*tinggi;
	}
	
	@Override
	double luasPermukaan() {
		return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
	}
}
