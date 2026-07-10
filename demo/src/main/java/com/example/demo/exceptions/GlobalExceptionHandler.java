package com.example.demo.exceptions;

import com.example.demo.dto.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProduct(ProductNotFoundException ex) {

        log.error(ex.getMessage());

        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                404,
                ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);

    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ErrorResponse> handleMath(ArithmeticException ex) {

        log.error("Can't divide by 0", ex);

        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                400,
                "Can't divide by 0");
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleEverything(Exception ex) {

        log.error("Unexpected exception", ex);

        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                500,
                "Unexpected error");
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorResponse);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public  ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex){
        log.error("Unexpected exception", ex);

        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                400,
                ex.getBindingResult()
                        .getFieldErrors()
                        .stream()
                        .findFirst()
                        .map(err -> err.getField() + " " + err.getDefaultMessage())
                        .orElse("Validation failed"));

        return ResponseEntity
                .status((HttpStatus.BAD_REQUEST))
                .body(errorResponse);


    }
}