package onetomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany.dto.Branches;
import onetomany.dto.Hospital;

public class Hospitaldao {
	
	public void saveHospital(Hospital hospital)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(hospital);
		et.commit();
	}
	
	public void findhospital(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		Hospital hospital   =   em.find(Hospital.class, id);
		System.out.println(hospital);
	}
	
	public void removehospital(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		Hospital hospital   =   em.find(Hospital.class, id);
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(hospital);
		et.commit();
	}
	
	public void UpdateHospital(int id, Hospital hospital1)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		Hospital hospital   =   em.find(Hospital.class, id);
		EntityTransaction et = em.getTransaction();
		
		if(hospital!=null)
		{
			et.begin();
			hospital1.setId(id);
			hospital1.setBranches(hospital.getBranches());
			em.merge(hospital1);
			
			et.commit();
		}
		else
		{
			System.out.println("Enter the valid id");
		}
	}

}
