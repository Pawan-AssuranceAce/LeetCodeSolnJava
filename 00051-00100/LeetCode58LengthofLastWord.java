package leetCodeRevisionOne;

public class LeetCode58LengthofLastWord {
	
	
	public static int findLengthLastWord(String s)
	{
		String str = s.trim();
		String [] newstr = str.split(" ");
		String lastword = newstr[newstr.length-1];
		return lastword.length();
	}

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(findLengthLastWord(s));

	}

}
