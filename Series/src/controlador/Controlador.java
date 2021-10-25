/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Acceso;
import modelo.ListaLibros;
import modelo.Libro;
/**
 *
 * @author Ken Yul Roca Acuña
 */
public class Controlador {
    private int posicion;
    private ListaLibros ll;
    
    public Controlador(){
        posicion = 0;
        ll = new ListaLibros();
        ll = Acceso.cargarLL();
    }
    public Libro primero(){
        posicion = 0;
        return ll.getLibro(posicion);
    }
}
