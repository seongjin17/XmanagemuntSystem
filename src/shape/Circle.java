package shape;

public class Circle extends Shape {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void getArea() {
		System.out.println("원의 크기:"+ r*r*3.14);

	}

}
