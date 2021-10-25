/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
/**
 *
 * @author Ken Yul Roca Acuña
 */
public class Acceso {
    private static File f = new File("libros.dat");
    
    public static void guardarLL(ListaLibros ll){
        try{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ll);
            oos.close();
        }catch(IOException ex){
            System.out.println("Fallo al guardar fichero");
        }
    }
    public static ListaLibros cargarLL(){
        ListaLibros ll = new ListaLibros();
        ObjectInputStream ois = null;
        try{
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ll = (ListaLibros) ois.readObject();
            ois.close();
        }catch(IOException ex){
            System.out.println("Fallo al abrir fichero");
        }finally{
            return ll;
        }
    }
    
}
