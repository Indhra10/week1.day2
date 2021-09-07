package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
		int[] arr1= {3,2,11,4,6,7};	
		int[] arr2= {1,2,8,4,9,7};
		int k=0,l=0;
		
		for (int i=0;i<=arr1.length;i++)
		{
			
			k=arr1[i];
			for (int j=0;j<=arr2.length;j++)
			{
				l=arr2[i];
			}
			if (k==l)
			{
				System.out.println("Match found: "+k);
				break;
			}
		}
		}
	}
	

