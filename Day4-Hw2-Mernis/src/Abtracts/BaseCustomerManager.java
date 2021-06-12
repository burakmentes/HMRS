package Abtracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerManagerService{

	@Override
	public void Save(Customer customer) throws Exception {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Kayýt edildi..");
		
	}
	

}
