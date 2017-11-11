/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.fachada;

import caixa.basica.Cliente;
import caixa.basica.Fornecedor;
import caixa.erro.GeralException;
import caixa.rn.RNCliente;
import caixa.rn.RNFornecedor;

/**
 *
 * @author User
 */
public class Fachada {
    
    private static Fachada instancia;
    private final RNCliente RNCliente = new RNCliente();
    private final RNFornecedor RNFornecedor = new RNFornecedor();
   
    private Fachada(){
    }
    
    public static Fachada getInstancia(){
        if(instancia==null){
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public void salvarCliente(Cliente c)throws GeralException{
        
    }
    public void alterarCliente(Cliente c)throws GeralException{
        
    }
    public void excluirCliente(Cliente c)throws GeralException{
        
    }
    public void pesquisarCliente(Cliente c)throws GeralException{
        
    }
    public void salvarFornecedor(Fornecedor f)throws GeralException{
        
    }
    public void alterarFornecedor(Fornecedor f)throws GeralException{
        
    }
    public void excluirFornecedor(Fornecedor f)throws GeralException{
        
    }
    public void pesquisarFornecedor(Fornecedor f)throws GeralException{
        
    }    
}
