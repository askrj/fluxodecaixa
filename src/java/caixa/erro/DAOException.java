/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.erro;

/**
 *
 * @author User
 */
public class DAOException extends Exception{
    
    public DAOException(Exception e){
        super(e);
    }
    
    public DAOException(){
        super();
    }
    public DAOException(String msg){
        super(msg);
    }
}
