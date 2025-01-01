package leetCodeRevisionOne;

public class LeetCode12IntegertoRoman {
	
	public static String integerToRoman(int num)
	{
		int [] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String [] stringCode = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<intCode.length; i++)
		{
			while(num>=intCode[i])
			{
				sb.append(stringCode[i]);
				num -= intCode[i];
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
			int num = 1994;
			System.out.println(integerToRoman(num));

	}

}
