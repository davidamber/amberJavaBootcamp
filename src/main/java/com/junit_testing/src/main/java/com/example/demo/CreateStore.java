package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStore {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactor();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();
        Store store1 = new Store();
        store1.setName("ToysRMe");
        store1.getCity("Atlantis");
        store1.setState("Ocean");


        session.save(store1);
        t.commit();
        System.out.println("Successfully Saved");
        factory.close();
        session.close();
    }
}
