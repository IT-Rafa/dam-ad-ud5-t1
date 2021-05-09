/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.List;

/**
 * Representa un usuario en base datos para objectdb.
 * 
 * @author it-ra
 */
public class Usuario {
    /**
     * DNI del usuario. Funciona como identificador.<br>
     * Con formato 99.999.999-X.
     */
    private String dni;
    
    /**
     *  Nombre del usuario.
     */
    private String nombre;
    
    /**
     * Apellidos del usuario.
     */
    private String apellidos;
    
    /**
     * Dirección dada por el usuario.
     */
    private Direccion direccion;
    
    /**
     * Lista de telefonos contacto dados por el usuario.
     */
    private List<String> telefonos; 
    
    /**
     * E-mail del usuario.
     */
    private String correoe;
    
}
