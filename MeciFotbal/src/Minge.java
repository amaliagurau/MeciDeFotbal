
public class Minge {

	private int x;
	private int y;
	
	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void suteaza() throws ExceptieOut, ExceptieGol, ExceptieCorner {
		CoordinateGenerator cg  = new CoordinateGenerator();
		x = cg.generateX();
		y = cg.generateY(); 
		
		if (y == 0 || y == 50)
			throw new ExceptieOut("out!");
		else if(x==0 || x ==100) {
			if(y>=20 && y<=30)
				throw new ExceptieGol("gol!");
			else
				throw new ExceptieCorner("corner!");
		}
			
	}
}