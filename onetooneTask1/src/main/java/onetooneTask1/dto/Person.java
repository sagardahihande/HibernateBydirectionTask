package onetooneTask1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	Pancard pancard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", pancard=" + pancard + "]";
	}
	
	

}
