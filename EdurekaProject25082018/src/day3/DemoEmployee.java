package day3;

public class DemoEmployee {
	
	

	public static void main(String[] args) {
		
		
		
		Employee arjun = new Employee();
	
		
		arjun.salary = 35000;
		arjun.bonus= 4000;
		
		int arjunSalary= arjun.calculateSalary4(350000, 50000);
		System.out.println("Arjuns new Total Salary:"+ arjunSalary);
	System.out.println("----------------------------------------------------------------------");	
	 
	Employee sagar= new Employee();
	
	sagar.calculateSalary2();
	
	Employee sona= new Employee(35000, 4000);
	sona.calculateSalary2();
	
	}
	
	
}
