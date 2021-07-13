package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.Product;

public class ProductDaoImp implements ProductDao {
	
    private static Session ss;
	
	static {
		Configuration cfg= new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		ss=factory.openSession();
		System.out.println("Oracle Connection is established....!");
	}

	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub

		return ss.createQuery("from Product").getResultList();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return ss.get(Product.class, id);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.save(product);
		tx.commit();
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.update(product);
		tx.commit();
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=ss.beginTransaction();
		ss.delete(product);
		tx.commit();
		
	}

}
