/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JTextField;
import modelo.Libro;
import modelo.ListaLibros;

/**
 *
 * @author alumno
 */
public class metodos {
    
    
    public static void anyadir(JTextField titulo, JTextField autor, JTextField genero, JTextField anyo) {
        ListaLibros ll;
        String t = titulo.getText();
        String a = autor.getText();
        String g = genero.getText();
        int an = Integer.parseInt(anyo.getText());
        Libro l = new Libro(t, a, g, an);
        ll = new ListaLibros();
        ll.setLibro(l);
    }
}
