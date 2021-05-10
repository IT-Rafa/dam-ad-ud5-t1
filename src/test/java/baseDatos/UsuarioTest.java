/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author it-ra
 */
public class UsuarioTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    public UsuarioTest() {
    }

    /**
     * Test of getDni method, of class Usuario.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Usuario instance = creaUsuario();
        String expResult = "33.333.333-A";
        String result = instance.getDni();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = creaUsuario();
        String expResult = "Usuario Uno";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellidos method, of class Usuario.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Usuario instance = creaUsuario();
        String expResult = "ApeUno ApeDos";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class Usuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Usuario instance = creaUsuario();

        String expResult = "Direccion{ " + "descripcion=" + "1º Domicilio" + ", calle=" + "Calle Real"
                + ", numero=" + 53 + ", CP=" + "32103" + ", ciudad=" + "Vigo"
                + ", provincia=" + "Pontevedra" + " }";
        String result = instance.getDireccion().toString();
        assertEquals(expResult, result);
    }
    
    
    private static Usuario creaUsuario() {
        Direccion direccion = new Direccion(
                "  1º Domicilio  ", "  Calle Real  ", 53, "  32103  ", "  Vigo  ", "  Pontevedra  ");
        List<String> telefonos = new ArrayList();
        telefonos.add("999 999 999");
        telefonos.add("999 888 888");
        return new Usuario("  33.333.333-a  ", "  Usuario Uno  ", "  ApeUno ApeDos  ", direccion, telefonos, "  uno@correo.es  ");
    }
}
