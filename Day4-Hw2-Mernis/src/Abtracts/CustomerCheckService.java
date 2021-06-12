package Abtracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	
	public boolean CheckIfItRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
