package simulate;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Users;

public class DbSimulation implements DbService{
	static List<Users> UserList =new ArrayList();
	

	@Override
	public void SaveDb(Users user) {
		// TODO Auto-generated method stub
		UserList.add(user);
		
	}


	@Override
	public boolean CheckIsMailUsed(Users user) {
		// TODO Auto-generated method stub
		for(Users u : UserList) {
			if(u.getEmail().equals(user.getEmail())) {
				return false;
			}
		}
		return true;				
		}


	@Override
	public boolean CheckMailForLogin(Users user) {
		// TODO Auto-generated method stub
		for(Users u : UserList) {
			if(u.getEmail().equals(user.getEmail())) {
				return true;
			}
		}
		System.out.println(user.getEmail()+" Kayýtlý olmayan mail adresi girdiniz.");
		return false;
	}


	@Override
	public boolean CheckPwForLogin(Users user) {
		// TODO Auto-generated method stub
		for(Users u : UserList) {
			if(u.getEmail().equals(user.getEmail())) {
				return true;
			}
			else
				System.out.println("Pw'ü yanlýþ girdiniz.");
		}
		
		return false;
	}


	@Override
	public boolean CheckMailForExternal(String Mail) {
		// TODO Auto-generated method stub
		for(Users u : UserList) {
			if(u.getEmail().equals(Mail)) {
				return true;
			}
		}
		return false;
		
		
		
	}
		
	}
	
	



