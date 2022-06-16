package com.example.projects.HibMappingRelations;

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
        
        
        Laptop l1 = new Laptop();
        l1.setLid(101);
        l1.setLname("Dell");
        
        
        Student s1 = new Student();
        s1.setRollno(1);
        s1.setSname("Shivu");
        s1.setMarks(72);
        
        
        l1.getStuds().add(s1);
        s1.getLaps().add(l1);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(s1);
        session.save(l1);
        tx.commit();
        
    }
}
