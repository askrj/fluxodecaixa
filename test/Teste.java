
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex.santos
 */
public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("FluxoDeCaixa"); 
        EntityManager manager = factory.createEntityManager(); 
        manager.getTransaction().begin(); 
        

        factory.close(); 
        } 
    
}
