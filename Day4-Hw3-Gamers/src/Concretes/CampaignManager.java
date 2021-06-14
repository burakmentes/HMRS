package Concretes;

import Abstracts.CampaignManagerService;
import Entities.Games;

public class CampaignManager implements CampaignManagerService{
	Games games;
	
	

	public CampaignManager(Games games) {
		super();
		this.games = games;
	}
	public CampaignManager() {
		
	}



	@Override
	public double MakeCampaign(double rate) {
		return rate;
		
	}

}
