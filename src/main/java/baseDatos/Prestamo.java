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

    // ATTRIBUTES
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
     * Indica si el prestamo sigue pendiente (true) o ya fue devuelto (false).
     */
    private boolean prestado;

    // CONSTRUCTORS ------------------------------------------------------------
    /**
     * Constructor para clase Prestamo para creación en base datos.<br>
     * codigo, data y prestado se generan modifican según método
     *
     *
     * @param usuario
     * @param libro
     */
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;

        this.data = new Date();
        this.prestado = true;

    }

    // GETTERS -----------------------------------------------------------------
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @return the prestado
     */
    public boolean isPrestado() {
        return prestado;
    }

    // SETTERS -----------------------------------------------------------------
    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    // METHODS -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Prestamo{ " + "codigo=" + codigo + ", data=" + data
                + ", usuario=" + usuario + ", libro=" + libro + ", prestado="
                + prestado + " }";
    }

    public String toStringShort() {
        return "Prestamo(" + libro.toStringShort() + " para " + usuario.toStringShort() +")";
    }

}
