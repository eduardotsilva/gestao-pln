package com.edu.safirapln.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tbPrograma")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Programa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String programaNome;

    @Column(length = 4, nullable = false)
    private String programaCodigo;



}
