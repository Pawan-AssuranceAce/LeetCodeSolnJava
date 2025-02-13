//https://www.youtube.com/watch?v=lmRkpPrxF-g
package leetCodeRevisionOne;

public class LeetCode383RansomNote {
	
	public static boolean ransomNote(String ransomNote, String magazine)
	{
		int[] count = new int[26];
		for(char m : magazine.toCharArray())
		{
			count[m-'a']++;
		}
		for(char rn : ransomNote.toCharArray())
		{
			count[rn-'a']--;
			if(count[rn-'a']<0)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String ransomNote ="aa";
		String magazine ="aab";
		System.out.println(ransomNote(ransomNote,magazine));

		
	}

}
