package shape;

public class Rectangle extends Shape {
	int i,j;
		
	public Rectangle(int i, int j) {
		 this.i = i;
	     this.j = j;
		
	}
	@Override
	public void getArea() {
		System.out.println("�簢���� ũ��:"+ i*j);

	}

}
