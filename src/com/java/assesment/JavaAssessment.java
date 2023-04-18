package com.java.assesment;

/**resource : https://github.com/Ebazhanov/linkedin-skill-assessments-quizzes/blob/main/java/java-quiz.md*/
public class JavaAssessment {
	
	public static void main(String[] args) {
		
		/**
		 * Q1. Given the string "strawberries" saved in a variable called fruit, what would fruit.substring(2, 5) return?
			 rawb 
			 raw - correct
			 awb
			 traw
		 * */
		String fruit = "strawberries";
		System.out.println(fruit.substring(2, 5));
		
		
		/**
		 * Q2. How can you achieve runtime polymorphism in Java?
			 method overloading
			 method overrunning
			 method overriding - correct 
			 method calling
		 * */
		
		
		/**
		 * Q3. Given the following definitions, which of these expression will NOT evaluate to true?
				boolean b1 = true, b2 = false; int i1 = 1, i2 = 2;
				
				 (i1 | i2) == 3
				 i2 && b1
				 b1 || !b2
				 (i1 ^ i2) < 4
		 * */
		
		boolean b1 = true;
		boolean b2 = false;
		int i1 = 1;
		int i2 = 2;
		System.out.println((i1 | i2) == 3); //true
		/**
		 * The expression (i1 | i2) uses the bitwise OR operator (|) to combine the binary 
		 * representations of i1 and i2 using a bitwise OR operation. The binary representation of 1 is 
		 * 0001 and the binary representation of 2 is 0010.
		 * When we perform a bitwise OR operation on these two binary values, 
		 * we get 0011, which is the binary representation of 3. 
		 * So, the expression (i1 | i2) evaluates to 3
		 * 0001
		 * 0010
		 * -----
		 * 0011 
		 * */
		
	}
}
