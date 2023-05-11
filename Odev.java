import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
		double mesafeBasina = 2.20;
		double toplam;
		double acilisUcreti = 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gidilen mesafeyi (KM) girin: ");
		double mesafe = scanner.nextDouble();
		
		toplam = acilisUcreti + (mesafe * mesafeBasina);
		toplam = (toplam < 20) ? 20 : toplam;
		
		System.out.println("Taksimetre Tutarı : " + toplam + "TL");
	}
}
