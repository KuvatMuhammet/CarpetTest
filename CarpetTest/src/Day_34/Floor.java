package Day_34;

public class Floor {	
	
	double width;	
	double length;

	public Floor(double width, double length) {
	
		this.width = width;
		if(this.width<0) {
			this.width = 0;
		}
		this.length = length;	
		if(this.length<0) {
			this.length = 0;
		}		
	}
	
	public double getArea() {
		return width * length;
	}
}
