/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author it-ra
 */
public class DireccionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    public DireccionTest() {
    }

    /**
     * Test of getDescripcion method, of class Direccion.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Direccion instance = new Direccion(
                "   1º Domicilio   ", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String expResult = "1º Domicilio";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCalle method, of class Direccion.
     */
    @Test
    public void testGetCalle() {
        System.out.println("getCalle");
        Direccion instance = new Direccion(
                "1º Domicilio", "  C/ Ávila   ", 53, "32103", "Vigo", "Pontevedra");

        String expResult = "C/ Ávila";
        String result = instance.getCalle();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetCalle_empty method, of class Direccion.
     */
    @Test
    public void testGetCalle_empty() {
        System.out.println("GetCalle empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo calle debe contener algo");

        Direccion instance = new Direccion(
                "1º Domicilio", "    ", 53, "32103", "Vigo", "Pontevedra");
        System.out.print(instance);
        assert (false);

    }

    /**
     * Test of testGetCalle_withNumber method, of class Direccion.
     */
    @Test
    public void testGetCalle_withNumber() {
        System.out.println("getCalle_withNumber");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo calle no pueden aparecer números");

        Direccion instance = new Direccion(
                "1º Domicilio", " C/ Vigo, 2   ", 53, "32103", "Vigo", "Pontevedra");
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of getNumero method, of class Direccion.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        int expResult = 53;
        int result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetNumero_negative method, of class Direccion.
     */
    @Test
    public void testGetNumero_negative() {
        System.out.println("getNumero_negative");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo numero no puede ser negativo");

        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", -53, "32103", "Vigo", "Pontevedra");
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of getCP method, of class Direccion.
     */
    @Test
    public void testGetCP() {
        System.out.println("getCP");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "  32103  ", "Vigo", "Pontevedra");

        String expResult = "32103";
        String result = instance.getCP();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetCP_empty method, of class Direccion.
     */
    @Test
    public void testGetCP_empty() {
        System.out.println("getCP_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo CP debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "   ", "Vigo", "Pontevedra");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetCP_format method, of class Direccion.
     */
    @Test
    public void testGetCP_format() {
        System.out.println("getCP_format");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo CP solo debe haber 5 números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "  321  ", "Vigo", "Pontevedra");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of getCiudad method, of class Direccion.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String expResult = "Vigo";
        String result = instance.getCiudad();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCiudad method, of class Direccion.
     */
    @Test
    public void testGetCiudad_empty() {
        System.out.println("getCiudad");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo ciudad debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "  ", "Pontevedra");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetCiudad_withNumbers method, of class Direccion.
     */
    @Test
    public void testGetCiudad_withNumbers() {
        System.out.println("getCiudad_withNumbers");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo ciudad no pueden aparecer números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo123", "Pontevedra");

        System.out.print(instance);
        assert (false);

    }

    /**
     * Test of getProvincia method, of class Direccion.
     */
    @Test
    public void testGetProvincia() {
        System.out.println("getProvincia");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String expResult = "Pontevedra";
        String result = instance.getProvincia();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetProvincia_empty method, of class Direccion.
     */
    @Test
    public void testGetProvincia_empty() {
        System.out.println("getProvincia_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo provincia debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", " Vigo ", "  ");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetProvincia_withNumbers method, of class Direccion.
     */
    @Test
    public void testGetProvincia_withNumbers() {
        System.out.println("getProvincia_withNumbers");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo provincia no pueden aparecer números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", " Vigo ", " Pontevedra22 ");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of setDescripcion method, of class Direccion.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "  Local comercial  ";
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        instance.setDescripcion(descripcion);
        String expResult = "Local comercial";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalle method, of class Direccion.
     */
    @Test
    public void testSetCalle() {
        System.out.println("setCalle");
        String calle = " Avenida Camelias ";
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        instance.setCalle(calle);
        String result = instance.getCalle();
        assertEquals("Avenida Camelias", result);
    }

    /**
     * Test of testSetCalle_empty method, of class Direccion.
     */
    @Test
    public void testSetCalle_empty() {
        System.out.println("setCalle_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo calle debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", " Vigo ", " Pontevedra");

        String calle = "   ";
        instance.setCalle(calle);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testSetCalle_withNumber method, of class Direccion.
     */
    @Test
    public void testSetCalle_withNumber() {
        System.out.println("setCalle_withNumber");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo calle no pueden aparecer números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", " Vigo ", " Pontevedra");

        String calle = " Avenida Reyes, 3  ";
        instance.setCalle(calle);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of setNumero method, of class Direccion.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        instance.setNumero(numero);
        int expResult = numero;
        int result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of testSetNumero_Negative method, of class Direccion.
     */
    @Test
    public void testSetNumero_Negative() {
        System.out.println("setNumero_Negative");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo numero no puede ser negativo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        int numero = -5;
        instance.setNumero(numero);
        System.out.print(instance);
        assert (false);

    }

    /**
     * Test of setCP method, of class Direccion.
     */
    @Test
    public void testSetCP() {
        System.out.println("setCP");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String CP = "  44444  ";
        instance.setCP(CP);
        String expResult = "44444";
        String result = instance.getCP();
        assertEquals(expResult, result);
    }

    /**
     * Test of testSetCP_empty method, of class Direccion.
     */
    @Test
    public void testSetCP_empty() {
        System.out.println("setCP_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo CP debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String CP = "    ";
        instance.setCP(CP);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testSetCP_format method, of class Direccion.
     */
    @Test
    public void testSetCP_format() {
        System.out.println("setCP_format");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo CP solo debe haber 5 números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String CP = "  4444  ";
        instance.setCP(CP);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of setCiudad method, of class Direccion.
     */
    @Test
    public void testSetCiudad() {
        System.out.println("setCiudad");
        String ciudad = "  San Sebastian  ";
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        instance.setCiudad(ciudad);
        String expResult = "San Sebastian";
        String result = instance.getCiudad();
        assertEquals(expResult, result);
    }

    /**
     * Test of testSetCiudad_empty method, of class Direccion.
     */
    @Test
    public void testSetCiudad_empty() {
        System.out.println("setCiudad_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo ciudad debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String ciudad = "    ";
        instance.setCiudad(ciudad);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testSetCiudad_withNumbers method, of class Direccion.
     */
    @Test
    public void testSetCiudad_withNumbers() {
        System.out.println("setCiudad_withNumbers");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo ciudad no pueden aparecer números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String ciudad = "  San 5  ";
        instance.setCiudad(ciudad);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of setProvincia method, of class Direccion.
     */
    @Test
    public void testSetProvincia() {
        System.out.println("setProvincia");
        String provincia = " La Coruña ";
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        instance.setProvincia(provincia);
        String expResult = "La Coruña";
        String result = instance.getProvincia();
        assertEquals(expResult, result);
    }

    /**
     * Test of testSetProvincia_empty method, of class Direccion.
     */
    @Test
    public void testSetProvincia_empty() {
        System.out.println("setProvincia_empty");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El atributo provincia debe contener algo");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String provincia = "    ";
        instance.setProvincia(provincia);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testSetProvincia_withNumbers method, of class Direccion.
     */
    @Test
    public void testSetProvincia_withNumbers() {
        System.out.println("setProvincia_withNumbers");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("En el atributo provincia no pueden aparecer números");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String provincia = "  San 5  ";
        instance.setProvincia(provincia);
        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of toString method, of class Direccion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Direccion instance = new Direccion(
                "1º Domicilio", "C/ Ávila", 53, "32103", "Vigo", "Pontevedra");

        String expResult = "Direccion{ descripcion=1º Domicilio, calle=C/ "
                + "Ávila, numero=53, CP=32103, ciudad=Vigo, provincia=Pontevedra"
                + " }";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

}
