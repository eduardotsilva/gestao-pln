package com.edu.gestaopln.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbSubprojetoAtividade")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SubProjetoAtividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String subProjAtivNome;
    @Column(length = 5, nullable = false)
    private String subProjAtivCod;

    @ManyToOne(fetch = FetchType.EAGER)
    private ProjetoAtividade projetoAtividade;

}
