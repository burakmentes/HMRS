package MernisServiceAdaptors;

import java.rmi.RemoteException;

import Abtracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptors implements CustomerCheckService{

	@Override
	public boolean CheckIfItRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy MernisService=new KPSPublicSoapProxy();
		
return MernisService.TCKimlikNoDogrula
(Long.parseLong(customer.getNationalId()),customer.getFirstName(),customer.getLastName(),Integer.parseInt(customer.getBirthOfDate()));

		
		
	}

}
