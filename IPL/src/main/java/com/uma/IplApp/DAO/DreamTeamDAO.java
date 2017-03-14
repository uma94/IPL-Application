package com.uma.IplApp.DAO;

import java.util.List;

import com.uma.IplApp.Model.DreamTeam;
import com.uma.IplApp.Model.Player;

public interface DreamTeamDAO {

	public List<Player> getPlayerByName(String [] myPlayer);
	
	void addDreamTeam(DreamTeam dreamTeam);
	
	public boolean isUserIdPresent(int userId);
}