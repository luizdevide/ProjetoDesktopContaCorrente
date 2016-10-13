/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao04Teste;

import org.junit.Test;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import questao04.Dicionario;
import questao04.VerificadorDeSenhas;

/**
 *
 * @author Coelho
 */

/******************************8 */

public class VerificadorDeSenhasTeste {
    
    
    public VerificadorDeSenhasTeste() {
    }
    

    @Before
    public void adicionaArray() {
        Dicionario mockDic = Mockito.mock( Dicionario.class );
        ArrayList<String> arrayDic = new ArrayList();
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("senha123");
        boolean saidaEsperada = verifica.validarNovaSenha("");
        assertTrue(saidaEsperada);
    }
    
    @Test
    public void senhaExistenteInvalida() {
        Dicionario mockDic = Mockito.mock( Dicionario.class ); 
        ArrayList<String> string = new ArrayList();
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(string);
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        string.add("senha123");
        boolean saidaEsperada = verifica.validarNovaSenha("senha123");
        assertEquals(false, saidaEsperada);
        
    }
    
    //Classes Invalida
    @Test
    public void tamanhoMinimoInvalido(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);    
        ArrayList<String> arrayDic = new ArrayList<>();       
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);   
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("senh");
        boolean saidaReal = verifica.validarNovaSenha("senh");
        assertEquals(false, saidaReal);
    }
    
    @Test
    public void tamanhoMaximoInvalida(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);    
        ArrayList<String> arrayDic = new ArrayList<>();        
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);    
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("senhaComMaisDeDez");
        boolean saidaReal = verifica.validarNovaSenha("senhaComMaisDeDez");
        assertEquals(false, saidaReal);
    }
    
    @Test
    public void senhaInvalidaInicio(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);    
        ArrayList<String> arrayDic = new ArrayList<>();       
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);   
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("@senha");
        boolean saidaReal = verifica.validarNovaSenha("@senha");
        assertEquals(false, saidaReal);
    }
    //
    //
    //
    //
    
    //Classes válidas
    @Test
    public void tamanhoMinimoValido(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);
        ArrayList<String> arrayDic = new ArrayList<>();
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("senha");
        boolean saidaReal = verifica.validarNovaSenha("senha");
        assertEquals(true, saidaReal);
    }
    
    @Test
    public void tamanhoMaximoValido(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);
        ArrayList<String> arrayDic = new ArrayList<>();        
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);    
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("validoValid");
        boolean saidaReal = verifica.validarNovaSenha("validoValid");
        assertEquals(true, saidaReal);
        
    }
    
    public void senhaValidaInicio(){
        Dicionario mockDic = Mockito.mock(Dicionario.class);    
        ArrayList<String> arrayDic = new ArrayList<>();       
        when(mockDic.getListaDeSenhasInvalidas()).thenReturn(arrayDic);   
        VerificadorDeSenhas verifica = new VerificadorDeSenhas(mockDic);
        arrayDic.add("_senha");
        boolean saidaReal = verifica.validarNovaSenha("_senha");
        assertEquals(true, saidaReal);
    }
    
  
}



