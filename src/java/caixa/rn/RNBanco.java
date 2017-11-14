/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.BancoDAO;
import caixa.basica.Banco;
import caixa.erro.GeralException;
import caixa.util.Factory;


/**
 *
 * @author alex.santos
 */
public class RNBanco {
     private final BancoDAO DAO = Factory.getBancoDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param b
    * @throws GeralException 
    */
    public void validarBanco(Banco b) throws GeralException{
        if(b==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(b.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((b.getNome()==null)||(b.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
    }
    
   /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados do Banco encontrado ou NULL
     * @throws GeralException 
     */
    public Banco pesquisar(Integer id)throws GeralException{
        try{
            return DAO.searchByKey(id);
        }catch(Exception msg){
            throw new GeralException("ERRO: Problema na DAO!");
        }    
    } 
    
    /**
     * Verificar se o ID já existe no Bando de Dados.
     * @param id
     * @throws GeralException 
     */
    public void duplicidadeId(Integer id) throws GeralException{
       if(pesquisar(id)!=null){
           throw new GeralException("Erro: Id já existe.");
       }
    }
    
    /**
     * Inseri uma Banco.
     * @param b
     * @throws GeralException 
     */
    public void inserirBanco(Banco b) throws GeralException{
   
       try{
           DAO.insert(b);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de uma Banco.
     * @param b
     * @throws GeralException 
     */
    public void validarAlterar(Banco b) throws GeralException{
        if(b==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(b.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((b.getNome()==null)||(b.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }  
    }
    /**
     * Altera os dados de um Banco existente.
     * @param b
     * @throws GeralException 
     */
    public void alterarBanco(Banco b) throws GeralException{
        try{
            DAO.update(b);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Banco. 
     * @param b
     * @throws GeralException 
     */
    public void validarExcluir(Banco b)throws GeralException{
        if(b==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(b.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Banco existente.
     * @param b
     * @throws GeralException 
     */
    public void excluirBanco (Banco b) throws GeralException{
           try{
            DAO.remove(b);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
    
}
