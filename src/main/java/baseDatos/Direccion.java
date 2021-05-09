/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

/**
 * Representa una dirección, que será parte de los atributos de Usuario,
 * en base datos para objectdb.
 * 
 * @author it-ra
 */
public class Direccion {
    /**
     * Descripción de la dirección;<br> Ej: Para envío, 1º domicilio, etc.
     */
    private String descripcion;
    
    /**
     * Tipo y nombre de la calle;<br> Ej: C/ Jaen, Calle Jaen, Av. Madrid, etc.
     */
    private String calle;
    
    /**
     * el número dentro de la calle.
     */
    private int numero;
    
    /**
     * Código Postal donde está ubicada la dirección.
     */
    private String CP;
    
    /**
     * Ciudad donde está ubicada la dirección.
     */
    private String ciudad;
    
    /**
     * Provincia donde está ubicada la dirección.
     */
    private String provincia;
    
}
