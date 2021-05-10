package es.itrafa.dam.ad.ud5.t1;

import baseDatos.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 4 Operaciones a realizar en el main - Añadir dos usuarios - Añadir tres
 * libros - Añadir dos prestamos - Mostrar listado de prestamos, indicando la
 * siguiente información codigo, fecha (prestamos) nombre y apellidos del
 * usuario al que se le presto titulo del libro y si esta prestado o no
 *
 * - Realizar una devolución - Borrar un libro
 */
public class App {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        
        op.abrirBD();
        
        op.anadirUsuario(unUsuario);
        op.anadirUsuario(unUsuario);
        
        op.anadirLibro(unLibro);
        op.anadirLibro(unLibro);
        op.anadirLibro(unLibro);
        
        op.anadirPrestamo(dni, isbn);
        op.anadirPrestamo(dni, isbn);
        
        //show
        op.listadoPrestamos();
        
        op.devolucion(isbn);
        
        op.modificaLibro(unLibro);
        
        op.borraLibro(isbn);
        
        op.cerrarBD();
    }
}
