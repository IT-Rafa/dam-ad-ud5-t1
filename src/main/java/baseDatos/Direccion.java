/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

/**
 * Representa una dirección, que será parte de los atributos de Usuario, en base
 * datos para objectdb.
 *
 * @author it-ra
 */
public class Direccion {

    // ATTRIBUTES --------------------------------------------------------------
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

    // CONSTRUCTORS ------------------------------------------------------------

    /**
     * Constructor para clase Direccion con todos los atributos
     * 
     * @param descripcion
     * @param calle
     * @param numero
     * @param CP
     * @param ciudad
     * @param provincia
     */
    public Direccion(String descripcion, String calle, int numero, 
            String CP, String ciudad, String provincia) {
        this.descripcion = descripcionValid(descripcion);
        this.calle = calleValid(calle);
        this.numero = numeroValid(numero);
        this.CP = CPValid(CP);
        this.ciudad = ciudadValid(ciudad);
        this.provincia = provinciaValid(provincia);
    }

    // GETTERS -----------------------------------------------------------------
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the CP
     */
    public String getCP() {
        return CP;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    // SETTERS -----------------------------------------------------------------
    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcionValid(descripcion);
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calleValid(calle);

    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numeroValid(numero);
    }

    /**
     * @param CP the CP to set
     */
    public void setCP(String CP) {
        this.CP = CPValid(CP);
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudadValid(ciudad);
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provinciaValid(provincia);
    }

    // VALIDATORS (setters & constructors) -------------------------------------
    private String descripcionValid(String descripcion) {
        return descripcion.trim();
    }

    private String calleValid(String calle) {
        calle = calle.trim();

        if (calle.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo calle debe contener algo");

        } else if (calle.matches(".*\\d.*")) {
            throw new IllegalArgumentException(
                    "En el atributo calle no pueden aparecer números");
        } else {
            return calle;
        }
    }

    private int numeroValid(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException(
                    "El atributo numero no puede ser negativo");
        } else {
            return numero;
        }
    }

    private String CPValid(String CP) {
        CP = CP.trim();

        if (CP.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo CP debe contener algo");

        } else if (!CP.matches("^[0-9]{5}$")) {
            throw new IllegalArgumentException(
                    "El atributo CP solo debe haber 5 números");
        } else {
            return CP;
        }
    }

    private String ciudadValid(String ciudad) {
        ciudad = ciudad.trim();

        if (ciudad.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo ciudad debe contener algo");

        } else if (ciudad.matches(".*\\d.*")) {
            throw new IllegalArgumentException(
                    "En el atributo ciudad no pueden aparecer números");
        } else {
            return ciudad;
        }
    }

    private String provinciaValid(String provincia) {
        provincia = provincia.trim();

        if (provincia.isBlank()) {
            throw new IllegalArgumentException(
                    "El atributo provincia debe contener algo");

        } else if (provincia.matches(".*\\d.*")) {
            throw new IllegalArgumentException(
                    "En el atributo provincia no pueden aparecer números");
        } else {
            return provincia;
        }
    }
    // METHODS -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Direccion{ " + "descripcion=" + descripcion + ", calle=" + calle
                + ", numero=" + numero + ", CP=" + CP + ", ciudad=" + ciudad
                + ", provincia=" + provincia + " }";
    }
    
}
