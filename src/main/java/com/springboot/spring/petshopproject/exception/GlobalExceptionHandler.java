package com.springboot.spring.petshopproject.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.spring.petshopproject.service.ResourceNotFoundException;

@RestControllerAdvice
@Component("globalExceptionHandlerService")
public class GlobalExceptionHandler {

		    @ExceptionHandler(ResourceNotFoundException.class)
		    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
		        String response = "Timestamp: " + LocalDateTime.now() + "\nMessage: " + ex.getMessage();
		        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		    }

		    @ExceptionHandler(Exception.class)
		    public ResponseEntity<String> handleGenericException(Exception ex) {
		        String response = "Timestamp: " + LocalDateTime.now() + "\nMessage: An unexpected error occurred";
		        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		}

