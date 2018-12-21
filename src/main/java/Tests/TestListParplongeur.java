package Tests;

import java.text.ParseException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Moniteur;
import entities.Plongeur;
import entities.SeancePlongee;
import services.PlongeeServicesRemote;

public class TestListParplongeur {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/CentreDePlongee-ear/CentreDePlongee-ejb/PlongeeServices!services.PlongeeServicesRemote");
		PlongeeServicesRemote ps= (PlongeeServicesRemote) obj;
		
		Plongeur m= new Plongeur();
		m.setId(1);
		List<SeancePlongee> ll= ps.listerseanceplongeparplongeur(m);
		for (SeancePlongee s : ll) {
			System.out.println("11111111111111111");
			System.out.println(s.getId());
			
			
		}
	}

}
