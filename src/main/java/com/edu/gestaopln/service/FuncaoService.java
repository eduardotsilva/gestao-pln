package com.edu.gestaopln.service;

import com.edu.gestaopln.entity.Funcao;
import com.edu.gestaopln.repository.FuncaoRepository;
import com.edu.gestaopln.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FuncaoService {

    @Autowired
    private FuncaoRepository funcaoRepository;

    public Page<Funcao> findAll(Pageable pageable) {
        return funcaoRepository.findAll(pageable);
    }

    public Funcao create(Funcao funcao) {
        funcao.setId(null);
        return funcaoRepository.save(funcao);
    }

    public Funcao update(Long id, Funcao funcaoUpd) {

        return funcaoRepository.findById(id)
                .map(funcaoBD -> {
                    funcaoUpd.setId(funcaoBD.getId());
                    return funcaoRepository.save(funcaoUpd);
                }).orElseThrow(() -> new ResourceNotFoundException(HttpStatus.NOT_FOUND, "Função de ID " + id + " não encontrada!"));
    }

    public void delete(Long id){
        funcaoRepository.deleteById(id);
    }

}
