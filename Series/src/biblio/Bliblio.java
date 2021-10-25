/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio;

import modelo.Acceso;
import modelo.ListaLibros;
import modelo.Libro;
/**
 *
 * @author Ken Yul Roca Acuña
 */
public class Bliblio {
    public static void main (String args[]){
        //PRUEBA ESCRIBIR EN FICHERO
        //prueba gruardar en fichero:
        //instanciamos un libro con los datos de un libro:
        Libro lb = new Libro("Origen","Dan Brown","Ciencia Ficción",2017);
        
        //instanciamos una lista de libros:
        ListaLibros ll = new ListaLibros();
        
        //añadimos el libro a la lista de libros
        ll.setLibro(lb);
        
        //creamos un segundo libro
        lb = new Libro("JUego de Tronos","George R.R. Martin","Medieval",1994);
        ll.setLibro(lb);
        
        //guardamos en el fichero los datos creados
        Acceso.guardarLL(ll);
        
        //mensaje para saber q ha acabado:
        System.out.println("----Libros Guardados----");
        
        //instanciamos una lista de libros:
//        ListaLibros lls = new ListaLibros();
        
        //leemos del fichero
        ll = Acceso.cargarLL();
        
        //instanciamos un objeto de tipo libro:
        Libro ln = new Libro();
        
        //obtenemos el primer elemento del arrayList:
        lb = ll.getLibro(0);
        
        //mostrar el título:
        System.out.print("Titulo: ");
        System.out.println(lb.getTitulo());
        
        //obtenemos y mostramos el segundo:
        lb = ll.getLibro(1);
        System.out.print("Título: ");
        System.out.println(lb.getTitulo());
        
    }   
}
