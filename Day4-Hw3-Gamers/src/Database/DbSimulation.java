package Database;

import java.util.ArrayList;
import java.util.List;

import Entities.Gamers;

public class DbSimulation{
	 static List<Gamers> GamersList=new ArrayList<Gamers>();

	
	public void Save(Gamers Gamer) {
		//String email, String pw, String tcNo, String name, int dateOfBirth, int walletBalance) {		
		GamersList.add(Gamer);
		
	}
	public boolean GamerSignInVerification(String email,String pw){
		for(Gamers G: GamersList) {
			if(G.getEmail().equals(email) && G.getPw().equals(pw)) {
				System.out.println(G.getName()+" ile kaydýnýz eþleþti");
				return true;
				
			}
		}
				return false;
				
			
		
	}
	
	public Gamers TurnGamers(String email,String pw) throws Exception {
		for(Gamers G: GamersList) {
			if(G.getEmail().equals(email) && G.getPw().equals(pw)) {
				return G;
			}		
		
	}
		throw new Exception("email veya password yanlýþ");
		
}
	public void DeleteAccount(String email,String pw) {
		for(Gamers G: GamersList) {
			if(G.getEmail().equals(email) && G.getPw().equals(pw)) {
				System.out.println(G.getName()+" kaydýnýz silindi");
				GamersList.remove(G);
				
				
			}
				
				
			}
	}
}
	
	
	
	


