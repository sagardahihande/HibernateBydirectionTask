package manytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Pesents {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	List<Docter> docter;

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

	public List<Docter> getDocter() {
		return docter;
	}

	public void setDocter(List<Docter> docter) {
		this.docter = docter;
	}
	
	

}
