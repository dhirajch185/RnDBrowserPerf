package MasterPackage;

public class Loops {

	public static void main(String[] args) {

		/******************** For Loop ********************/
		
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
				
		/******************** While Loop ********************/
				
		int y = 1;
		while (y<=10){
			System.out.println("Value of variable 'y' is ---> " + y);
			y++;
		}
		
		/******************** do While Loop ********************/
		int z = 100;
		do{
			System.out.println("Value of variable z is --->" + z);
			z-=10;
		}
		while(z>=10);
		
	}

}
