package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void compareEmployeeById(Employee[] e, int empid) {
		for(int i=0; i<e.length; i++) {
			if(empid == e[i].getEmpid()) {
				
				System.out.println("FOUND = "+e[i].getEmpid()+", "+e[i].getName()+", "+e[i].getSalary());
				return ;
			}
		}System.out.println("NOT FOUND");
	}
	
	public static void compareEmployeeByName(Employee[] e, String empName) {
		for(int i=0; i<e.length; i++) {
			if(empName.equals(e[i].getName())) {
				
				System.out.println("FOUND = "+e[i].getEmpid()+", "+e[i].getName()+", "+e[i].getSalary());
				return ;
			}
		}System.out.println("NOT FOUND");
	}
	
	public static void compareEmployeeBySalary(Employee[] e, double empSal) {
		for(int i=0; i<e.length; i++) {
			if(empSal == e[i].getSalary()) {
				
				System.out.println("FOUND = "+e[i].getEmpid()+", "+e[i].getName()+", "+e[i].getSalary());
				return ;
			}
		}System.out.println("NOT FOUND");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1001, "sudh", 2000.00);
		emp[1] = new Employee(1002, "s", 3000.00);
		emp[2] = new Employee(1003, "sudhya", 4000.00);
		emp[3] = new Employee(1004, "sudhanshu", 5000.00);
		emp[4] = new Employee(1005, "sudha", 6000.00);
		
		System.out.println("Enter empid to be searched = ");
		int empId = scanner.nextInt();
		compareEmployeeById(emp, empId);
		
		
		System.out.println("Enter empname to be searched = ");
		String empName =scanner.nextLine();
		compareEmployeeByName(emp, empName);
		
		System.out.println("Enter empsal to be searched = ");
		double empSal = scanner.nextDouble();
		compareEmployeeBySalary(emp, empSal);

	}

}
