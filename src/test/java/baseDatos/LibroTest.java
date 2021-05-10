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
public class LibroTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    public LibroTest() {
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");
        String expResult = "978-92-95055-02-5";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetIsbn_format1 method, of class Libro.
     */
    @Test
    public void testGetIsbn_format1() {
        System.out.println("getIsbn_format1");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El formato del código isbn no es válido");
        Libro instance = new Libro("  78-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetIsbn_format1 method, of class Libro.
     */
    @Test
    public void testGetIsbn_format2() {
        System.out.println("getIsbn_format1");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El formato del código isbn no es válido");
        Libro instance = new Libro("  a78-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = new Libro("  978-92-95055-02-5  ", "  Título original  ", 2000, "Autor 1 y Autor 2");
        String expResult = "Título original";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAnio method, of class Libro.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");
        int expResult = 2000;
        int result = instance.getAnio();
        assertEquals(expResult, result);
    }

    /**
     * Test of testGetAnio_negative method, of class Libro.
     */
    @Test
    public void testGetAnio_negative() {
        System.out.println("getAnio_negative");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El año(anio) debe ser entre el 800 y hoy");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", -2000, "Autor 1 y Autor 2");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetAnio_lt method, of class Libro.
     */
    @Test
    public void testGetAnio_lt() {
        System.out.println("getAnio_lt");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El año(anio) debe ser entre el 800 y hoy");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 750, "Autor 1 y Autor 2");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of testGetAnio_gt method, of class Libro.
     */
    @Test
    public void testGetAnio_gt() {
        System.out.println("getAnio_gt");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El año(anio) debe ser entre el 800 y hoy");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2100, "Autor 1 y Autor 2");

        System.out.print(instance);
        assert (false);
    }

    /**
     * Test of getAutores method, of class Libro.
     */
    @Test
    public void testGetAutores() {
        System.out.println("getAutores");
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "  Autor 1 y Autor 2  ");
        String expResult = "Autor 1 y Autor 2";
        String result = instance.getAutores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbn method, of class Libro.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "  123-92-95055-02-5  ";
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setIsbn(isbn);
        String expResult = "123-92-95055-02-5";
        assertEquals(expResult, instance.getIsbn());
    }

    /**
     * Test of testSetIsbn_format1 method, of class Libro.
     */
    @Test
    public void testSetIsbn_format1() {
        System.out.println("setIsbn_format1");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El formato del código isbn no es válido");

        String isbn = "  23-92-95055-02-5  ";
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setIsbn(isbn);
    }

    /**
     * Test of testSetIsbn_format2 method, of class Libro.
     */
    @Test
    public void testSetIsbn_format2() {
        System.out.println("setIsbn_format2");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El formato del código isbn no es válido");

        String isbn = "  a23-92-95055-02-5  ";
        Libro instance = new Libro("  978-92-95055-02-5  ", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setIsbn(isbn);
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "  Título modificado  ";
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setTitulo(titulo);
        String expResult = "Título modificado";
        assertEquals(expResult, instance.getTitulo());
    }

    /**
     * Test of setAnio method, of class Libro.
     */
    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 2020;
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setAnio(anio);
        int expResult = 2020;
        assertEquals(expResult, instance.getAnio());
    }

    /**
     * Test of testSetAnio_lt method, of class Libro.
     */
    @Test
    public void testSetAnio_lt() {
        System.out.println("setAnio_lt");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El año(anio) debe ser entre el 800 y hoy");
        int anio = 750;
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setAnio(anio);

    }

    /**
     * Test of testSetAnio_gt method, of class Libro.
     */
    @Test
    public void testSetAnio_gt() {
        System.out.println("setAnio_gt");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El año(anio) debe ser entre el 800 y hoy");
        int anio = 2100;
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setAnio(anio);
    }

    /**
     * Test of setAutores method, of class Libro.
     */
    @Test
    public void testSetAutores() {
        System.out.println("setAutores");
        String autores = "Otro Autor 3 y Otro Autor 4";
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        instance.setAutores(autores);
        String expResult = "Otro Autor 3 y Otro Autor 4";
        assertEquals(expResult, instance.getAutores());
    }

    /**
     * Test of toString method, of class Libro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        String expResult = "Libro{ isbn=978-92-95055-02-5, titulo=Título original, anio=2000, autores=Autor 1 y Autor 2 }";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of testToStringShort method, of class Libro.
     */
    @Test
    public void testToStringShort() {
        System.out.println("toStringShort");
        Libro instance = new Libro("978-92-95055-02-5", "Título original", 2000, "Autor 1 y Autor 2");
        String expResult = "Libro(978-92-95055-02-5)";
        String result = instance.toStringShort();
        assertEquals(expResult, result);
    }
}
