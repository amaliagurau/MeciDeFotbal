
public class Meciuri {

	public static void main(String[] args) {
		Joc joc1 = new Joc("Italia", "Romania");
		Joc joc2 = new Joc("Spania", "Bulgaria");
		
		joc1.simuleaza();
		joc2.simuleaza();
		
		System.out.println("Joc 1: " + joc1.toString());
		System.out.println("Joc 2: " + joc1.toString());
	}
}