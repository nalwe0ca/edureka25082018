package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee nilesh;
		nilesh= new Employee();
		
		nilesh.salary= 100000;
		nilesh.bonus= 50000;
		nilesh.calculateSalary();
		
		System.out.println("--------------------------------------------------------------------");
		
		Employee arjun= new Employee();
		
		arjun.salary=50000;
		arjun.bonus=10000;
		int totalSalary =arjun.calculateSalary2();
		System.out.println("Total Salary:" + totalSalary);		
		

	}

}
