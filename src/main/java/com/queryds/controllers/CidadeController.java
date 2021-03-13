package com.queryds.controllers;

import com.queryds.models.Cidade;
import com.queryds.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping()
    public List<Cidade> getCidades() {
        return cidadeService.findOderByAsc();
    }

}
