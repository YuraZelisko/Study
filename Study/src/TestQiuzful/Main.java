package TestQiuzful;

import java.util.Formatter;

public class Main {
	
	

	public static final void main(String... args){
		Integer a = 0;
		Integer v = -1;
		Integer s = 1;
		Formatter f = new Formatter();
		f.format("%1$b", a.toString());
		f.format("%1$b", v.toString());
		f.format("%1$b", s.toString());
		System.out.println(f.toString());
	}

}
