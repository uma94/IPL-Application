package com.uma.IplApp.DAOImpl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.DreamPlayerDAO;
import com.uma.IplApp.Model.DreamPlayer;
import com.uma.IplApp.Model.Player;
@Repository
@Transactional
public class DreamPlayerDAOImpl implements DreamPlayerDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void addDreamPlayer(DreamPlayer dreamPlayer) {
		Session sess = sessionFactory.getCurrentSession();
		try {
			sess.save(dreamPlayer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("inside dream player DAo");
	}
	
	public Player dreamPlayerDetails(String playerName) {
		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Player where name=:playerName");
		qry.setParameter("playerName", playerName);
		Player playerDetails = (Player) qry.uniqueResult();
		return playerDetails;
	}
	@Override
	public boolean isUserIdPresent(int dreamId) {
		Session session=sessionFactory.getCurrentSession();
		
		DreamPlayer user = (DreamPlayer) session.load(DreamPlayer.class, dreamId);
		
		if(user!=null)
		{
			return true;
		}else
		
			return false;
		
		
	}
	

}
