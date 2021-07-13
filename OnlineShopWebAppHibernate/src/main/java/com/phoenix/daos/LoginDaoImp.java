package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;
//author:raja.kumar@stltech.in

public class LoginDaoImp implements LoginDao {

	private static Session ss;
	
	static {
		Configuration cfg= new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		ss=factory.openSession();
		System.out.println("Oracle Connection is established....!");
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return ss.createQuery("from User").getResultList();
	}

	@Override
	public User getUserById(String username) {
		// TODO Auto-generated method stub
		return ss.get(User.class,username);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.save(user);
		tx.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.update(user);
		tx.commit();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.delete(user);
		tx.commit();
	}

	
}
