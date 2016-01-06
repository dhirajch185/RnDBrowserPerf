package MasterPackage;

public class Loops {

	public static void main(String[] args) {
		int i = 0;
		int k = 200;
		int j;
		
		for(j=3;j>=i;j--)
		{
			System.out.println("Value of variable 'j' is --->" + j);
			k = k-10;
		}
		
		System.out.println(" ");
		
		for(i=0;i<=3;i++)//This loops 4 times increments value of i
			{
				System.out.println("Value of variable 'i' is --->" + i);
			}
		
		System.out.println(" ");
		
		
				System.out.println("Value of variable 'k' is --->" + k);
				
	}

}
