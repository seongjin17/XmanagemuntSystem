package shape;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape sha[]=new Shape[3];
		sha[0]= new Triangle(3,4);
		sha[1]= new Rectangle(4,4);
		sha[2]= new Circle(5);
		for(int k=0;k<3;k++) {
			sha[k].getArea();
		}
		

	}

}
