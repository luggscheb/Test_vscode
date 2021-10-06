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
		System.out.println("Employee mit der emp_no: 10001");
		Employees s = db.getEmployee(10001);
		System.out.println(s);

		
		
		db.close();
		System.out.println("Fertig!");
	}
}
