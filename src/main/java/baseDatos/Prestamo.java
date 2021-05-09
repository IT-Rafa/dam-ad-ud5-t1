/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.Date;

/**
 * Representa un prestamo en base datos para objectdb.
 * 
 * @author it-ra
 */
public class Prestamo {
    /**
     * Identificador del prestamo. Autogenerado en base de datos.
     */
    private String codigo;
    
    /**
     * Fecha en la que se creo el prestamo.
     */
    private Date data;
    
    /**
     * Usuario al que se le hizo el prestamo.
     */
    private Usuario usuario;
    
    /**
     * Libro prestado.
     */
    private Libro libro;
    
    /**
     *  Indica si el prestamo sigue pendiente (true) o ya fue devuelto (false).
     */
    private boolean prestado;
    
}
