package Adaptors;

import Abstracts.DbServices;
import Database.DbSimulation;
import Entities.Gamers;

public class DbServiceAdaptors implements DbServices
{
	DbSimulation dbsimulation=new DbSimulation();

	public void Save(Gamers gamer) {
		dbsimulation.Save(gamer);
		
	}
	public boolean Verify(String email,String pw) {
		if(dbsimulation.GamerSignInVerification(email, pw))
		{
			return true;
		}
		return false;
		
	}
	public Gamers TurnGamer(String email,String pw) throws Exception {
		return dbsimulation.TurnGamers(email, pw);
	}
	public void DeleteAccount(String email,String pw) {
		dbsimulation.DeleteAccount(email, pw);
	}
	

}
