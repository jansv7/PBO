public class MatematikaInheritance {
	public static void main (String[] args) {
		Matematika mtk1 = new Matematika();
		System.out.println("Pertambahan: 20 + 10= " + mtk1.pertambahan(20,10));
		System.out.println("Pengurangan: 10 - 5= " + mtk1.pengurangan(10,5));
		System.out.println("Perkalian: 10 x 3= " + mtk1.perkalian(10,3));
		System.out.println("Pembagian: 21 / 2= " + mtk1.pembagian(21,2));
		
		Matematika2 mtk2 = new Matematika2();
		System.out.println("Pertambahan (Matematika2): 7+3= " + mtk2.pertambahan(7,3));
		System.out.println("Modulus: 21 % 2 " + mtk2.modulus(21,2));
	}
}