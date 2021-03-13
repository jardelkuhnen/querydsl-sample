package com.queryds;

import com.queryds.models.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class QuerydslexampleApplication implements CommandLineRunner {

    @Autowired
    @PersistenceContext
    EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(QuerydslexampleApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Cidade c1 = new Cidade();
        c1.setAge(25);
        c1.setEstado("PR");
        c1.setName("Cascavel");

        Cidade c2 = new Cidade();
        c2.setAge(35);
        c2.setEstado("SC");
        c2.setName("Blumenau");

        Cidade c3 = new Cidade();
        c3.setAge(75);
        c3.setEstado("SP");
        c3.setName("Sao Paulo");

        Cidade c4 = new Cidade();
        c4.setAge(25);
        c4.setEstado("PR");
        c4.setName("Ascurra");

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);

    }
}
