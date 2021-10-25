/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Ken Yul Roca Acuña
 */
public class Libro implements Serializable{
    private String titulo;
    private String autor;
    private String genero;
    private int anyo;
    
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.anyo = 0;
    }

    public Libro(String titulo, String autor, String genero, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
}
