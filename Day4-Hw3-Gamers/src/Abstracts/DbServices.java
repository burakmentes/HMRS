package Abstracts;

import Entities.Gamers;

public interface DbServices {
	public void Save(Gamers gamer);
		
	public boolean Verify(String email,String pw);
	
	public Gamers TurnGamer(String email,String pw) throws Exception;
	

}
