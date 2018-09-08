package day2;

public class LeapYearExample {

	public static void main(String[] args) {
		
		int year=2017;
		if ((year% 100==0 && year % 400==00)  || (year %100!=0 && year % 4==0)) {
			System.out.println("LEAP YEAR");
		
	 
		} else { 
		System.out.println("Non LEAP YEAR");
		}
		}
	}