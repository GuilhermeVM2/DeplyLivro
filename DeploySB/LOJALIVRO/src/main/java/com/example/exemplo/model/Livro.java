package main.java.com.example.exemplo.model;

import javax.annotation.processing.Generated;

public class Livro {
    //atributos
    @id
    @GeneratedValue(strategy=GenerationType.Identity)
    private int id;
    private String titulo;
    private String autor;

}
