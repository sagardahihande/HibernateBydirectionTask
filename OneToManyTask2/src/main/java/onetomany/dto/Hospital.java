package onetomany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Branches> branches;

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

	public List<Branches> getBranches() {
		return branches;
	}

	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", branches=" + branches + "]";
	}
	
	
	

}
