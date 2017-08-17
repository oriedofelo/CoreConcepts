package ke.co.learning.recursion;
import java.math.BigInteger;

public class FactorialCalculator {

	public static BigInteger factorial(BigInteger number) {
		if (number.compareTo(BigInteger.ONE) <= 1)
			return BigInteger.ONE;
		else {
			BigInteger result = number.multiply(factorial(number.subtract(BigInteger.ONE)));
			return result;
		}
	}

	public static void main(String[] args) {
		for (int counter = 0; counter <= 21; counter++) {
			System.out.printf("%d! = %d\n", counter, factorial(BigInteger.valueOf(counter)));
		}
	}

}
