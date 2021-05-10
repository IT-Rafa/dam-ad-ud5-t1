/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.time.Year;

/**
 * Representa una libro, que será parte de los atributos de Usuario, en base
 * datos para objectdb.
 *
 * @author it-ra
 */
public class Libro {

    // ATTRIBUTES --------------------------------------------------------------
    /**
     * Código único para una edición de un libro.<br>
     * Con formato 13 dígitos; Ej: 978-92-95055-02-5.
     *
     * @see
     * https://www.isbn-international.org/es/content/%C2%BFqu%C3%A9-es-un-isbn
     */
    private String isbn;

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Año de edición del libro.
     */
    private int anio;

    /**
     * Nombres de los autores según aparecen en el libro.
     */
    private String autores;

    // GETTERS -----------------------------------------------------------------
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return the autores
     */
    public String getAutores() {
        return autores;
    }

    // CONSTRUCTORS ------------------------------------------------------------
    /**
     * Constructor para clase Libro con todos los atributos
     *
     * @param isbn
     * @param titulo
     * @param anio
     * @param autores
     */
    public Libro(String isbn, String titulo, int anio, String autores) {
        this.isbn = isbnValid(isbn);
        this.titulo = tituloValid(titulo);
        this.anio = anioValid(anio);
        this.autores = autoresValid(autores);
    }

    // SETTERS -----------------------------------------------------------------
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbnValid(isbn);
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = tituloValid(titulo);
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anioValid(anio);
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String autores) {
        this.autores = autoresValid(autores);
    }

    // VALIDATORS (setters & constructors) -------------------------------------
    private String isbnValid(String isbn) {
        //Ej isbn: 978-92-95055-02-5
        isbn = isbn.trim();

        // Si son números, añadir guiones
        if (isbn.matches("^[0-9]{13}$")) {
            isbn = isbn.substring(0, 2) + "-" + isbn.substring(2, 4) + "-"
                    + isbn.substring(4, 9) + "-" + isbn.substring(9, 11) + "-"
                    + isbn.substring(11, 12);
        }

        if (isbn.matches("^[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9]$")) {
            return isbn;

        } else {
            throw new IllegalArgumentException(
                    "El formato del código isbn no es válido");
        }
    }

    private String tituloValid(String titulo) {
        return titulo.trim();
    }

    private int anioValid(int anio) {
        if (anio < 800 || anio > Integer.parseInt((Year.now()).toString())) {
            throw new IllegalArgumentException(
                    "El año(anio) debe ser entre el 800 y hoy");
        } else {
            return anio;
        }
    }

    private String autoresValid(String autores) {
        return autores.trim();
    }

    // METHODS -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Libro{ " + "isbn=" + isbn + ", titulo=" + titulo + ", anio="
                + anio + ", autores=" + autores + " }";
    }
    
    public String toStringShort() {
        return "Libro(" + isbn + ")";
    }
}
