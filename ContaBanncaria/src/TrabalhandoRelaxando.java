

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Coelho
 */
public class TrabalhandoRelaxando {
    
    

public static void main(String[] args) {
        
        File arquivo = new File("C:\\clientes.csv");
        
        try {
            String linhas = new String();
            
            Scanner leitor = new Scanner(arquivo);
            
            while(leitor.hasNext()){
                linhas = leitor.nextLine();
                
                
                String[] valores = linhas.split(";");
                String nome = "lucas";  
                if(valores[3].equals(nome)){
                    System.out.println("Nome: "+ valores[3] + " - Saldo: "
                            + valores[4]);
                    
                    break;
                }else{
                    System.out.println("Cliente não encontrado");
                }
            }
            leitor.close();
            
            
            
        } catch (FileNotFoundException e) {
            
            System.out.println("Arquivo não encontrado");
        }
    }

}
