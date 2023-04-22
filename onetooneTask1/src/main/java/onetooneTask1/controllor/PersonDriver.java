package onetooneTask1.controllor;

import onetoone.dao.Persondao;
import onetooneTask1.dto.Pancard;
import onetooneTask1.dto.Person;

public class PersonDriver {
	
	public static void main(String[] args) {
		
		
		// To save the Person
		
		
	/*	Person person =  new Person();
		person.setId(2);
		person.setName("satya");
		
		Pancard pancard = new Pancard();
		pancard.setPid(102);
		pancard.setName("satya");
		
		person.setPancard(pancard);
		pancard.setPerson(person);
		Persondao p = new Persondao();
		p.saveperson(person,pancard);   */
		
		// to find the person
		
	/*	Persondao p1 = new Persondao();
		p1.findperson(1); */
		
		 // to remove the Person
	/*	Persondao p2 = new Persondao();
		p2.removePerson(2); */
		
		
		// to  update the person
		
		
		Person person =  new Person();
		person.setId(1);
		person.setName("sagar patil");
		
		Persondao p4 = new Persondao();
		p4.updatePerson(1, person);
		
		
		
		
		
	}

}
