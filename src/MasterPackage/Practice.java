package MasterPackage;

public class Practice {

	public static void main(String[] args){
	String st1 = "This is very nice";
	String st2 = "                  and beautiful";
	
	// comparing two strings. If it matches, returns true else false.
	System.out.println("st1 equals to st2? ---> " + st1.equals(st2));
	
	// Concatenate st1 with st2
	System.out.println("Concatenation of st1 and st2 is ---> " + st1.concat(st2));
	
	// Retrieve 9th indexed string from char string
	System.out.println("character at 9th index is ---> " + st2.charAt(9));	
	
	// length of a string
	System.out.println(" Length of the string is ---> " + st1.length());
	
	// Converting the whole string to lower case
	System.out.println(" Converting string to lower case ---> " + st1.toLowerCase());
	
	
	// Converting the whole string to upper case
	System.out.println(" Converting string to lower case ---> " + st1.toUpperCase());
		
	// Retrieve the index of first character 'i'
	System.out.println("First occurence of character 'i' is at index ---> " + st1.indexOf('i'));
	
	// Retrieve index of second occurence of character i
	/*st1.indexOf('i', 3)) will retrieve Index of second most character 'i' from string. 
	 3 described the from Index means It will start finding character 'i' from Index 3. 
	 First 'i' has Index 2 so we need to use 3 to find 2nd most character*/
	
	System.out.println("Second occurence of character 'i' is at index ---> " + st1.indexOf('i',3));
	
	// Retrieve index of a word 'very' in the string
	System.out.println("Index of the word 'very' in the string is ---> " + st1.indexOf("very"));
	
	// Converting int to string
	int j = 75;
	String val22 = String.valueOf(j);
	System.out.println("Value of string val22 is ---> " + val22);
	
	// Converting string to integer
	String val11 = "50";
	int i = Integer.parseInt(val11);
	System.out.println("Value of int i is ---> "+ i);
	
	// print string that starts at index 5 and ends at index 12
	System.out.println("Retrieving substring from a string is --->" + st1.substring(5,12));
	
	//split string
	String splt[] = st1.split("very");
	System.out.println("String part 1 is ---> "+ splt[0]);
	System.out.println("String part 2 is ---> "+ splt[1]);
	
	// Trim string
	System.out.println("Trimmed string is ---> " + st2.trim());
		
	}

}
