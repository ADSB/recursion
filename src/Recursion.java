public class Recursion {

	public static void main(String[] args) {
		rev("ABCDE");
		draw(4);
		System.out.println(countVowel("asdCXae"));
		System.out.println(gcf(690, 90));
	}

	public static void rev(String s) {
		if (s.length() > 1) {
			System.out.println(s.charAt(s.length() - 1));
			rev(s.substring(0, s.length() - 1));
		}
		else {
			System.out.println(s);
		}
	}

	public static void draw(int n) {
		String output = "";
		for (int i = 0; i < n; i++) {
			output += 'X';
		}
		System.out.println(output);
		if (n > 1) {
			draw(n - 1);
		}
		System.out.println(output);
	}

	public static int countVowel(String s) {
		char c = s.toLowerCase().charAt(0);
		if (s.length() > 1) {
			return ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0) + countVowel(s.substring(1));
		}
		else {
			return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
		}
	}

	public static int gcf(int a, int b) {
		if (a > b) {
			return gcf(a - b, b);
		}
		else if (a < b) {
			return gcf(a, b - a);
		}
		else {
			return a;
		}
	}

}
