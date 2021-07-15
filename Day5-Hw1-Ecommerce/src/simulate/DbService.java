package simulate;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Users;

public interface DbService {
	public void SaveDb(Users user); 
	public boolean CheckIsMailUsed(Users user);
	public boolean CheckMailForLogin(Users user);
	public boolean CheckPwForLogin(Users user);
	public boolean CheckMailForExternal(String Mail);

}


