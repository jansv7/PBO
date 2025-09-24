package Tugas;

public class Kubus extends BangunRuang {
	double sisi;
	
	Kubus(double sisi) {
		this.sisi=sisi;
	}
	
	@Override
	double volume() {
		return sisi*sisi*sisi;
	}
	
	@Override
	double luasPermukaan() {
		return 6*(sisi*sisi);
	}
}