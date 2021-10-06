package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DBManager {
	//Ist ein wenig wie die Connection/Connection Pool bei JDBC
	private EntityManagerFactory emf;

	public DBManager() {
		emf = Persistence.createEntityManagerFactory("employees");
		
	}



	public Employees getEmployee(long emp_no) {
		EntityManager em = emf.createEntityManager();
		// JPQL - Java Persistence Query Language - nicht SQL
		String sql = "SELECT s FROM Employees s WHERE s.emp_no = :emp_no";
		Query query = em.createQuery(sql, Employees.class);
		query.setParameter("emp_no", emp_no);
		Employees emp = null;
		try
		{
			emp = (Employees)query.getSingleResult();
			//student = em.find(Employees.class, matrNr);
		} catch (NoResultException e)
		{
			e.printStackTrace();
		}
		em.close();
		return emp;
	}
	
	
	public void loescheEmp(int emp_no)
	{
		EntityManager em = emf.createEntityManager(); 
		Employees student = getEmployee(emp_no); 
		em.remove(student);
		em.close();
	}
	
	
	
	
	
	
	public List<Employees> getEmployees() {
		EntityManager em = emf.createEntityManager();
		// JPQL - Java Persistence Query Language - nicht SQL
		String sql = "SELECT s FROM Employees s";
		Query query = em.createQuery(sql, Employees.class);
		query.setMaxResults(5); //Funktioniert wie das limit in SQL
		@SuppressWarnings("unchecked")
		List<Employees> studenten = query.getResultList();
		em.close();
		return studenten;
	}

	public void close() {
		emf.close();
	}
}
