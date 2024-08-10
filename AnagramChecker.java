import java.util.Scanner;

public class AnagramChecker
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// Getting the input string from the user
		System.out.print("Enter the First String : ");
		String s1 = scanner.nextLine();

		System.out.print("Enter the second String : ");
		String s2 = scanner.nextLine();

		if (checkAnagram(s1, s2))
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams");

		scanner.close();
	}

	public static boolean checkAnagram(String s1, String s2)
	{
		// Remove all the white space and convert to lower case
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		// Check length of both strings
		if (s1.length() != s2.length())
			return false;
		else
		{
			for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				return true;
			} else
			{
				return false;
			}
		}
	}
}