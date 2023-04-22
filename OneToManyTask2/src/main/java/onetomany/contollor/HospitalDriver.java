package onetomany.contollor;

import java.util.ArrayList;
import java.util.List;

import onetomany.dao.Hospitaldao;
import onetomany.dto.Branches;
import onetomany.dto.Hospital;

public class HospitalDriver {
	
	public static void main(String[] args) {
		
		
		//To save the hospital and branches
		
	/*	Hospital hospital = new Hospital();
		hospital.setId(2);
		hospital.setName("Kpond");
		
		
		
		Branches b1 = new Branches();
		b1.setId(3);
		b1.setName("balaji nagar");
		
		b1.setHospital(hospital);
		Branches b2 = new Branches();
		b2.setId(4);
		b2.setName("jai bhavani nagar");
		
		b2.setHospital(hospital);
		
		List<Branches> list = new ArrayList<Branches>();
		list.add(b1);
		list.add(b2);
		
		hospital.setBranches(list);
		
		Hospitaldao h1 = new Hospitaldao();
		h1.saveHospital(hospital);   */
		
		
		// to find the hospital
		
		
	/*	Hospitaldao h2 = new Hospitaldao();
		h2.findhospital(1);  */
		
		
		// to remvoe the hospital
		
	/*	Hospitaldao h3 = new Hospitaldao();
		h3.removehospital(2); */
		
		
		// to update the hospital
		
		Hospital h1 = new Hospital();
		h1.setId(1);
		h1.setName("MGM");
		
		Hospitaldao h4 = new Hospitaldao();
		h4.UpdateHospital(1, h1);
		
		
		
		
		
	}

}
