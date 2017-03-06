package com.uma.IplApp.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.uma.IplApp.DAO.DreamPlayerDAO;
import com.uma.IplApp.Model.DreamPlayer;
import com.uma.IplApp.Service.DreamPlayerService;

public class DreamPlayerServiceImpl implements DreamPlayerService{

	
	@Autowired
	private DreamPlayerDAO dreamPlayerDAO;


	public void addDreamPlayer(DreamPlayer dreamPlayer) {
		
		dreamPlayerDAO.addDreamPlayer(dreamPlayer);
		System.out.println("inside dream player serviceImpl");
	}
		

}