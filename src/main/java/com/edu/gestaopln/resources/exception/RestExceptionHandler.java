package com.edu.gestaopln.resources.exception;

import com.edu.gestaopln.service.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity handlerResourceNotFoundException(ResourceNotFoundException ex) {
        HandlerExceptions handlerExceptions = new HandlerExceptions();
        handlerExceptions.setDetalhe(ex.getMensagem());
        handlerExceptions.setStatus(HttpStatus.NOT_FOUND.toString());
        handlerExceptions.setClasse(ResourceNotFoundException.class.getName());
        return new ResponseEntity(handlerExceptions, HttpStatus.NOT_FOUND);
    }


}
