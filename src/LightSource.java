
public class LightSource {

	private double xPos;
	private double yPos;
	private double intensity;
	
	public LightSource(double x, double y, double i) {
		xPos = x;
		yPos = y;
		intensity = i;
	}
	
	public double getX() {
		return xPos;
	}

	public double getY() {
		return yPos;
	}

	public double getIntensity() {
		return intensity;
	}

}
