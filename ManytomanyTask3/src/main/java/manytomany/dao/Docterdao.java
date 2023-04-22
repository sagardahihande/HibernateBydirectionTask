package manytomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany.dto.Docter;

public class Docterdao {
	
	public void savedocter(Docter docter)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(docter);
		et.commit();
	}
	
	public void findDocter(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
        Docter docter  = em.find(Docter.class, id);
        System.out.println(docter);
	}
	
	public void removeDocter(int id)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		Docter docter  =  em.find(Docter.class, id);
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(id);
		et.commit();
	}
	
	
	public void updateDocter(int id,Docter docter1)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		Docter docter  =  em.find(Docter.class, id);
		EntityTransaction et = em.getTransaction();
		if(docter!=null)
		{
			et.begin();
			docter1.setId(id);
			docter1.setPesents(docter.getPesents());
			em.merge(docter1);
			et.commit();
			
		}
		else
		{
			System.out.println("Enter the valid id");
		}
	}

}
