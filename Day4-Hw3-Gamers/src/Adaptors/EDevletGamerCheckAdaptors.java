package Adaptors;

import Abstracts.GamerCheckService;
import Entities.Gamers;
import Simulating.EDevletCheckSimulation;

public class EDevletGamerCheckAdaptors implements GamerCheckService{
	EDevletCheckSimulation Edevletchecksimulation=new EDevletCheckSimulation();
	

	@Override
	public boolean CheckTcNo(Gamers gamer) {
		if(Edevletchecksimulation.CheckGamers(gamer)) {
			return true;
		}
			else {
				return false;
				
			}
				
		}
	}



