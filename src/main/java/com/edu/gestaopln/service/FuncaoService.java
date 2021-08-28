package com.edu.gestaopln.service;

import com.edu.gestaopln.entity.Funcao;
import com.edu.gestaopln.repository.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FuncaoService  {

    @Autowired
    private FuncaoRepository funcaoRepository;

    public Page<Funcao> findAll(Pageable pageable){
        return funcaoRepository.findAll(pageable);
    }

    public Funcao create(Funcao funcao) {
        funcao.setId(null);
        return funcaoRepository.save(funcao);
    }

}
