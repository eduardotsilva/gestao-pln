package com.edu.gestaopln.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResourceNotFoundException extends RuntimeException {

    private HttpStatus httpStatus;
    private String mensagem;

}
