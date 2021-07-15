package adaptors.concretes;

import adaptors.abstracts.ExternalServiceAdaptor;
import simulate.RegisterWithGoogle;

public class GoogleServiceAdaptor implements ExternalServiceAdaptor {
	private String name;
	private String surname;
	private String email;
	

	public GoogleServiceAdaptor(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public String getSurName() {
		// TODO Auto-generated method stub
		return surname;
	}


	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	

	

	
}
