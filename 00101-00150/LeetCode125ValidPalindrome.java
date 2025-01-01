package leetCodeRevisionOne;

public class LeetCode125ValidPalindrome {
	
	public static boolean checkPalindrome(String s)
	{
		String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		if(str.equals(sb.toString()))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String s="A man, a plan, a canal: Panama";
		System.out.println(checkPalindrome(s));

	}

}
