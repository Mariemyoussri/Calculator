package calculator;

public class calculator implements ICalculator{
 public calculator () {
	 
 }
	public int add(int x, int y) {
		return x+y ;
	}

	public float divide(int x, int y) throws RuntimeException {
		if(y==0) {
			throw new ArithmeticException("Error: Division by zero");
		}
		else {
		float ans = (float) x /y ;	
		return ans;
		} 
	}
	
}
