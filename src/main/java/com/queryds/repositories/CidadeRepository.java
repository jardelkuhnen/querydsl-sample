package com.queryds.repositories;


import com.queryds.models.Cidade;
import com.queryds.models.QCidade;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Locale;

@Repository
public class CidadeRepository {

    @Autowired
    @PersistenceContext
    private EntityManager em;

    public List<Cidade> findOrderByAsc() {

        QCidade qCidade = new QCidade("cidade");
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        return (List<Cidade>) queryFactory.from(qCidade).orderBy(qCidade.name.asc()).fetch();
    }

    public void save(Cidade cidade) {
        em.persist(cidade);
    }

}
