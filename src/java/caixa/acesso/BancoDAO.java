/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.acesso;

import caixa.basica.Banco;
import caixa.util.Generics;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author User
 */
public class BancoDAO extends Generics<Banco> implements DAOBanco{
   
    public BancoDAO(EntityManagerFactory emf) {
		super(emf);
	} 
}
