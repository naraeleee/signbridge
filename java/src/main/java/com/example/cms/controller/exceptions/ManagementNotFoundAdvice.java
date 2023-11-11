package com.example.cms.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ManagementNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ManagementNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String managementNotFoundHandler(ManagementNotFoundException ex) {
        return ex.getMessage();
    }
}
