package Simulating;

import Entities.Gamers;

public class EDevletCheckSimulation {
	
	public boolean CheckGamers(Gamers gamer) {
	
	if((gamer.getTcNo().equals(null) && gamer.getName().length()>2) && (gamer.getDateOfBirth()>18 )){
			return false;	
			}
			return true;
			
		}
	}
	


