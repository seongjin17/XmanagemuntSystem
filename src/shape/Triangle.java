package shape;

public class Triangle extends Shape {
	int h,w;
	public Triangle(int h, int w) {
		 this.w = w;
	     this.h = h;
	
	}
	
	@Override
	public void getArea() {
		System.out.println("�ﰢ���� ũ��:"+ w*h/2);
		
		

	}

}
