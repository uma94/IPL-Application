package com.uma.IplApp.Service;

import com.uma.IplApp.Model.DreamPlayer;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Model.User;

public interface DreamPlayerService {

	void addDreamPlayer(DreamPlayer dreamPlayer);
	public Player dreamPlayerDetails(String name);
	public boolean isUserIdPresent(int dreamId);
}
