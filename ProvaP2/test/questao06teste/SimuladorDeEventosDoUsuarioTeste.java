/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import questao06.SimuladorDeEventosDoUsuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class SimuladorDeEventosDoUsuarioTeste {
    
    public SimuladorDeEventosDoUsuarioTeste() {
    }
    
    /**
     * 01 edit, cut;
     * 02 edit, copy
     * 03 edit, paste
     * 04 edit, goToLine, cancel, edit, cut
     * 05 edit, goToLine, lineNumbr, lineNumber, ok, edit, copy
     * 06 edit, goToLine, ok, edit, paste
     */
    
    //selecionar, recortar, copiar
    @Test
    public void CT01() {
        SimuladorDeEventosDoUsuario se = new SimuladorDeEventosDoUsuario();
        
        assertTrue(se.edit());
        assertTrue( se.cut() );
        
    }
    
    //selecionar, copiar, colar2, colar2
    @Test
    public void CT02() {
        SimuladorDeEventosDoUsuario se = new SimuladorDeEventosDoUsuario();
        
        assertTrue(se.edit());
        assertTrue( se.copy() );
    }    
    
}
