package day2;

public class VariableExample {
	public static void main(String[] args) {

		int firstNumber;

		firstNumber = 50;
		
		System.out.println(firstNumber);
		
		System.out.println(firstNumber++);
		System.out.println(+firstNumber);
		
		System.out.println("-------------------------------");

		System.out.println("First Number :" + firstNumber);

		int secondNumber;

		secondNumber = 50;

		System.out.println("SECOND NUMBER:" + secondNumber);
		System.out.println("NUMBER CONCATINATE:" + firstNumber + secondNumber);
		System.out.println("NUMBER TOTAL:" + (firstNumber + secondNumber));

		int thirdNumber;
		thirdNumber = 25;

		int sum = firstNumber + secondNumber;
		System.out.println("SUM:" + sum);

		System.out.println("SUM OF NUMBERS:" + (firstNumber + secondNumber + thirdNumber));
		System.out.println("Concatinate 2 & 3:" + secondNumber + thirdNumber);
		System.out.println("Concatinate 1 & 3:" + firstNumber + thirdNumber);

		byte firstbyteNumber;
		firstbyteNumber = -125;

		System.out.println("first byte Number:" + firstbyteNumber);

		int sum1 = firstNumber + firstbyteNumber - thirdNumber;
		System.out.println("SUM1:" + sum1);

		int sum2 = firstNumber - thirdNumber;
		System.out.println("SUM2:" + sum2);

		System.out.println("New Calculation:" + (sum2 + sum1));

		System.out.println("New Calculation:" + sum2 + sum1);

		long longNumber = 257864895l;
		float floatNumber = 1245.2354f;
		boolean flag = false;
		char myFirstChar = 'A';

		String firstString = "My First String";
		System.out.println(firstString);

		String secondString = "My Name is Nilesh Alwe.";
		System.out.println(secondString);

	}

}
