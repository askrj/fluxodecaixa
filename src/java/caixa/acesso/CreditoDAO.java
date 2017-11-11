/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.acesso;

import caixa.basica.Credito;
import caixa.util.Generics;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author User
 */
public class CreditoDAO extends Generics<Credito> implements DAOAgencia{
   
    public CreditoDAO(EntityManagerFactory emf) {
		super(emf);
	} 
}
