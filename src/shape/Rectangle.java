package shape;

public class Rectangle extends Shape {
	int i,j;
		
	public Rectangle(int i, int j) {
		 this.i = i;
	     this.j = j;
		
	}
	@Override
	public void getArea() {
		System.out.println("사각형의 크기:"+ i*j);

	}

}
