package stepDefinitions;

public class ReverseString {

	public static void main(String[] ar) {

		String name = "reevnat";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println(rev);
	}
}
