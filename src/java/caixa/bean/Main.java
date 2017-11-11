/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.bean;

import caixa.acesso.BancoDAO;
import caixa.basica.Banco;
import caixa.util.Factory;

public class Main {

	public static void main(String[] args) {
		
		InsereBanco();
		
	}
	
	public static void InsereBanco(){
		
		//regra de negocios
		Banco bc = new Banco();
		bc.setId(1);
		bc.setNome("Banco do Brasil");
		
		BancoDAO bcodao = Factory.getBancoDAO();
		
		bcodao.insert(bc);
		
		
	}	

}
