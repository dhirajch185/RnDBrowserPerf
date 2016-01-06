package MasterPackage;

public class Cars {
int input1;
int input2; 
int output;
String Name;

int addition()
{
output= input1+input2;
return output;
}

int multiplication()
{
output= input1*input2;	
return output;
}

int division()
{
output= input1/input2;
return output;
}


public static void main(String[] args)
{

	Cars ocalc = new Cars();
	ocalc.input1 = 10;
	ocalc.input2 = 5;
	ocalc.Name = "Dhiraj";

	System.out.println(ocalc.addition());
	System.out.println(ocalc.multiplication());
	System.out.println(ocalc.division());
	System.out.println(ocalc.Name);

}
}