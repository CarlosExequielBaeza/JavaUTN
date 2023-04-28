/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author litob
 */
public class EquipoTest {
    
    public EquipoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Equipo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Equipo instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Equipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Equipo instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulares method, of class Equipo.
     */
    @Test
    public void testGetTitulares() {
        System.out.println("getTitulares");
        Equipo instance = null;
        int expResult = 0;
        int result = instance.getTitulares();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuplentes method, of class Equipo.
     */
    @Test
    public void testGetSuplentes() {
        System.out.println("getSuplentes");
        Equipo instance = null;
        int expResult = 0;
        int result = instance.getSuplentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorTecnico method, of class Equipo.
     */
    @Test
    public void testGetDirectorTecnico() {
        System.out.println("getDirectorTecnico");
        Equipo instance = null;
        String expResult = "";
        String result = instance.getDirectorTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntos method, of class Equipo.
     */
    @Test
    public void testGetPuntos() {
        System.out.println("getPuntos");
        Equipo instance = null;
        int expResult = 0;
        int result = instance.getPuntos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartidosJugados method, of class Equipo.
     */
    @Test
    public void testGetPartidosJugados() {
        System.out.println("getPartidosJugados");
        Equipo instance = null;
        int expResult = 0;
        int result = instance.getPartidosJugados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
