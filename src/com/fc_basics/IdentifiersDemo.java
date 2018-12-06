//Identifiers for Identification purpose
package com.fc_basics;

public class IdentifiersDemo {		//Identifiers - Class name
	/*main - method name
	String - predefined class name
	args - variable name*/
	
	public static void main(String[] args) {
	
	//Valid Identifiers	
		String myvariable;
		String myVariable;	//case-sensitive
		String var123;	//Alpha-numeric
		String $myVar;	//dollar-sign
		String _myVar;	//underscore
		
	/*Invalid Identifiers
		String my variable; 	contains space
		String 12var;		Begins with digit
		String s+r;		 + not an alphanumeric character (-,*,/)
		String sum&avg;			& not an alphanumeric character
		String while; 	while - reserved words (53 -> keywords(50) & literals(3)(true,false,null)) */
	}

}
