/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package jogodevolei.Model;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.junit.Test;

public class PartidaTest {
    
    private Partida teste;
    private Equipe A;
    private Equipe B;
    
    public PartidaTest() {
        A = new Equipe("nome de teste A");
        B = new Equipe("nome de teste B");
        teste = new Partida(A, B, "0:00");
    }

    @Test
    public void testGetEquipeA() {
        assertNotNull(A);
    }

    @Test
    public void testGetEquipeB() {
        assertNotNull(B);
    }

    @Test
    public void testGetHora() {
        assertNotNull(teste.getHora());
    }

    @Test
    public void testGetSets() {
        assertNotNull(teste.getSets());
    }

    @Test
    public void testGetSetAtual() {
        assertNotNull(teste.getSetAtual());
    }

    @Test
    public void testTerminaSet() {
        for(int x = 0; x<25; x++){
            A.ganhaPonto();
        }
        teste.terminaSet();
        assertEquals(A.getNome(), teste.getVencedor(1));
    }

    @Test
    public void testGetVencedor() {
        for(int x = 0; x<24; x++){
            B.ganhaPonto();
        }
        teste.terminaSet();
        assertEquals(B.getNome(), teste.getVencedor(1));
        assertEquals("<vazio>", teste.getVencedor(2));
    }
}
