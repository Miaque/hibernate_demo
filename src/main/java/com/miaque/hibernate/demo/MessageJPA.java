package com.miaque.hibernate.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Mique on 2016/10/30.
 */
public class MessageJPA{

    public void storeLoadMessage() throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");

        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Message message = new Message();
            message.setText("Hello World!");

            em.persist(message);

            em.getTransaction().commit();
            em.close();
        } finally {
            emf.close();
        }
    }

}
