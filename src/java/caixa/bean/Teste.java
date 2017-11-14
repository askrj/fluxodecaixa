/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.bean;

import caixa.acesso.BancoDAO;
import caixa.basica.Banco;
import caixa.erro.GeralException;
import caixa.rn.RNBanco;
import caixa.util.Factory;

/**
 *
 * @author alex.santos
 */
public class Teste {
    public static void main(String[] args) throws GeralException {
        
        
        InsereBanco();
		
	}
	
	public static void InsereBanco() throws GeralException{
            
       RNBanco rn = new RNBanco();
       
       Banco b = new Banco();
       
       b.setId(123);
       b.setNome("BRADESCO");

		
		rn.inserirBanco(b);
       
       
        
    }
    
}
