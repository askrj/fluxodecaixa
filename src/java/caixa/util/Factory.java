/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.util;

import caixa.acesso.BancoDAO;
import caixa.acesso.ClienteDAO;
import caixa.acesso.DAOBancoImpl;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public abstract class Factory {
    private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("FluxoDeCaixa");		
	}
	
	public static ClienteDAO getClienteDAO(){
		ClienteDAO dao = new ClienteDAO(factory);
		return dao;
	}
        
        public static BancoDAO getBancoDAO() {
		BancoDAO bancodao = new BancoDAO(factory);
		return bancodao;
	}
}
