/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.ArrayList;
import java.util.List;

/**
 * Almacena los métodos para el acceso a base datos en objectdb.
 *
 * @author it-ra
 */
public class Operaciones {

    // ATTRIBUTES --------------------------------------------------------------
    private String mensajes;

    // GETTERS -----------------------------------------------------------------
    public String getMensajes() {
        return mensajes;
    }

    // METHODS -----------------------------------------------------------------
    public void abrirBD() {

    }

    public void cerrarBD() {

    }

    public void anadirUsuario(Usuario unUsuario) {

    }

    public void anadirLibro(Libro unLibro) {

    }

    public void anadirPrestamo(String dni, String isbn) {

    }

    public List<Prestamo> listadoPrestamos() {
        return new ArrayList<>();
    }
    
    public void devolucion(String isbn){
        
    }
    
    public void modificaLibro(Libro unLibro){
        
    }
    
    public void borraLibro(String isbn){
        
    }
    
    public boolean estaPrestado(String isbn){
        return false;
    }
}
