package shape2;

public class Circle implements Shape {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	@Override
	public void getArea() {
		System.out.println("���� ũ��:"+ r*r*3.14);
	}

}
