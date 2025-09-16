
public class DemoKonversiSuhu {
	public static void main(String[] args) {
        // Objek dari KonversiSuhu
        KonversiSuhu suhu1 = new KonversiSuhu();
        System.out.println("Celcius 25 ke Fahrenheit = " + suhu1.celciusToFahrenheit(25));
        System.out.println("Celcius 25 ke Reamur     = " + suhu1.celciusToReamur(25));

        // Objek dari KonversiSuhu2
        KonversiSuhu2 suhu2 = new KonversiSuhu2();
        System.out.println("Celcius 100 ke Fahrenheit = " + suhu2.celciusToFahrenheit(100));
        System.out.println("Celcius 100 ke Reamur     = " + suhu2.celciusToReamur(100));
        System.out.println("Fahrenheit 212 ke Reamur  = " + suhu2.fahrenheitToReamur(212));
    }
}