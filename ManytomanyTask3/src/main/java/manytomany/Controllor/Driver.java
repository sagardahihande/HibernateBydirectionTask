package manytomany.Controllor;

import java.util.ArrayList;
import java.util.List;

import manytomany.dao.Docterdao;
import manytomany.dto.Docter;
import manytomany.dto.Pesents;

public class Driver {
	
  public static void main(String[] args) {
	
	  
	  
	  // To save the detail
	  
	  
	  
/*	  Docter d1 = new Docter();
	  d1.setId(1);
	  d1.setName("sagar");
	  
	  Pesents p1 = new Pesents();
	  p1.setId(1);
	  p1.setName("akash");
	  
	  Pesents p2 = new Pesents();
	  p2.setId(1);
	  p2.setName("divya");
	  
	  List<Docter> list = new ArrayList<Docter>();
	  list.add(d1);
	  
	  p1.setDocter(list);
	  p2.setDocter(list);
	  
	  Docterdao docter = new Docterdao();
	  docter.savedocter(d1);  */
	  
	  
	  // To find the Docter
	  
/*	  Docterdao d1 = new Docterdao();
	  d1.findDocter(1);
	  */
	  
	  // To remove the Docter
	  
	/*  Docterdao d1 = new Docterdao();
	  d1.removeDocter(1);  */
	  
	  
	  // To update the docter
	  
	  Docter docter = new Docter();
	  docter.setId(1);
	  docter.setName("rahul");
	  
	  Docterdao d1 = new Docterdao();
	  d1.updateDocter(1, docter);
	  
	  
	  
	  
	  
	  
	  
}

}
