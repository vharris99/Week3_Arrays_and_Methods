package week3Lab;

public class Week3Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] array = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		
		System.out.println(array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println(array[array.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		
		//System.out.println(array[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		
		//System.out.println(array[-1]);
		
			
		// 6. Write a traditional for loop that prints out each element in the array
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		
		for (int number : array) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		
		double average = sum / array.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		for (int number : array) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing. 
		greet("Tom");
		greet("Sally");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		
		System.out.println(greet2("Nick"));
		System.out.println(greet2("Sally"));
		
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println(isStringLongerThanNumber("Jacob", 4 ));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println(doesStringExistInArray(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		System.out.println(returnSmallestNumber(array));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println(isEvenSumGreaterthanOddSum(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		System.out.println(isPalindrome("racecar"));
	}
	
	// Method 13:
	
	public static void greet(String name) {
		System.out.println("Hello " + name + "!");	
	}

	// Method 14:
	
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}
	
	// Method 15:
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}
	
	// Method 16:
	
	public static boolean doesStringExistInArray(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false; 
	}
	
	// Method 17:
	public static int returnSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	// Method 18:

	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array ) {
			sum += number ;
		}
		return sum / array.length; 
	}
	
	// Method 19:
	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length(); 
		}
		return results; 
	}
	
	// Method 20:
	
	public static boolean isEvenSumGreaterthanOddSum(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	// Method 21:
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1 )) {
				return false;
			}
		} 
		return true;
	}


	}
