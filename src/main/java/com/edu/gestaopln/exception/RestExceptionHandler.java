package com.edu.gestaopln.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
@Log4j2
public class RestExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity handlerResourceNotFoundException(ResourceNotFoundException ex) {
        DetalhesException handlerExceptions = new DetalhesException();
        handlerExceptions.setDetalhe(ex.getMensagem());
        handlerExceptions.setStatus(HttpStatus.NOT_FOUND.toString());
        handlerExceptions.setClasse(ResourceNotFoundException.class.getName());
        return new ResponseEntity(handlerExceptions, HttpStatus.NOT_FOUND);
    }



    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        ValidationException validationException = new ValidationException();
        log.info("Fields " + ex.getBindingResult().getFieldError().getField());

        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        String camposValidados = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(" | "));
        String mensagensValidacao = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(" | "));
        validationException.setCampoValidado(camposValidados);
        validationException.setDetalhe(mensagensValidacao);
        validationException.setStatus(HttpStatus.BAD_REQUEST.toString());
        validationException.setClasse(ex.getClass().getName());
        return new ResponseEntity(validationException, HttpStatus.BAD_REQUEST);
    }

}
