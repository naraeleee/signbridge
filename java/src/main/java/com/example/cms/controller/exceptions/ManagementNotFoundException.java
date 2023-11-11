package com.example.cms.controller.exceptions;

public class ManagementNotFoundException extends RuntimeException{
    public ManagementNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
