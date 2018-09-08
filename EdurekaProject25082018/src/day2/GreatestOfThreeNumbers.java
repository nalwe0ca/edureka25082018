package day2;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		int firstNum, secondNum, thirdNum;
		
		firstNum = 10;
		secondNum = 150;
		thirdNum = 90;
		
		if ((firstNum>secondNum) && (firstNum > thirdNum)) {
		System.out.println("First Number is Greatest");
		} else if ((secondNum>firstNum) && (secondNum > thirdNum)) {
			System.out.println("Second Number is Greatest");
		} else if ((thirdNum>secondNum) && (thirdNum > firstNum)){
			System.out.println("Third Number is Greatest");
		} else if ((firstNum==secondNum)&& (firstNum>thirdNum)) {
			System.out.println("First and second is Greater than third");
		} else if ((secondNum==thirdNum) && (secondNum> firstNum)) {
			System.out.println("Second and Third greater than first");
		} else if ((thirdNum==firstNum) && (firstNum>secondNum)) {
			System.out.println("third and first are greater than first");
		} else 
		{System.out.println("All three are equal");
		
		}
		

	}

	}

