package Defaults;

import Abtracts.BaseCustomerManager;
import Abtracts.CustomerCheckService;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;
import MernisServiceAdaptors.MernisServiceAdaptors;

public class Program {
	

	public static void main(String[] args) throws Exception {
		BaseCustomerManager neroCustomerManager=new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdaptors());
		
		neroCustomerManager.Save(new Customer("12321321","Test","Kiþisi","1991"));
		starbucksCustomerManager.Save(new Customer("50185399314","Burak","Menteþ","1992"));
		


	}

}
