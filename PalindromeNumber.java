package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int ai=373;
		int mi=ai;
		int ia=0,quo=0,rem=0;
		int[] aiarr = {0,0,0};
		int i=0;
		
		while (mi!=0)
		{
			quo=mi/10;
			rem=mi%10;
			aiarr[i]=rem;
			i++;
			mi=quo;
			
		}	
		
		ia=(aiarr[0]*100) + (aiarr[1]*10) + aiarr[2];
		 System.out.println("The given number is: " +ai);
		 System.out.println("The reversal is: " +ia);
		if (ai==ia)
			System.out.println("the given number is palindrome");
		else
			System.out.println("the given number is not a palindrome");
		

	}

}
