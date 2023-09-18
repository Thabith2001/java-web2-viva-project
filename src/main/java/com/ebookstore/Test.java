package com.ebookstore;

import com.ebookstore.util.HibernateUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Test {
    public static void main(String[] args) {
        EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        HibernateUtil.getSessionFactory();

//        String encrypt = Encryption.encrypt("1234");
//        System.out.println(encrypt);
    }
}
