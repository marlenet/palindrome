
public class palindrome {

	public static void main(String[] args) {
		// palindrome is something that can be read both backwards and forward and
		//it says the same thing e.g. 12321 
		String word = "12321";
		char[] word2= word.toCharArray();
		
		if(check_palindrome(word2)==true)
		{
			System.out.println("This is a palindrome");
		}
		else
			System.out.println("This is not a palindrome");
			
	}
	
	static boolean check_palindrome(char word1[])
	{
		int size=word1.length;
		boolean isPalindrome=true;

		for(int i=0; i<size; i++)
		{
			if(word1[i]!=word1[size-1-i])
				{isPalindrome=false;
				break;
				}
		}
		return isPalindrome;
	}

}
