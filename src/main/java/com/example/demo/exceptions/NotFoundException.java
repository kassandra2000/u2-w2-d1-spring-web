package com.example.demo.exceptions;

public class NotFoundException extends  RuntimeException{
    public NotFoundException(int id){
        super("L'elemento con id " + id + " non è stato trovato!");
    }
}
