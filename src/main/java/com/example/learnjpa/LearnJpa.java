package com.example.learnjpa;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LearnJpa {
  public static void main(String args[]) {
    log.info("Learning JPA");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Person_Details");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    // Person p = new Person(10, "Prince Kumar", "Software Engineer", "1998");
    // em.persist(p);
    Person s = em.find(Person.class, 13);

    log.info("this is prince");
    // System.out.println(s.toString());
    s.setFullName("Prince Kumar Sharma");
    em.persist(s);
    em.getTransaction().commit();
    em.close();
    emf.close();
    log.info("Entity updated in the database");
  }
}
