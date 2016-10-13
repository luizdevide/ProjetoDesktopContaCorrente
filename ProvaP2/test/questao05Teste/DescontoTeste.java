package questao05Teste;

import org.junit.Test;
import static org.junit.Assert.*;
import questao05.Desconto;

public class DescontoTeste {
    
    public DescontoTeste() {
    }
    
    @Test
    public void CT01(){
        Desconto calcula = new Desconto();
        int SaidaReal = calcula.calculaDesconto(10);
        assertEquals(10, SaidaReal);
    }
    
    @Test
    public void CT02(){
        Desconto calcula = new Desconto();
        int SaidaReal = calcula.calculaDesconto(10);
        assertEquals(10, SaidaReal);
    }
    
    @Test
    public void CT03(){
        Desconto calcula = new Desconto();
        int SaidaReal = calcula.calculaDesconto(12);
        assertEquals(12, SaidaReal);
    }
    
    @Test
    public void CT04(){
        Desconto calcula = new Desconto();
        
        int SaidaReal = calcula.calculaDesconto(37);
        assertEquals(37, SaidaReal);
    }
    
    @Test
    public void CT05(){
        Desconto calcula = new Desconto();
        
        int SaidaReal = calcula.calculaDesconto(25);
        assertEquals(25, SaidaReal);
    }
   
}