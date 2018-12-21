package Tests;

import java.text.ParseException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Moniteur;
import entities.SeancePlongee;
import services.PlongeeServicesRemote;

public class TestMoniteurparSeance {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/CentreDePlongee-ear/CentreDePlongee-ejb/PlongeeServices!services.PlongeeServicesRemote");
		PlongeeServicesRemote ps= (PlongeeServicesRemote) obj;
		
		SeancePlongee s= new SeancePlongee();
		s.setId(2);
		Moniteur m=ps.selectmoniteur(s);
		System.out.println(m.getNom());
		
		
	}

}
