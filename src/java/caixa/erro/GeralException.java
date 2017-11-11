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
public class GeralException extends Exception{
    
    public GeralException(Exception e){
        super(e);
    }
    
    public GeralException(){
        super();
    }
    public GeralException (String msg){
        super(msg);
    } 
}
