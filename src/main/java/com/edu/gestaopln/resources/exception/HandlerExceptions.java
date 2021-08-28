package com.edu.gestaopln.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HandlerExceptions {

    private String titulo;
    private String status;
    private String detalhe;
    private String classe;
}
