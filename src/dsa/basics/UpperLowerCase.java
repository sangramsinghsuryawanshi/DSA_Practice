import java.util.Scanner;
public class UpperLowerCase
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		if(ch >='A' && ch<='Z')
		{
			System.out.println("Character is a uppercase");
		}
		else
		{
			System.out.println("Character is lowercase");
		}
	}
}