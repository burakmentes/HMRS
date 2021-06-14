package GamerMain;

import java.util.Random;
import java.util.Scanner;

import Adaptors.DbServiceAdaptors;
import Concretes.CampaignManager;
import Concretes.GamerManager;
import Entities.Gamers;
import Entities.Games;
import Simulating.EDevletCheckSimulation;

public class Program {	

	public static void main(String[] args) throws Exception {
		GamerManager gamermanager=new GamerManager(new DbServiceAdaptors(),new EDevletCheckSimulation(),new CampaignManager());
		//GamerManager gamermanager=new GamerManager(new DbServiceAdaptors(),new EDevletCheckSimulation(),new CampaignManager());
		DbServiceAdaptors dbserviceadaptors=new DbServiceAdaptors();
		
		int i=1;
		while(i>0) {
			System.out.println("\n"
					+ "Buraðýn oyun dünyasýna hoþgeldiniz.\n"
					+ "Lütfen seçim yapýnýz.");
		
			String menu="1-)Ana Menü\n"
					+"2-)Kayýt ol\n"
					+ "3-)Çýkýþ"
					;
			
			
			System.out.println(menu);
			Scanner scanner=new Scanner(System.in);
			int secim;
			secim=scanner.nextInt();
			scanner.nextLine();
			
		
		switch(secim){
		
		case 1:
				int k=2;
				while(k>1) {
					
					String mail;
					String pw;			
				
				System.out.println("\n"
						+ "Yapmak istediðiniz operasyonu seçiniz \n"
						+ "11-)mail güncelle \n"
						+ "22-)bakiye güncelle\n"
						+ "33-)hesabý sil\n"
						+ "44-)oyun satýn al\n");
				int secimcase1=scanner.nextInt();
				scanner.nextLine();
				switch(secimcase1) {
				case 11:
					System.out.println("Bu aþamada kullanýcý giriþi yapmanýz gerekmektedir."
							+ "lütfen þu anki mail adresinizi giriniz");
					mail=scanner.nextLine();
					System.out.println("lütfen þu anki þifrenizi giriniz");
					pw=scanner.nextLine();
				gamermanager.UpdateEmail(dbserviceadaptors.TurnGamer(mail, pw));
				break;
			case 22:
				System.out.println("Bu aþamada  kullanýcý giriþi yapmanýz gerekmektedir."
						+ "lütfen þu anki mail adresinizi giriniz");
				mail=scanner.nextLine();
				System.out.println("lütfen þu anki þifrenizi giriniz");
				pw=scanner.nextLine();
				gamermanager.DepositMoney(dbserviceadaptors.TurnGamer(mail, pw));
				break;
			case 33:
				System.out.println("Bu aþamada  kullanýcý giriþi yapmanýz gerekmektedir."
						+ "lütfen þu anki mail adresinizi giriniz");
				mail=scanner.nextLine();
				System.out.println("lütfen þu anki þifrenizi giriniz");
				pw=scanner.nextLine();
				gamermanager.DeleteAccount(mail, pw);
				break;
			case 44:
				System.out.println("Bu aþamada  kullanýcý giriþi yapmanýz gerekmektedir."
						+ "lütfen þu anki mail adresinizi giriniz");
				mail=scanner.nextLine();
				System.out.println("lütfen þu anki þifrenizi giriniz");
				pw=scanner.nextLine();				
				gamermanager.BuyGame(new Games("Age Of Empires",50), dbserviceadaptors.TurnGamer(mail, pw));
				break;
				}
				}
				
			
//			else throw new Exception("yanlýþ email password");
			
			
			//public Gamers(String email, String pw, String tcNo, String name, int dateOfBirth, int walletBalance) 
		case 2:
				System.out.println("Email adresinizi giriniz.");
				String email=scanner.nextLine(); 
				System.out.println("passwordünüzü giriniz.");
				String pw2=scanner.nextLine();
				System.out.println("tcNo'nuzu giriniz.");
				String tcNo=scanner.nextLine();
				System.out.println("isminizi giriniz.");
				String name=scanner.nextLine();
				System.out.println("Doðum yýlýnýzý giriniz.");
				int dateOfBirth=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Yatýrmak istediðiniz miktarý giriniz.");
				int walletBalance=scanner.nextInt();
				scanner.nextLine();
				
				Gamers gamer=new Gamers(email,pw2,tcNo,name,dateOfBirth,walletBalance);				
				
				gamermanager.Save(gamer,email,pw2);
				/* continue anahtar kelimesi döngüde baþa döner, break ise döngüden çýkar */
				break;
		case 3:
			System.out.println("Çýkýþ yapýlýyor.Yine bekleriz.");
			break;
			
			default:
			System.out.println("Yanlýþ seçim yaptýnýz.");
			
			
		}
		
	
		
		
		
	}

}
}
