package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("editor");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.find(Editor.class, 1);
        em.getTransaction().commit();
    }
}