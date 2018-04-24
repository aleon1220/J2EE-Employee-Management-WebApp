/*Hands On exam for the JSF Module.
 * Andres Leon emp number: 404376
 * date: 27/jul/2011
 *  */

package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.EmployeeEntity;

public class EmployeeService {

	/* This next method returns the id of the employee */
	public Integer addEmployee(EmployeeEntity employee) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Mgmt");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			et.begin();
			em.persist(employee);
			et.commit();

			return employee.getRegId();
		} finally {
			if (em != null)
				em.close();
		}
	}

	public List<EmployeeEntity> getEmployeesByTechnology(String technology)
			throws Exception {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		List<EmployeeEntity> employeList = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Mgmt");
			em = emf.createEntityManager();

			Query query = em.createQuery("select e from EmployeeEntity e where e.technology = '"+ technology + "'");
			employeList = (List) query.getResultList();

			if (employeList.size() == 0) {
				throw new Exception("No Employees are available for "+ technology);
			}

			return employeList;
		} finally {
			if (em != null)
				em.close();
		}
	}

	public List<String> getAvailableTechs() throws Exception {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		List<String> availableTechList = null;
		try {
			emf = Persistence.createEntityManagerFactory("Employee_Mgmt");
			em = emf.createEntityManager();

			Query query = em.createQuery("select e.technology from EmployeeEntity e");
			availableTechList = (List) query.getResultList();

			if (availableTechList.size() == 0) {
				throw new Exception("No resources of any Technology is available");
			}

			return availableTechList;
		} finally {
			if (em != null)
				em.close();
		}
	}
}
