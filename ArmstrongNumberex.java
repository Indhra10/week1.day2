package week1.day2;

public class ArmstrongNumberex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Armstrong number ex: n=134, amstrong number =(1*1*1)+(3*3*3)+(4*4*4)
		int num=134;
		int quo=0, rem=0, ans=0;
		
		while (num!=0) {
			quo=num/10;
			
			rem=num%10;
			ans=ans+(rem*rem*rem);
			num=quo;
			
		}
		System.out.println("The armstrong number is " + ans);
	}

}
