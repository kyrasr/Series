/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ken Yul Roca Acuña
 */
public class ListaLibros implements Serializable{
    private ArrayList<Libro> listaLibros;
    
    public ListaLibros(){
        listaLibros = new ArrayList<>();
    }

    public Libro getLibro(int p) {
        return listaLibros.get(p);
    }
    public void setLibro(Libro lb){
        listaLibros.add(lb);
    }
    
    public int longitud(){
        return listaLibros.size();
    }
}
