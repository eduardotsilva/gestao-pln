package com.edu.gestaopln.resources.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HandlerExceptions {
    private String status;
    private String detalhe;
    private String classe;
}
