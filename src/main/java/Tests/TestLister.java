package Tests;

import java.text.ParseException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Moniteur;
import entities.SeancePlongee;
import services.PlongeeServicesRemote;

public class TestLister {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/CentreDePlongee-ear/CentreDePlongee-ejb/PlongeeServices!services.PlongeeServicesRemote");
		PlongeeServicesRemote ps= (PlongeeServicesRemote) obj;
		
		Moniteur m= new Moniteur();
		m.setId(3);
		List<SeancePlongee> ll= ps.listerseanceplonge(m);
		for (SeancePlongee s : ll) {
			System.out.println(s.getId());
			
			
		}
			
		}
	}


