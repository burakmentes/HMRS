package Concretes;

import Abtracts.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	
	

	@Override
	public boolean CheckIfItRealPerson(Customer customer) {
			return true;
	}
	

}
