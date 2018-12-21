package Tests;

import java.text.ParseException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Moniteur;
import entities.SeancePlongee;
import services.PlongeeServicesRemote;

public class TestAffectation {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/CentreDePlongee-ear/CentreDePlongee-ejb/PlongeeServices!services.PlongeeServicesRemote");
		PlongeeServicesRemote ps= (PlongeeServicesRemote) obj;
		
		
		SeancePlongee s= new SeancePlongee();
		s.setPronfondeur(2);
				
		Moniteur m= new Moniteur();
		m.setNom("Aziz");
		
		ps.ajouterMoniteurSeancePlongee(m, s);
		
		

	}

}
