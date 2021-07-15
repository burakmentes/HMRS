package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adaptors.abstracts.ExternalServiceAdaptor;
import business.abstracts.RegisterService;
import entities.concretes.Users;
import simulate.DbService;

public class RegisterManager implements RegisterService {
	DbService FirstDb;
	ExternalServiceAdaptor externalServiceAdaptor;

	public RegisterManager(DbService FirstDb,ExternalServiceAdaptor externalServiceAdaptor) {
		super();
		this.FirstDb = FirstDb;
		this.externalServiceAdaptor=externalServiceAdaptor;
	}

	@Override
	public boolean CheckNameAndSurname(Users user) {
		/* Ad ve soyad en az iki karakterden oluþmalýdýr.*/
		if(user.getName().length()>=2 && user.getSurname().length()>=2) {
			return true;		
		}
		else {
			
		
			System.out.println("isim veya soyisim 2 karakterden az olamaz");
			return false;
		}
	}

	@Override
	public boolean CheckEmail(Users user) {
		// TODO Auto-generated method stub
		String emailPattern="^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		Pattern pattern = Pattern.compile(emailPattern); /* Our pattern compiled*/
		Matcher matcher = pattern.matcher(user.getEmail()); /*Our matcher created*/
		
		/*Bu satýrdan sonra mail baþka bir hesap alýmýnda kullanýlmýþ mý onu kontrol edeceðiz.*/
		
		
		if(matcher.find()) /* matches function return true if pattern and string are matched*/
		{
			if(FirstDb.CheckIsMailUsed(user)) {
				
				return true;
			}
			else {
				System.out.println("Mail adresiniz kullanýmdadýr.Lütfen yeni bir mail adresi giriniz.");
				
				return false;
			}
				
		
		}
		else {
			System.out.println("Mail adresiniz geçersizdir.");
			return false;
		}
			

		
		
	}

	@Override
	public boolean CheckPassword(Users user) {
		// TODO Auto-generated method stub
		/*Parola en az 6 karakterden oluþmalýdýr.*/
		if(user.getPw().length()>=6) {
			return true;		
		}
		else {
			System.out.println("Password 6 karakterden az olamaz");
			return false;
		}
		
	}

	@Override
	public void SendValidationEmail(Users user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+"Validation mail is sended.Please activate your account.");
		
	}

	@Override
	public boolean ValidateEmail(Users user) {
		if(user.getemailValidation()) {
			return true;
			
		}
		else {
			System.out.println("Lütfen mail doðrulamanýzý yapýnýz.");
			return false;
			
		}
		
	}

	@Override
	public void Save(Users user,DbService db) throws Exception {
		/* Hatalý veya baþarýlý durumda kullanýcý bilgilendirilmelidir.*/
		if(CheckNameAndSurname(user)&&CheckEmail(user)&&CheckPassword(user)&&ValidateEmail(user)) {
			try{
				db.SaveDb(user);				
			}
			catch(Exception e) {
				 throw new Exception("Hata alýndý.Kayýt baþarýsýz.");
				 }	

			System.out.println(user.getName()+" hoþgeldin. Kayýt Baþarýlý.");
			
		}
		else
		System.out.println("Kayýt Baþarýsýz.");
		
		
		
	}

	@Override
	public void SaveWithExternalService(ExternalServiceAdaptor externalServiceAdaptor) {
		// TODO Auto-generated method stub
		System.out.println(externalServiceAdaptor.getName() + " Google ile baþarýyla kayýt edildi.");
		FirstDb.SaveDb(new Users(externalServiceAdaptor.getName(),externalServiceAdaptor.getSurName(),externalServiceAdaptor.getEmail(),"nopw",true));
		
	}

}
