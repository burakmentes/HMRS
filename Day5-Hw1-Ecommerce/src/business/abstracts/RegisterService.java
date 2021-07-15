package business.abstracts;

import adaptors.abstracts.ExternalServiceAdaptor;
import entities.concretes.Users;
import simulate.DbService;


public interface RegisterService {
	public boolean CheckNameAndSurname(Users user);
	public boolean CheckEmail(Users user);
	public boolean CheckPassword(Users user);	
	public void SendValidationEmail(Users user);
	public boolean ValidateEmail(Users user);
	public void Save(Users user,DbService db) throws Exception;/* Kayýt hatalý veya baþarýlý olduðunda bilgilendirilecek */
	public void SaveWithExternalService(ExternalServiceAdaptor externalServiceAdaptor);/* bu function parametre olarak adaptor classýndan mail pw almalýdýr */

}
 