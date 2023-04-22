package onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneTask1.dto.Pancard;
import onetooneTask1.dto.Person;

public class Persondao {
	
	public void saveperson(Person person , Pancard pancard)
	{
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	  et.begin();
	  em.persist(person);
	  em.persist(pancard);
	  et.commit();
	}
	
	public void findperson(int id)
	{
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		  EntityManager em = emf.createEntityManager();
		 Person person = em.find(Person.class, id);
		 System.out.println(person);
	}
	
	
  public void removePerson(int id)
  {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	 Person person = em.find(Person.class, id);
	 Pancard pancard = person.getPancard();
	  et.begin();
	  em.remove(pancard);
	  em.remove(person);
	   et.commit();
  }
  
  public void updatePerson(int id, Person person1)
  {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	 Person person = em.find(Person.class, id);
	 if(person!=null)
	 {
		 et.begin();
		 person1.setId(id);
		// id and name
	     person1.setPancard(person.getPancard());
		  em.merge(person1);
		 et.commit();
	 }
	 else
	 {
		 System.out.println("please check your id may be its wrong id to update");
	 }
	
  }

}
