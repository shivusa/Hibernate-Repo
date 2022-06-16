package com.example.projects.HibernateDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AlienName an = new AlienName();
    	an.setFname("Shivakumar");
    	an.setLname("Ankad");
    	
    	
//    	To Store the information into database
        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname(an);
        a1.setColor("Black");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session =  sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(a1);
        tx.commit();
        
//        To retrieve the information from database
//          Alien a1 = new Alien();
//          
//        
//          Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        
//          ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//          SessionFactory sf = con.buildSessionFactory(reg);
//          Session session =  sf.openSession();
//        
//          Transaction tx = session.beginTransaction();
//        
//          a1 = (Alien) session.get(Alien.class, 101);
//          
//          tx.commit();
//          
//          System.out.println(a1);
        
    }
}
