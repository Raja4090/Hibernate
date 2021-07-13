package com.phoenix.hibernate.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import com.phoenix.entity.Product;

/*author : raja.kumar@stltech.in
 * creation date: 07/07/2021
 * version 1.0
 * @copyright: Sterlite technology ltd.
 * description: perform db operation
 */

public class HibernateMain {

	public static void main(String[] args) {
		
		// create configuration object
		Configuration cfg= new Configuration().configure();
		
		//build session factory
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		//establish connection
		Session ss=factory.openSession();
		
		//obtain hibernate transaction
		Transaction tx= ss.beginTransaction();
		
		Product product=ss.get(Product.class, 3001);
		
		//transaction commit
		System.out.println("id: "+product.getProductId()+"  Product Name:"+
		    product.getProductName()
		    +"  Price: "+product.getPrice());
		
		
		//insert new row (transient state)
		/*Product p=new Product(3004,"Washing Machine",30000.00f);
		ss.save(p);*/
		
		//Product p=ss.load(Product.class, 3004);
		/*System.out.println("id: "+p.getProductId()+"  Product Name:"+
			    p.getProductName()
			    +"  Price: "+p.getPrice());*/
			
		//update product1
		
		/*Product p=ss.get(Product.class, 3004);
		if(p!=null)
		{
			p.setPrice(34000.00f);
			ss.update(p);
		}
		else
		{
			System.out.println("Sorry! not found....");
		}
		
		ss.get(Product.class,3004);
		if(p!=null)
		{
			System.out.println("id: "+p.getProductId()+"  Product Name:"+
				    p.getProductName()
				    +"  Price: "+p.getPrice());
		}
		
		else
			System.out.println("Sorry!");*/
		
		
		
		//delete row from product1
		Product p=ss.get(Product.class, 3004);
		if(p!=null)
		{
			ss.delete(p);
		}
		else
		{
			System.out.println("Sorry!");
		}
		
		
	
		if(p!=null)
		{
			System.out.println("Product found..!");
		}
		else
		{
			System.out.println("Not found!");
		}
		tx.commit();
		
		ss.close();

	}

}
