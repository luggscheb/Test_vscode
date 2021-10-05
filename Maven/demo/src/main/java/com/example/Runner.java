package com.example;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
		DBManager db = new DBManager();



		List<Employees> emp = db.getEmployees();
		System.out.println("Liste von Employees:");
		for (Employees employee : emp) {
			System.out.println(employee);
		}

		System.out.println();
		System.out.println("Employee mit der emp_no: 200");
		Employees s = db.getEmployee(200);
		System.out.println(s);

		System.out.println();
		System.out.println("Löschen von 200");
		db.loescheEmp(200);
		
		System.out.println();
		System.out.println("Employee mit der emp_no: 200");
		Employees s1 = db.getEmployee(200);
		System.out.println(s1);
		
		db.close();
		System.out.println("Fertig!");
	}
}
