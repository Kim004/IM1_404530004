import java.util.Scanner;

class Rectangle {
	double height;
	double width;
	double x;
	double y;

	Rectangle() {
		this (0,0,0,0);
	}// important-
	
	Rectangle(double _height, double _width, double _x, double _y) {
		this.height = _height;
		this.width = _width;
		this.x = _x;
		this.y = _y;

	}

	double getHeight() {
		return this.height;
	}

	double getWidth() {
		return this.width;
	}

	double getX() {
		return this.x;
	}

	double getY() {
		return this.y;
	}
	public String toString() {
		return "java.Rectangle[x="+this.x+" y="+this.y+" height:"+ this.height+" 5width"+ this.width+"]";
	}
}
public class RectangleTester{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double h,w,x,y;
		System.out.println("java rec1");
		System.out.println("height: ");
		h = in.nextDouble();
		System.out.println("width: ");
		w = in.nextDouble();
		
		System.out.println("x:");
		x = in.nextDouble();
		System.out.println("y:");
		y = in.nextDouble();
		
		Rectangle rec1=new Rectangle(h,w,x,y);
		System.out.println(rec1.toString());
		System.out.println("Area="+rec1.getHeight()*rec1.getWidth());
		System.out.println("Perimeter="+(rec1.getHeight()+rec1.getWidth())*2);
	
		System.out.println("java rec2");
		System.out.println("height: ");
		h = in.nextDouble();
		System.out.println("width: ");
		w = in.nextDouble();
		
		System.out.println("x:");
		x = in.nextDouble();
		System.out.println("y:");
		y = in.nextDouble();
		
		Rectangle rec2=new Rectangle(h,w,x,y);
		System.out.println(rec2.toString());
		System.out.println("Area="+rec2.getHeight()*rec2.getWidth());
		System.out.println("Perimeter="+(rec2.getHeight()+rec2.getWidth())*2);
	
	}
	}


