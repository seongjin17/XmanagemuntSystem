package shape2;

public class Rectangle implements Shape {
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
