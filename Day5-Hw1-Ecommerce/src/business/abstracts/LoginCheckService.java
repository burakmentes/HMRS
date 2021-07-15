package business.abstracts;

import adaptors.abstracts.ExternalServiceAdaptor;
import entities.concretes.Users;

public interface LoginCheckService {
	public boolean LoginWithNormal(Users user);
	public boolean LoginWithExternal(ExternalServiceAdaptor externalServiceAdaptor);

}
