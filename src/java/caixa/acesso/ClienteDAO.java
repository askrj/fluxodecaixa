/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.acesso;

import caixa.basica.Cliente;
import caixa.util.Generics;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author User
 */
public class ClienteDAO extends Generics<Cliente> implements DAOCliente{
   
    public ClienteDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
