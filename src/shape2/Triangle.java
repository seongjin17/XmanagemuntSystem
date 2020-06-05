package shape2;

public class Triangle implements Shape {
	int h,w;
	public Triangle(int h, int w) {
		 this.w = w;
	     this.h = h;
	
	}
	@Override
	public void getArea() {
		System.out.println("삼각형의 크기:"+ w*h/2);

	}

}
