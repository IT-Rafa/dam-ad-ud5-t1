/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

/**
 * Representa una libro, que será parte de los atributos de Usuario,
 * en base datos para objectdb.
 * 
 * @author it-ra
 */
public class Libro {
    /**
     * Código único para una edición de un libro.<br>
     * Con formato 13 dígitos;  Ej: 978-92-95055-02-5.
     * 
     * @see https://www.isbn-international.org/es/content/%C2%BFqu%C3%A9-es-un-isbn
     */
    private String isbn;
    
    /**
     * Título del libro.
     */
    private String titulo;
    
    /**
     *  Año de edición del libro.
     */
    private int anio;
    
    /**
     * Nombres de los autores según aparecen en el libro.
     */
    private String autores;
    
}
