package stepDefinitions;

public class Reverse_Integer {

	public static void main(String[] ar) {

		long num = 7654321;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

	}

}
