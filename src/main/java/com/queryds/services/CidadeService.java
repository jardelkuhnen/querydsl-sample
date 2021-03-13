package com.queryds.services;

import com.queryds.models.Cidade;
import com.queryds.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> findOderByAsc() {

        return this.cidadeRepository.findOrderByAsc();
    }


}
