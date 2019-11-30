/* Defines s(n) so that the smallest number has a digit sum of n.
 * For example, s(10) = 19 because 1 + 9 = 10 and that is the smallest number possible
 */

public class DigitSum {
	private double preconversion;
	private String inversesum;
	
	DigitSum(double pc){
		preconversion = pc;
	}
	
	public void inverse() {	
		int i = 0;
		double postconversion;
		do {
			String tempi = Integer.toString(i);
			postconversion = 0;
			inversesum = "";
			
			for(int x = 0; x < tempi.length(); x++) {
				postconversion += Character.getNumericValue(tempi.charAt(x));
				inversesum += tempi.charAt(x);
			}
			i++;
		}while(postconversion != preconversion);
	}
	
	public String getInversesum() {
		return inversesum;
	}
}
