package shape;

abstract public class Shape {
	private int size;
	
	
	public void setSize(int size) {
		this.size = size;
	}


	public abstract void getArea();
}
