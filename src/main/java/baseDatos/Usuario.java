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

    // ATTRIBUTES
    /**
     * DNI del usuario. Funciona como identificador.<br>
     * Con formato 99.999.999-X.
     */
    private String dni;

    /**
     * Nombre del usuario.
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

    // CONSTRUCTORS ------------------------------------------------------------
    public Usuario(String dni, String nombre, String apellidos, Direccion direccion, List<String> telefonos, String correoe) {
        this.dni = dniValid(dni);
        this.nombre = nombreValid(nombre);
        this.apellidos = apellidosValid(apellidos);
        this.direccion = direccion;
        this.telefonos = telefonosValid(telefonos);
        this.correoe = correoeValid(correoe);
    }

    // GETTERS -----------------------------------------------------------------
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @return the telefonos
     */
    public List<String> getTelefonos() {
        return telefonos;
    }

    /**
     * @return the correoe
     */
    public String getCorreoe() {
        return correoe;
    }

    // SETTERS -----------------------------------------------------------------
    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dniValid(dni);
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombreValid(nombre);
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidosValid(apellidos);
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonosValid(telefonos);
    }

    /**
     * @param correoe the correoe to set
     */
    public void setCorreoe(String correoe) {
        this.correoe = correoeValid(correoe);
    }

    // VALIDATORS (setters & constructors) -------------------------------------
    private String dniValid(String dni) {
        //Ej dni: 99.999.999-X
        dni = dni.trim().toUpperCase();

        // Si son números y letra. Añadir puntos y letra en mayúscula
        if (dni.matches("^[0-9]{8}-[A-Z]$")) {
            dni = dni.substring(0, 2) + "." + dni.substring(2, 5) + "."
                    + dni.substring(5, 8) + "-" + dni.substring(8, 9);
        }

        if (dni.matches("^[0-9]{2}.[0-9]{3}.[0-9]{3}-[A-Z]$")) {
            return dni;

        } else {
            throw new IllegalArgumentException(
                    "El formato del DNI no es válido");
        }
    }

    private String nombreValid(String nombre) {
        nombre = nombre.trim();

        if (nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo nombre debe contener algo");

        } else if (nombre.matches("^*[0-9]*$")) {
            throw new IllegalArgumentException(
                    "El atributo nombre no pueden aparecer números");
        } else {
            return nombre;
        }
    }

    private String apellidosValid(String apellidos) {
        apellidos = apellidos.trim();

        if (apellidos.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo apellidos debe contener algo");

        } else if (apellidos.matches("^*[0-9]*$")) {
            throw new IllegalArgumentException(
                    "El atributo apellidos no pueden aparecer números");
        } else {
            return apellidos;
        }
    }

    private List<String> telefonosValid(List<String> telefonos) {
        for (String t : telefonos) {
            if (t.isBlank()) {
                throw new IllegalArgumentException(
                        "Uno de los teléfonos no tiene contenido");
            }
        }
        return telefonos;
    }

    private String correoeValid(String correoe) {
        correoe = correoe.trim();
        if (correoe.matches("[^@ \\t\\r\\n]+@[^@\n"
                + "\\t\\r\\n]+\\.[^@ \\t\\r\\n]+")) {
            return correoe;

        } else {
            throw new IllegalArgumentException(
                    "El atributo correoe no tiene un formato válido.");
        }

    }
    // METHODS -----------------------------------------------------------------

    @Override
    public String toString() {
        return "Usuario{ " + "dni=" + dni + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", direccion=" + direccion + ", telefonos="
                + telefonos + ", correoe=" + correoe + " }";
    }

    public String toStringShort() {
        return "Usuario(" + dni + ")";
    }
}
