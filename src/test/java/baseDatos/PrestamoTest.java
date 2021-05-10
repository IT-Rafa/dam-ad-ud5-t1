/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author it-ra
 */
public class PrestamoTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    private static final Usuario usuario = creaUsuario();
    private static final Libro libro = creaLibro();

    public PrestamoTest() {
    }

    /**
     * Test of getData method, of class Prestamo.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Prestamo instance = new Prestamo(usuario, libro);
        Date expResult = new Date();
        int result = expResult.compareTo(instance.getData());
        assert (result == 0);
    }

    /**
     * Test of getUsuario method, of class Prestamo.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Prestamo instance = new Prestamo(usuario, libro);
        String result = instance.getUsuario().toString();
        String expResult = usuario.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLibro method, of class Prestamo.
     */
    @Test
    public void testGetLibro() {
        System.out.println("getLibro");
        Prestamo instance = new Prestamo(usuario, libro);
        String result = instance.getLibro().toString();
        String expResult = libro.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrestado method, of class Prestamo.
     */
    @Test
    public void testIsPrestado() {
        System.out.println("isPrestado");
        Prestamo instance = new Prestamo(usuario, libro);
        boolean expResult = true;
        boolean result = instance.isPrestado();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUsuario method, of class Prestamo.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String newNombreUsuario = "nombre Nuevo";
        Usuario newUsuario = usuario;
        newUsuario.setNombre(newNombreUsuario);
        Prestamo instance = new Prestamo(usuario, libro);
        instance.setUsuario(newUsuario);
        String expResult = newNombreUsuario;
        String result = instance.getUsuario().getNombre();

        assertEquals(expResult, result);
    }

    /**
     * Test of setLibro method, of class Prestamo.
     */
    @Test
    public void testSetLibro() {
        System.out.println("setLibro");
        String newTitulo = "Titulo Nuevo";
        Libro newLibro = libro;
        newLibro.setTitulo(newTitulo);
        Prestamo instance = new Prestamo(usuario, libro);
        instance.setLibro(newLibro);
        String expResult = newTitulo;
        String result = instance.getLibro().getTitulo();

        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Prestamo.
     */
    @Test
    public void testToStringShort() {
        System.out.println("toString");
        Prestamo instance = new Prestamo(usuario, libro);
        String expResult = "Prestamo(" + libro.toStringShort() + " para " +
                usuario.toStringShort() + ")";
        String result = instance.toStringShort();
        assertEquals(expResult, result);
    }

    private static Usuario creaUsuario() {
        Direccion direccion = new Direccion(
                "1º Domicilio", "Calle Real", 53, "32103", "Vigo", "Pontevedra");
        List<String> telefonos = new ArrayList();
        telefonos.add("999 999 999");
        telefonos.add("999 888 888");
        return new Usuario("33.333.333-a", "Usuario Uno", "ApeUno ApeDos", direccion, telefonos, "uno@correo.es");
    }

    private static Libro creaLibro() {
        return new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
    }
}
