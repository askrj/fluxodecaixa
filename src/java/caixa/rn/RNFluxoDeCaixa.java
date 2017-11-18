/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.FluxoDeCaixaDAO;
import caixa.basica.FluxoDeCaixa;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author User
 */
public class RNFluxoDeCaixa {
    private final FluxoDeCaixaDAO DAO = Factory.getFluxoDeCaixaDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param f
    * @throws GeralException 
    */
    public void validarFluxoDeCaixa(FluxoDeCaixa f) throws GeralException{
        if(f==null){
            throw new GeralException("Erro: Fluco de Caixa inválido. ");            
        }
        if(f.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((f.getCaixaData()==null)||(f.getCaixaData().toString().isEmpty())){
            throw new GeralException("Erro: Data inválida. ");            
        }
        if((f.getTipo()==null)||(f.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
        if((f.getValor()==null)||(f.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }
        if((f.getDocumento()==null)||(f.getDocumento().toString().isEmpty())){
            throw new GeralException("Erro: Documento inválido. "); 
        }
   }
    
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados da Agencia encontrado ou NULL
     * @throws GeralException 
     */
    public FluxoDeCaixa pesquisar(Integer id)throws GeralException{
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
     * Inseri uma Transação de Fluxo de Caixa.
     * @param f
     * @throws GeralException 
     */
    public void inserirFluxoDeCaixa(FluxoDeCaixa f) throws GeralException{
   
       try{
           DAO.insert(f);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de um Fluxo de Caixa.
     * @param f
     * @throws GeralException 
     */
    public void validarAlterar(FluxoDeCaixa f) throws GeralException{
       if(f==null){
            throw new GeralException("Erro: Fluco de Caixa inválido. ");            
        }
        if(f.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((f.getCaixaData()==null)||(f.getCaixaData().toString().isEmpty())){
            throw new GeralException("Erro: Data inválida. ");            
        }
        if((f.getTipo()==null)||(f.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
        if((f.getValor()==null)||(f.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }
        if((f.getDocumento()==null)||(f.getDocumento().toString().isEmpty())){
            throw new GeralException("Erro: Documento inválido. "); 
        }
    }
    /**
     * Altera os dados de um Fluxo de Caixa existente.
     * @param f
     * @throws GeralException 
     */
    public void alterarFluxoDeCaixa(FluxoDeCaixa f) throws GeralException{
        try{
            DAO.update(f);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Fluxo de Caixa. 
     * @param f
     * @throws GeralException 
     */
    public void validarExcluir(FluxoDeCaixa f)throws GeralException{
        if(f==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(f.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Fluxo de Caixa existente.
     * @param f
     * @throws GeralException 
     */
    public void excluirFluxoDeCaixa (FluxoDeCaixa f) throws GeralException{
           try{
            DAO.remove(f);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
    
}
