package projects;
class square{
	public int area(int x) {
		return x*x;
	}
}
class rectangle extends square{
	public int area(int x,int y) {
		return x*y;
	}
}
class trapezium extends rectangle{
	public double area(int x,int y,int z) {
		return (double)((x+y)*z)/2;
	}
}
public class AreaProblem {

	public static void main(String[] args) {
		trapezium t=new trapezium();
		System.out.println(t.area(2));
		System.out.println(t.area(2, 5));
		System.out.println(t.area(2, 3, 5));
		// TODO Auto-generated method stub

	}

}
