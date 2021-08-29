package com.edu.gestaopln.exception;


import lombok.Data;

@Data
public class ValidationException extends DetalhesException {
    protected String campoValidado;
}
