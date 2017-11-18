/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.util;

import caixa.acesso.AgenciaDAO;
import caixa.acesso.BancoDAO;
import caixa.acesso.ClienteDAO;
import caixa.acesso.CreditoDAO;
import caixa.acesso.DebitoDAO;
import caixa.acesso.FluxoDeCaixaDAO;
import caixa.acesso.FornecedorDAO;
import caixa.acesso.UsuarioDAO;
import caixa.basica.FluxoDeCaixa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public abstract class Factory {
    private static final EntityManagerFactory factory;

	static {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
		factory = Persistence.createEntityManagerFactory("fluxodecaixa");		
	}
	
	public static ClienteDAO getClienteDAO(){
		ClienteDAO dao = new ClienteDAO(factory);
		return dao;
	}
        
        public static FornecedorDAO getFornecedorDAO(){
		FornecedorDAO dao = new FornecedorDAO(factory);
		return dao;
	}
        
         public static UsuarioDAO getUsuarioDAO(){
		UsuarioDAO dao = new UsuarioDAO(factory);
		return dao;
	}
         
         public static AgenciaDAO getAgenciaDAO(){
		AgenciaDAO dao = new AgenciaDAO(factory);
		return dao;
	}
         
         public static BancoDAO getBancoDAO(){
		BancoDAO dao = new BancoDAO(factory);
		return dao;
	}
         
         public static CreditoDAO getCreditoDAO(){
		CreditoDAO dao = new CreditoDAO(factory);
		return dao;
	}
         
         public static DebitoDAO getDebitoDAO(){
		DebitoDAO dao = new DebitoDAO(factory);
		return dao;
	}
         public static FluxoDeCaixaDAO getFluxoDeCaixaDAO(){
		FluxoDeCaixaDAO dao = new FluxoDeCaixaDAO(factory);
		return dao;
	}
}