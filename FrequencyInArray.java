package week1.day2;

public class FrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] name= {'i','n','d','h','r','a','p','r','i','y','a','d','h','a','r','s','h','i','n','i'};
		int count=0;
		int length= name.length -1;
		for(int i=0;i<=length;i++)
		{
			for (int j=length;j>=0;j--)
			{
				if (name[i]==name[j])
					count++;
				
			}
			System.out.println("The number of existance of " +name[i]);
			System.out.println(count);
			count=0;
		}
		
		
		
		

	}
}
	