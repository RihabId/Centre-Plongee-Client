package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Moniteur;
import entities.Plongeur;
import services.PlongeeServicesRemote;

public class TestAjout {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/CentreDePlongee-ear/CentreDePlongee-ejb/PlongeeServices!services.PlongeeServicesRemote");
		PlongeeServicesRemote ps= (PlongeeServicesRemote) obj;
		
//		-Les plongeurs <Ahmed ben ali> et <Maryem ben amor> dont les dates d’abonnement sont respectivement 11/10/2018 et 05/05/2017.
//		-Le  moniteur <Ali saidi> dont la date d’embauche est 02/03/2015 et nombre d’années d’expérience est 10 ans.

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date d= format.parse("02-06-2015");
		Plongeur p= new Plongeur();
		p.setNom("Ahmed");
		p.setPrenom("ben Ali");
		p.setAbonnement(d);
		ps.ajouter(p);
		
		Date dd= format.parse("12-06-2018");
		Plongeur pp= new Plongeur();
		pp.setNom("Maryem");
		pp.setPrenom("ben amor");
		pp.setAbonnement(dd);
		ps.ajouter(pp);
		
		Date ddd= format.parse("12-06-2012");
		Moniteur m= new Moniteur();
		m.setNom("Ali");
		m.setPrenom("Saidi");
		m.setDateEmbauche(ddd);
		m.setExperience(10);
		ps.ajouter(m);
	}

}
