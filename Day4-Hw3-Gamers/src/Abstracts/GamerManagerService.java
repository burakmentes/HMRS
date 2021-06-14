package Abstracts;

import Adaptors.DbServiceAdaptors;
import Entities.Gamers;
import Entities.Games;

public interface GamerManagerService {
	
	public void Save(Gamers gamer,String mail,String pw) throws Exception;
	
	public void UpdateEmail(Gamers gamer);
	
	public void UpdatePw(Gamers gamer);
	
	public void UpdateDateOfBirth(Gamers gamer);
	
	public void DepositMoney(Gamers gamer);
	
	public void DeleteAccount(String email,String pw);
	
	public void BuyGame(Games Game,Gamers Gamer);

}
