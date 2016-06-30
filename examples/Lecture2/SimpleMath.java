public class SimpleMath {
	public static void main(String[] args) {
		double input = Double.parseDouble(args[0]);
		System.out.println(SquareRoot(input));
	}
	
	public static double SquareRoot(double input) {
		return Math.sqrt(input);
	}
}