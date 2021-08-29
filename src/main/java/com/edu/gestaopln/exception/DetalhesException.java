package com.edu.gestaopln.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetalhesException {
    private String status;
    private String detalhe;
    private String classe;
}
