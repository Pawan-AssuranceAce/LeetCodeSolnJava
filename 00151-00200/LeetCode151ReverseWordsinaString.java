package leetCodeRevisionOne;

public class LeetCode151ReverseWordsinaString {

		public static String reverseWord(String s)
		{
			String [] str = s.trim().split(" ");
			StringBuilder sb = new StringBuilder();
			 for(int i =str.length-1; i>=0;i--)
			 {
				 if(str[i].length()>0)
				 {
					 sb.append(str[i].concat(" "));
				
				 }
			 }
			 return sb.toString().trim();
		}

		public static void main(String[] args) {
		String s ="a good   example";
		System.out.println(reverseWord(s));
		}
	}


