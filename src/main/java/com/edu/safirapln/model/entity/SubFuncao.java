package com.edu.safirapln.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbSubFuncao")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SubFuncao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String subFuncaoNome;

    @Column(length = 3, nullable = false)
    private String subFuncaoCodigo;


}
