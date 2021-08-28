package com.edu.gestaopln.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "tbProjetoAtividade")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProjetoAtividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String projAtivNome;
    @Column(length = 4, nullable = false)
    private String projAtivCod;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "projetoAtividade")
    private List<SubProjetoAtividade> subProjetoAtividades;

}
