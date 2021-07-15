package business.concretes;

import adaptors.abstracts.ExternalServiceAdaptor;
import business.abstracts.LoginCheckService;
import entities.concretes.Users;
import simulate.DbService;

public class LoginManager implements LoginCheckService{
	DbService firstDb;
	ExternalServiceAdaptor externalServiceAdaptor;

	public LoginManager(DbService firstDb,ExternalServiceAdaptor externalServiceAdaptor) {
		this.firstDb = firstDb;
		this.externalServiceAdaptor=externalServiceAdaptor;
	}

	@Override
	public boolean LoginWithNormal(Users user) {
		if(firstDb.CheckMailForLogin(user)&&firstDb.CheckPwForLogin(user)) {
			System.out.println(user.getName()+" Baþarýlý bir þekilde giriþ yaptý.");
			return true;
		}
		System.out.println(user.getName()+" Giriþ Baþarýsýz.");
		return false;
	}

	@Override
	public boolean LoginWithExternal(ExternalServiceAdaptor externalServiceAdaptor) {
		// TODO Auto-generated method stub
		if(firstDb.CheckMailForExternal(externalServiceAdaptor.getEmail())) {
			System.out.println(externalServiceAdaptor.getName()+" baþarýlý bir þekilde dýþ servisten giriþ yaptý");
			return true;
		}
		System.out.println(externalServiceAdaptor.getName()+" sistemimize kayýtlý deðildir. Giriþ baþarýsýz");
		return false;
	}

}
