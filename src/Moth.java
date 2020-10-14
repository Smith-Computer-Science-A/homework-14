
public class Moth {

	/* Methods to write:
	 * double attraction(LightSource ls)
	 * void moveTowards(LightSource ls)
	 * LightSource mostAttractive(LightSource[] sources)
	 * void movement(LightSource[] sources)
	 */
	
	private double xPos, yPos;
	
	public Moth(double x, double y) {
		xPos = x;
		yPos = y;
	}
	
	public double attraction(LightSource ls) {
		double distance = Math.sqrt(Math.pow(xPos - ls.getX(), 2) +
									Math.pow(yPos - ls.getY(), 2));
		return ls.getIntensity() / Math.pow(distance, 2);
	}
	
	public void moveTowards(LightSource ls) {
		xPos = xPos + (ls.getX() - xPos) / 2;
		yPos = yPos + (ls.getY() - yPos) / 2;
	}
	
	public LightSource mostAttractive(LightSource[] sources) {
		LightSource best = sources[0];
		double most = attraction(best);
		for (LightSource l : sources) {
			double a = attraction(l);
			if (a > most) {
				most = a;
				best = l;
			}
		}
		return best;
	}
	
	public void movement(LightSource[] sources) {
		LightSource ls = mostAttractive(sources);
		moveTowards(ls);
	}
	
	/* This method is here only so that you
	 * do not need to continually switch back
	 * and forth to the Tests class to check your
	 * code
	 */
	public static void main(String[] args) {
		Tests.runTests();
	}
}
