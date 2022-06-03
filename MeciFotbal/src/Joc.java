
public class Joc {
	private String echipa1;
	private String echipa2;
	private int gol1;
	private int gol2;
	private int out;
	private int corner;
	
	public Joc(String echipa1, String echipa2) {
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
	}

	@Override
	public String toString() {
		return "numeEchipa1=" + echipa1 + ": " + gol1 + " goluri" +
				"numeEchipa2=" + echipa2 + ": " + gol2 + " goluri" +
				 ", numarTotalCornere=" + corner + ", numarTotalOut= " + out;
	}
	
	public void simuleaza()
	{
		Minge minge = new Minge(50, 25);
		
		for(int i=0; i<=1000; i++)
		{
			try {
				minge.suteaza();
			}
			catch(ExceptieOut e) {
				minge = new Minge(minge.getX(), minge.getX());
			}
			catch(ExceptieCorner e) {
				if(minge.getX() == 0)
					if(minge.getY()<=20)
						minge = new Minge(0, 0);
					else
						minge = new Minge(0, 50);
				else
					if(minge.getY()<=20)
						minge = new Minge(100, 0);
					else
						minge = new Minge(100, 50);
			}
			catch(ExceptieGol e) {
				minge = new Minge(50, 25);
			}
			finally {
				System.out.println(echipa1 + " - " + echipa2 + 
						": Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY()+ ")");
			}
		}
	}
}
