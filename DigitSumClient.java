/* Defines s(n) so that the smallest number has a digit sum of n.
 * For example, s(10) = 19 because 1 + 9 = 10 and that is the smallest number possible
 */

public class DigitSumClient {

	public static void main(String[] args) {
		DigitSum num = new DigitSum(10);
		
		num.inverse();
		System.out.println(num.getInversesum());
	}

}
