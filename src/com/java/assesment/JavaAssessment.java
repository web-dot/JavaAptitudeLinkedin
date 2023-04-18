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
				 i2 && b1 - correct 
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
		 *
		 * */
		System.out.println(b1 || !b2);// true
		System.out.println((i1 ^ i2) < 4);// true
		
		
		/**
		 * Q4. What is the output of this code?
		1: class Main {
		2:   public static void main (String[] args) {
		3:     int array[] = {1, 2, 3, 4};
		4:     for (int i = 0; i < array.size(); i++) {
		5:        System.out.print(array[i]);
		6:     }
		7:   }
		8: }
		
		 It will not compile because of line 4. - correct
		 It will not compile because of line 3.
		 123
		 1234
		* */
		
		
		/**
		 * Q5. Which of the following can replace the CODE SNIPPET to make the code below print "Hello World"?
		 * 
			interface Interface1 {
			    static void print() {
			        System.out.print("Hello");
			    }
			}
			
			interface Interface2 {
			    static void print() {
			        System.out.print("World!");
			    }
			}
			
			
			 super1.print(); super2.print();
			 this.print();
			 super.print();
			 Interface1.print(); Interface2.print();
		 * */
		
	}
}
