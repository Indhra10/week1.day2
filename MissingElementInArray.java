package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] A= {0,1,5,3,6,2,7};
		 
		 Arrays.sort(A);
		 
		 int I=Array.getLength(A);
		 
		 for(int i=0;i<=I;i++)
		 {
			 if(i!=A[i])
			 {
				 System.out.println("The missing number is: " +i);
				 break;
		 }
		 }
		 
	}

}
