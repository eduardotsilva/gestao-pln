package com.edu.safirapln.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbSubPrograma")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SubPrograma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String subProgramaNome;

    @Column(length = 5, nullable = false)
    private String subProgramaCodigo;

    @ManyToOne(fetch = FetchType.EAGER)
    private Programa programa;

}
