/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.AgenciaDAO;
import caixa.basica.Agencia;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author User
 */
public class RNAgencia {
    private final AgenciaDAO DAO = Factory.getAgenciaDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param a
    * @throws GeralException 
    */
    public void validarAgencia(Agencia a) throws GeralException{
        if(a==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(a.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((a.getNome()==null)||(a.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((a.getConta()==null)||(a.getConta().isEmpty())){
            throw new GeralException("Erro: Conta inválida. ");            
        }
        if((a.getOpcao()==null)||(a.getOpcao().isEmpty())){
            throw new GeralException("Erro: Opção inválida. ");            
        }
        if((a.getTipo()==null)||(a.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }   
        if((a.getDataAtual()==null)||(a.getDataAtual().isEmpty())){
            throw new GeralException("Erro: Data inválida. ");            
        } 
   }
    
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados da Agencia encontrado ou NULL
     * @throws GeralException 
     */
    public Agencia pesquisar(Integer id)throws GeralException{
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
     * Inseri uma Agencia.
     * @param a
     * @throws GeralException 
     */
    public void inserirAgencia(Agencia a) throws GeralException{
   
       try{
           DAO.insert(a);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de uma Agencia.
     * @param a
     * @throws GeralException 
     */
    public void validarAlterar(Agencia a) throws GeralException{
       if(a==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(a.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((a.getNome()==null)||(a.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((a.getConta()==null)||(a.getConta().isEmpty())){
            throw new GeralException("Erro: Conta inválida. ");            
        }
        if((a.getOpcao()==null)||(a.getOpcao().isEmpty())){
            throw new GeralException("Erro: Opção inválida. ");            
        }
        if((a.getTipo()==null)||(a.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }   
        if((a.getDataAtual()==null)||(a.getDataAtual().isEmpty())){
            throw new GeralException("Erro: Data inválida. ");            
        }   
    }
    /**
     * Altera os dados de um Agencia existente.
     * @param a
     * @throws GeralException 
     */
    public void alterarAgencia(Agencia a) throws GeralException{
        try{
            DAO.update(a);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Agencia. 
     * @param a
     * @throws GeralException 
     */
    public void validarExcluir(Agencia a)throws GeralException{
        if(a==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(a.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Agencia existente.
     * @param a
     * @throws GeralException 
     */
    public void excluirAgencia (Agencia a) throws GeralException{
           try{
            DAO.remove(a);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
}
