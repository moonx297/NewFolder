package G051722;

public class SquareInt {

	public static void main(String[] args) {
		
		for(int i=0; i<1000; i++) {
			float x = (float) i / 1000;
			System.out.printf("%5.3f  %10.7f\n", x, x*x);
		}

	}

}
