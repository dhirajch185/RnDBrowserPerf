package MasterPackage;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		
		// 'if' condition
		int i = 10;
		int j = 20;
		if (i<j){
			System.out.println("This is 'if' condition");
		}
		
		// 'if - else' condition
		if(i>j){
			System.out.println("Condition is true - IF Statement");
		}
		else
		{
			System.out.println("Condition is False - Else statement");
		}
		
		// Nested 'if - else' 
		if(j == i){
			System.out.println(" 'If' statement is nested if'else loop");
		}
		else if(j>=20)
		{
			System.out.println("Firs't else statement' in 'if else nested loops");
		}
		else
		{
			System.out.println("Second else statement in 'if else' nested loops");
		}

	}

}
