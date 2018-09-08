package day2;

public class Employee {

 int salary;
 int bonus;
 void calculateSalary() {
	 int totalSalary;
	 
	 totalSalary= salary + bonus;
	 System.out.println("TOTAL SALARY IS:"+ totalSalary);
 }	 
 
 int calculateSalary2() {
	 
	 totalSalary= salary + bonus;
	 
	 return totalSalary;
	 
 }
}
