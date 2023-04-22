package manytomany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Docter {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Pesents> pesents;

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

	public List<Pesents> getPesents() {
		return pesents;
	}

	public void setPesents(List<Pesents> pesents) {
		this.pesents = pesents;
	}

	@Override
	public String toString() {
		return "Docter [id=" + id + ", name=" + name + ", pesents=" + pesents + "]";
	}
	
	

}
