
package com.fc_basics;
import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalDemo {

	public static void main(String[] args) {
		
		//Using double
		double d1 = 0.4;
		double d2 = 0.3;
		double ans1 = d1-d2;
		System.out.println("ans(double) : "+ans1);	//output : 0.10000000000000003
		
		//using BigDecimal
		BigDecimal bd1 = new BigDecimal("0.4");
		BigDecimal bd2 = new BigDecimal("0.3");
		BigDecimal ans2 = bd1.subtract(bd2);
		System.out.println("ans(BigDecimal) : "+ans2);	//output : 0.1
		
		//For ease of initialization - pre-defined constants
		BigDecimal b1 = BigDecimal.ZERO;
		BigDecimal b2 = BigDecimal.ONE;
		BigDecimal b3 = BigDecimal.TEN;
		System.out.println("\nPre-defined contants : ");
		System.out.println("BigDecimal.ZERO : "+b1);
		System.out.println("BigDecimal.ONE : "+b2);
		System.out.println("BigDecimal.TEN : "+b3);
		
		//Two ways of Initialization
		BigDecimal a = new BigDecimal("4");
		BigDecimal b = new BigDecimal("2");
		/*
		 * BigDecimal A = BigDecimal.valueOf(4);
		 * BigDecimal B = BigDecimal.valueOf(2);
		 */
		
	//Arithmetic Operations
		//add, subtract, multiply, divide -> BigDecimal as argument
		System.out.println("\nArithmetic operations : ");
		System.out.println("Addition : "+a.add(b));
		System.out.println("Subtraction : "+a.subtract(b));
		System.out.println("Multiplication : "+a.multiply(b));
		System.out.println("Division : "+a.divide(b));
		
		//pow -> integer as argument
		System.out.println("Pow (a): "+a.pow(2));
		System.out.println("Pow (b): "+b.pow(2));
		
		//Extraction of value from BigDecimal
		System.out.println("\nExtraction of value from BigDecimal");
		BigDecimal bd = new BigDecimal("123456789.123456789");
		System.out.println("BigDecimal value : "+bd);
		double d = bd.doubleValue();
		System.out.println("double value : "+d);
		String s = bd.toString();
		System.out.println("String value : "+s);

		//Absolute method
		BigDecimal num1 = new BigDecimal("-50");
		System.out.println("\nAbsolute value of "+num1+" : "+ num1.abs());
		
		/*Absolute method with MathContext class
		 * argument - object of MathContext class - specifies precision for rounding */
		BigDecimal num2 = new BigDecimal("-51.9371");
		MathContext mc1 = new MathContext(2);
		System.out.println("\nAbsolute value of "+num2+" rounded to 2 precision : "+ num2.abs(mc1));
		MathContext mc2 = new MathContext(3);
		System.out.println("Absolute value of "+num2+" rounded to 3 precision : "+ num2.abs(mc2));
		MathContext mc3 = new MathContext(4);
		System.out.println("Absolute value of "+num2+" rounded to 4 precision : "+ num2.abs(mc3));
		
		//compareTo method
		//For greater than condition
		BigDecimal num3 = new BigDecimal(4);
		BigDecimal num4 = new BigDecimal(3);
		System.out.println("\nGreater than condition : "+num3.compareTo(num4));	//returns 1
		//For less than condition
		System.out.println("Less than condition : "+num4.compareTo(num3));	//returns -1
		//For equal condition - it does not compare the scale of two BigDecimal objects (if it contains only zero(s) after decimal point)
		BigDecimal eq1 = new BigDecimal("123.0000");
		BigDecimal eq2 = new BigDecimal("123.00");
		System.out.println("Equal condition : "+ eq1.compareTo(eq2));	//returns 0
		
		//equals method - checks both value and scale
		System.out.println("\nEquals method : "+ eq1.equals(eq2));	//returns false
		
		//hashcode method - works based on scale
		System.out.println("\nHashcode of "+eq1+" : "+ eq1.hashCode());		//returns 381302
		System.out.println("Hashcode of "+eq2+" : "+ eq2.hashCode());	//returns 38130004

		//Maximum method - doesn't consider scale(if only 0)
		System.out.println("\nMaximum of "+num3+" and "+num4+" : "+num3.max(num4));
		//if both equal - returns this BigDecimal
		System.out.println("Maximum of "+eq1+" and "+eq2+" : "+eq1.max(eq2));
		
		//Minimum method 
		System.out.println("\nMinimum of "+num3+" and "+num4+" : "+num3.min(num4));
		System.out.println("Minimum of "+eq1+" and "+eq2+" : "+eq1.min(eq2));
		
		//Moving decimal points
		System.out.println("\nMoving decimal points of "+eq2+" by 2 left : "+eq2.movePointLeft(2));
		System.out.println("Moving decimal points of "+eq2+" by 2 right : "+eq2.movePointRight(3));
		
		//negate method
		System.out.println("\nNegation of "+eq1+" : "+ eq1.negate());
		
		//precision method
		System.out.println("\nPrecision of "+eq1+" : "+ eq1.precision());
		BigDecimal n = new BigDecimal("010.3333");
		System.out.println("Precision of "+n+" : "+n.precision());
		
	}

}
