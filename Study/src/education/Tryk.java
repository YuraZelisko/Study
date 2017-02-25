package education;

public class Tryk {

	int height;
	int width;

//	public Tryk() {
//		this.height = height;
//		this.width = width;
//
//	}
//	
	public Tryk(int height, int width) {
		super();
		this.height = height;
		this.width = width;

	}
	public  int squere (){
		int squere = height * width;
		System.out.println("Площа прямокутника = ");
		return squere;
	}
	public  int perimetr (){
		int perimetr = (height + width) * 2;
		System.out.println("Периметр прямокутника = ");
//		perimetr = perimetr* perimetr;
//		System.out.println("Квадрат перитметра = "+ perimetr);
		return perimetr;
	}
	public int rotate90(){
		int x = 0;
		int y = 0;
		x = width;
		y = height;
		width= y;
		height= x;
		System.out.println("прямокутник перевернутий");
		return 0;
		
	}
	
	public double diagonal(){
		double diagonal = Math.sqrt((height*height)+(width*width)) ;
		System.out.println("діагональ прямокутника = ");
		return diagonal;
		
	}

}
