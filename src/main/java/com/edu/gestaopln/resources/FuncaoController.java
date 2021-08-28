package com.edu.gestaopln.resources;


import com.edu.gestaopln.entity.Funcao;
import com.edu.gestaopln.service.FuncaoService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/funcao")
@RequiredArgsConstructor
public class FuncaoController {

    @Autowired
    FuncaoService funcaoService;

    @GetMapping
    public ResponseEntity<Page<Funcao>> findAll(Pageable pageable) {
        Page<Funcao> all = funcaoService.findAll(pageable);
        return ResponseEntity.ok().body(all);
    }

    @PostMapping
    public ResponseEntity<Funcao> create(@RequestBody Funcao funcao) {
        Funcao funcaoSaved = funcaoService.create(funcao);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcaoSaved.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Funcao> update(@PathVariable Long id, @RequestBody Funcao funcao) {
        Funcao funcaoAtualizada = funcaoService.update(id, funcao);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
