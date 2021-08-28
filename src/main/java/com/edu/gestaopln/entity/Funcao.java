package com.edu.gestaopln.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbFuncao")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Funcao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 200, nullable = false)
    private String funcaoNome;

    @Column(length = 2, nullable = false)
    private String funcaoCodigo;

}
