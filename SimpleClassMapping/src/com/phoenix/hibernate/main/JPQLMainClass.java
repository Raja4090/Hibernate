package com.phoenix.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.phoenix.entity.Product;

import org.hibernate.Transaction;

/*author : raja.kumar@stltech.in
 * creation date: 07/07/2021
 * version 1.0
 * @copyright: Sterlite technology ltd.
 * description: pojo class
 */
public class JPQLMainClass {
	public static void main(String[] args) {
		
	Configuration cfg=new Configuration().configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session ss=factory.openSession();
	Transaction tx= ss.beginTransaction();
	
	//HQL using JPQL- ooQ language
	//works on persistence class and its attribute only
	//doesn't understand table and column name.
	
	
	
	//Query query=ss.createQuery("from Product ");
	//Query query=ss.createQuery("from Product p where p.price=30000.0");
	//Query query=ss.createQuery("from Product p where p.productName='Radio' ");
	/*Query query=ss.createQuery("from Product p where p.productName='Radio' or "
			+ "p.productName='Laptop' ");*/
	//Query query=ss.createQuery("from Product p where p.price between 1000 and 5000");
	//Query query=ss.createQuery("from Product p where p.productName like 'R%' ");
	//Query query=ss.createQuery("from Product p where p.productName like '_a%' ");
	//Query query=ss.createQuery("from Product p  order by  p.price desc");
	//Query query=ss.createQuery("from Product p  where p.price<=5000 order by  p.price desc");
	//Query query=ss.createQuery("from Product p where p.price<=5000 and p.productName='_a%' order by  p.price desc");
	
	/*List<Product> productList=query.getResultList();
	
	for(Product product:productList)
		System.out.println(product);*/
	
	
	//projection: selecting particular
	
	
	//Query query=ss.createQuery("select p.productName,p.productId from Product p ");
	//Query query=ss.createQuery("select p.productName,p.productId from Product p where p.productId<3005");
	/*Query query=ss.createQuery("select p.productName,p.productId from Product p order by p.productId desc");
	
	List<Object[]> objectList=query.getResultList();
	for(Object[] obj:objectList)
	{
		//System.out.println("Product name: "+obj[0]+" Price: "+obj[1]);
		for(Object ob:obj)
			System.out.print(ob+"\t");
		System.out.println();
	}*/
	
	//group function
	
    //Query query=ss.createQuery("select max(p.price) from Product p");
	//Query query=ss.createQuery("select max(p.price) from Product p");
	//Query query=ss.createQuery("select sum(p.price) from Product p");
	/*Query query=ss.createQuery("select avg(p.price) from Product p");
	double Price=(double)query.getSingleResult();
	System.out.println("Resultant Price: "+Price);*/
	
	
	//group by
	//Query query=ss.createQuery("select p.productName,count(*) from Product p group by p.productName");
	//Query query=ss.createQuery("select p.productName,count(*) from Product p group by p.productName order by p.productName");
	//Query query=ss.createQuery("select p.productName,count(*) as c from Product p group by p.productName order by c");
	Query query=ss.createQuery("select p.productName,count(*) as c from Product p group by p.productName having p.productName like '_a%' order by c");
	
	List<Object[]> objectList=query.getResultList();
	for(Object[] obj:objectList)
	{
		//System.out.println("Product name: "+obj[0]+" Price: "+obj[1]);
		for(Object ob:obj)
			System.out.print(ob+"\t");
		System.out.println();
	}
	
	tx.commit();
	
	ss.close();

}
}
