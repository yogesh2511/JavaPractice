package Helper;

public class ReverseStringExample {

	public static void main(String[] args) {

		String s1 = "Sachin is the best batsman in the world";
		String s2 = new String("Sachin is the best batsman in the world");
		String s3 = new String(s1);
		String s4 = "india is no 1 position at Test Ranking";

		reversPerCharacterInString(s4, "Ranking");

	}

	public static void reverseAllCharacter(String s) 
	{
		for (int j = s.length() - 1; j >= 0; j--) 
		{
			System.out.print(s.charAt(j));
		}
		System.out.println(" ");
	}
	public static void reversPerCharacterInString(String s1, String revchar) 
	{
		String[] strarray = s1.split(" ");

		for (int i = 0; i <= strarray.length - 1; i++) {
			if (strarray[i].equals(revchar)) {

				for (int j = strarray[i].length() - 1; j >= 0; j--) {
					System.out.print(strarray[i].charAt(j));
				}
				System.out.print(" ");

			} else {
				System.out.print(strarray[i] + " ");
			}
		}
	}
	public static void reverseWordInAllString(String rev) {
		String[] strarray = rev.split(" ");
		for (int i = strarray.length - 1; i >= 0; i--) {
			System.out.print(strarray[i] + " ");
		}
	}
	public static void reverseStringPerCharacter(String s1, String revchar) {
		// Reverse the string in array
		String[] strarray = s1.split(" ");
		for (int i = strarray.length - 1; i >= 0; i--) {
			if (strarray[i].equals(revchar)) {

				for (int j = strarray[i].length() - 1; j >= 0; j--) {
					System.out.print(strarray[i].charAt(j));
				}
				System.out.print(" ");
				// char[] chararray=strarray[i].toCharArray();
				// System.out.print(strarray[i].length());
			} else {
				System.out.print(strarray[i] + " ");
			}
		}
	}
}
