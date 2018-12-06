package com.fc_basics;
/* statically typed languages - Java, c, c++
 * dynamically typed languages - Ruby, Python 
 */
public class DatatypesDemo {

	public static void main(String[] args) {
	
	//primitive data
		//boolean (1-bit) default-false
		boolean b = true;
		if(b) {
			System.out.println("Hello boolean...");
		}
		
		
		/*byte (8-bit signed 2's complement integer) 
		 * default 0
		 * -128 to 127
		 * useful for saving memory in large arrays
		 */
		byte a = 126;
		System.out.println("byte : "+a);
		a++;
		System.out.println("byte : "+a);
		a++;
		System.out.println("byte : "+a);	//Looping back within the range
		
		
		
		/*short (16-bit signed 2's complement integer)
		 * similar to byte
		 * default 0*/
		short s1 = 86;
		System.out.println("short : "+s1);
		//short s2 = 858588;// Error - out of range
		
		
		/*int (32-bit signed 2's complement integer)
		 * After Java SE 8, use Integer class for unsigned integer (0 to 2pow(31)-1)
		 * default 0*/
		int i1 = 199;
		System.out.println("int : "+i1);
		int i2 = -120;
		System.out.println("int : "+i2);
		int i3 = +130;
		System.out.println("int : "+i3);
		//int i4 = 120++; Invalid argument to operation ++/--
		
		
		/*long (64-bit signed 2's complement integer)
		 * default 0
		 * After JavaSE 8 use Long class, has methods -> compareUnsigned,divideUnsigned */
		long l1 = 1234567890;
		System.out.println("long : "+l1);
		long l2 = 1234567890l; //Suffix with l
		System.out.println("long : "+l2);
		
		
		/* float (single-precision 32-bit)
		 * default 0.0
		 * suffix f/F
		 * saves memory in large arrays */
		float f1 = 4.5555555555f;
		System.out.println("float : "+f1); //output : 4.5555553
//		float f2 = 4.5; Error without suffix f
		
		
		
		/* double (double-precision 64-bit)
		 * default 0
		 * default-choice 
		 * default fraction value is double*/
		double d1 = 4.5555555555;
		System.out.println("double : "+d1); //output : 4.5555555555
//		double d2 = 4.5555555555d; with suffix d - No Error
		
		
		
		/* BigDecimal class -instead of float and double -for Accuracy*/
		
		
		/*char (single 16-bit Unicode-character)
		 * value : '\u0000' (or 0) to '\uffff' (or 65535) */
		 char c1 = 'S';
		 System.out.println("char : "+c1);
		 //char c2 = 'Su'; Error
		 
	}

}
