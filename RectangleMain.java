class Rectangle{
	double length;
	double breath;
	public Rectangle(double length,double breath){
		this.length= length;
		this.breath=breath;
	}
	void calculateArea(){
		double area =length*breath;
		System.out.println("Area is "+area);
	}
}
class RectangleMain{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(3,2);
		Rectangle r2=new Rectangle(5,6);
		Rectangle r3=new Rectangle(10,15);
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
	}
}