/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Rodolfo Alonzo
 */
public class ControladorTest {
    
    public ControladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Controlador method, of class Controlador.
     */
    @Test
    public void testControlador() {
        System.out.println("Controlador");
        Controlador instance = new Controlador();
        instance.Controlador();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarAmFm method, of class Controlador.
     */
    @Test
    public void testCambiarAmFm() {
        System.out.println("cambiarAmFm");
        Controlador instance = new Controlador();
        boolean expResult = true;
        boolean result = instance.cambiarAmFm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of encendidoRadio method, of class Controlador.
     */
    @Test
    public void testEncendidoRadio() {
        System.out.println("encendidoRadio");
        Controlador instance = new Controlador();
        instance.encendidoRadio();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subirFrecuencia method, of class Controlador.
     */
    @Test
    public void testSubirFrecuencia() {
        System.out.println("subirFrecuencia");
        Controlador instance = new Controlador();
        double expResult = 0.0;
        double result = instance.subirFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bajarFrecuencia method, of class Controlador.
     */
    @Test
    public void testBajarFrecuencia() {
        System.out.println("bajarFrecuencia");
        Controlador instance = new Controlador();
        double expResult = 107.7;
        double result = instance.bajarFrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFavorito method, of class Controlador.
     */
    @Test
    public void testSetFavorito() {
        System.out.println("setFavorito");
        int posicion = 0;
        Controlador instance = new Controlador();
        instance.setFavorito(posicion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFavorito method, of class Controlador.
     */
    @Test
    public void testGetFavorito() {
        System.out.println("getFavorito");
        int posicion = 0;
        Controlador instance = new Controlador();
        double expResult = 0.0;
        double result = instance.getFavorito(posicion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
