package Concretes;

import java.util.Scanner;

import Abstracts.GamerManagerService;
import Adaptors.DbServiceAdaptors;
import Entities.Gamers;
import Entities.Games;
import Simulating.EDevletCheckSimulation;

public class GamerManager implements GamerManagerService{
	DbServiceAdaptors dbserviceadaptors;
	EDevletCheckSimulation edevletchecksimulation;
	CampaignManager campaignmanager;



	public GamerManager(DbServiceAdaptors dbserviceadaptors,EDevletCheckSimulation Edevletchecksimulation) {
		/* its dependency injection */
		this.dbserviceadaptors=dbserviceadaptors;
		this.edevletchecksimulation=Edevletchecksimulation;
	}
	public GamerManager(DbServiceAdaptors dbserviceadaptors,EDevletCheckSimulation Edevletchecksimulation,CampaignManager Campaignmanager) {
		/* its dependency injection */
		this.dbserviceadaptors=dbserviceadaptors;
		this.edevletchecksimulation=Edevletchecksimulation;
		this.campaignmanager=Campaignmanager;
	}
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void Save(Gamers gamer,String mail,String pw) throws Exception {
		if(edevletchecksimulation.CheckGamers(gamer))
		dbserviceadaptors.Save(gamer);
		System.out.println(dbserviceadaptors.TurnGamer(mail, pw).getName()+" kayýt edildi");
	}



	@Override
	public void UpdateEmail(Gamers gamer) {
		System.out.println("Lütfen yeni email adresinizi giriniz");
		String NewEmail;
		NewEmail=sc.nextLine();
		gamer.setEmail(NewEmail);
		dbserviceadaptors.Save(gamer);
		System.out.println("Yeni Email adresiniz "+NewEmail+" olarak güncellendi.");
		
		
		
		
	}

	@Override
	public void UpdatePw(Gamers gamer) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen yeni password'ünüzü giriniz");
		String Newpw;
		Newpw=sc.nextLine();
		gamer.setPw(Newpw);
		dbserviceadaptors.Save(gamer);
		System.out.println("Yeni password'ünüz "+Newpw+" olarak güncellendi.");
		
	}

	@Override
	public void UpdateDateOfBirth(Gamers gamer) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen yeni doðum gününüzü giriniz");
		int NewDateOfBirth;
		NewDateOfBirth=sc.nextInt();
		sc.nextLine();
		gamer.setDateOfBirth(NewDateOfBirth);
		dbserviceadaptors.Save(gamer);
		System.out.println("Yeni doðum gününüz "+NewDateOfBirth+" olarak güncellendi.");
		
	}

	@Override
	public void DepositMoney(Gamers gamer) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen yatýracaðýnýz para miktarýný giriniz");
		int newDepositMoney;
		newDepositMoney=sc.nextInt();
		sc.nextLine();
		gamer.setWalletBalance(gamer.getWalletBalance()+newDepositMoney);
		dbserviceadaptors.Save(gamer);
		System.out.println("Yeni bakiyeniz "+gamer.getWalletBalance()+" olarak güncellendi.");
		
	}



	@Override
	public void DeleteAccount(String email,String pw) {
		dbserviceadaptors.DeleteAccount(email, pw);
		
	}



	@Override
	public void BuyGame(Games Game, Gamers Gamer) {
		Gamer.setWalletBalance(Gamer.getWalletBalance()-(Game.getPrice()*campaignmanager.MakeCampaign(0.8)));
		System.out.println("Oyun satin alýndý.Yeni Bakiye="+Gamer.getWalletBalance());
		
	}



	

}
