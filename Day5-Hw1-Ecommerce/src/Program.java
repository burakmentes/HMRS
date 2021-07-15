import adaptors.concretes.GoogleServiceAdaptor;
import business.concretes.LoginManager;
import business.concretes.RegisterManager;
import entities.concretes.Users;
import simulate.DbSimulation;


public class Program {
	
	
	public static void main (String [] args) throws Exception {
		System.out.println("Sisteme hoþ geldiniz.");
		DbSimulation dbSimulation=new DbSimulation();
		
		GoogleServiceAdaptor googleServiceAdaptor1=new GoogleServiceAdaptor("Gazanfer","Amca","Gazo@gmail.com");		
		RegisterManager registermanager=new RegisterManager(dbSimulation,googleServiceAdaptor1);
		LoginManager loginManager=new LoginManager(dbSimulation,googleServiceAdaptor1);
		
		Users user1=new Users("Burak","Tos","burak13@gmail.com","123456",true);
		
		registermanager.Save(user1, dbSimulation);
		registermanager.SaveWithExternalService(googleServiceAdaptor1);
		
		loginManager.LoginWithNormal(user1);
		loginManager.LoginWithExternal(googleServiceAdaptor1);
		
		loginManager.LoginWithNormal(new Users("hasan","ali","hasan01@gmail.com","123456",true));
		loginManager.LoginWithExternal(new GoogleServiceAdaptor("osman","can","osman02@gmail.com"));
	}

}
