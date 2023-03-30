package application;

public class Dragger {
	double initialX, initialY;
	
	public Dragger(double x, double y) {
		initialX = x;
		initialY = y;
	}

	public double getInitialX() {
		return initialX;
	}

	public void setInitialX(double initialX) {
		this.initialX = initialX;
	}

	public double getInitialY() {
		return initialY;
	}

	public void setInitialY(double initialY) {
		this.initialY = initialY;
	}
}
