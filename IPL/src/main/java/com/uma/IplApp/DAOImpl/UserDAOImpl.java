package com.uma.IplApp.DAOImpl;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.UserDAO;
import com.uma.IplApp.Model.User;
@Component
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(user);
		Serializable id = session.getIdentifier(user);
		session.close();

	}

	public User authUser(String email, String password) {
		Session session = sessionFactory.openSession();
		try {
			Criteria criteria = session.createCriteria(User.class);

			User user = (User) criteria.add(Restrictions.conjunction().add(Restrictions.eq("email", email))
					.add(Restrictions.eq("password", password))).uniqueResult();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
