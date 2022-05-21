/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jogodevolei.Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User-OEM
 */
public class PartidaTest {
    
    private Partida teste;
    private Equipe A;
    private Equipe B;
    
    public PartidaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        A = new Equipe("nome de teste A");
        B = new Equipe("nome de teste B");
        teste = new Partida(A, B, "0:00");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEquipeA method, of class Partida.
     */
    @Test
    public void testGetEquipeA() {
        assertNotNull(A);
    }

    /**
     * Test of setEquipeA method, of class Partida.
     */
    @Test
    public void testSetEquipeA() {
        
    }

    /**
     * Test of getEquipeB method, of class Partida.
     */
    @Test
    public void testGetEquipeB() {
        assertNotNull(B);
    }

    /**
     * Test of setEquipeB method, of class Partida.
     */
    @Test
    public void testSetEquipeB() {
        
    }

    /**
     * Test of getHora method, of class Partida.
     */
    @Test
    public void testGetHora() {
        assertNotNull(teste.getHora());
    }

    /**
     * Test of setHora method, of class Partida.
     */
    @Test
    public void testSetHora() {
        
    }

    /**
     * Test of getSets method, of class Partida.
     */
    @Test
    public void testGetSets() {
        assertNotNull(teste.getSets());
    }

    /**
     * Test of getSetAtual method, of class Partida.
     */
    @Test
    public void testGetSetAtual() {
        assertNotNull(teste.getSetAtual());
    }

    @Test
    public void testTerminaSet() {
        for(int x = 0; x<25; x++){
            teste.darPonto(false);
        }
        teste.terminaSet();
        assertEquals(A, teste.getVencedor(1));
    }

    /**
     * Test of getVencedor method, of class Partida.
     */
    @Test
    public void testGetVencedor() {
        for(int x = 0; x<25; x++){
            teste.darPonto(true);
        }
        teste.terminaSet();
        assertEquals(A, teste.getVencedor(1));
    }

    /**
     * Test of darPonto method, of class Partida.
     */
    @Test
    public void testDarPonto() {
        System.out.println("darPonto");
        boolean equipe = false;
        Partida instance = null;
        instance.darPonto(equipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tiraPonto method, of class Partida.
     */
    @Test
    public void testTiraPonto() {
        System.out.println("tiraPonto");
        boolean equipe = false;
        Partida instance = null;
        instance.tiraPonto(equipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
