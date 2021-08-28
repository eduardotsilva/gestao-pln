package com.edu.safirapln.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbFuncional")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String funcionalCodigo;

    @ManyToOne(fetch = FetchType.EAGER)
    private Funcao funcao;
    @ManyToOne(fetch = FetchType.EAGER)
    private SubFuncao subFuncao;
    @ManyToOne(fetch = FetchType.EAGER)
    private Programa programa;
    @ManyToOne(fetch = FetchType.EAGER)
    private SubPrograma subPrograma;
    @ManyToOne(fetch = FetchType.EAGER)
    private ProjetoAtividade projetoAtividade;
    @ManyToOne(fetch = FetchType.EAGER)
    private SubProjetoAtividade subProjetoAtividade;

}
