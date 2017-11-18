/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.CreditoDAO;
import caixa.basica.Credito;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author BrunoMarques
 */
public class RNCredito {
    private final CreditoDAO DAO = Factory.getCreditoDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param c
    * @throws GeralException 
    */
    public void validarCredito(Credito c) throws GeralException{
        if(c==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(c.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((c.getEmissao()==null)||(c.getEmissao().toString().isEmpty())){
            throw new GeralException("Erro: Data de Emissão inválida. ");            
        }
        if((c.getVencimento()==null)||(c.getVencimento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Vencimendo inválido. ");            
        }
        if((c.getPagamento()==null)||(c.getPagamento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Pagamento inválida. ");            
        }
        if((c.getValor()==null)||(c.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }   
        if((c.getDesconto()==null)||(c.getDesconto().toString().isEmpty())){
            throw new GeralException("Erro: Desconto inválido. ");            
        } 
        if((c.getJuros()==null)||(c.getJuros().toString().isEmpty())){
            throw new GeralException("Erro: Juros inválido. ");            
        }
        if((c.getTotal()==null)||(c.getTotal().toString().isEmpty())){
            throw new GeralException("Erro: Total inválido. ");            
        }
        if((c.getObservacao()==null)||(c.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");            
        }
        if((c.getStatus()==null)||(c.getStatus().isEmpty())){
            throw new GeralException("Erro: Status inválido. ");            
        }
   }
    
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados de Credito encontrado ou NULL
     * @throws GeralException 
     */
    public Credito pesquisar(Integer id)throws GeralException{
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
     * Inseri Credito.
     * @param c
     * @throws GeralException 
     */
    public void inserirCredito(Credito c) throws GeralException{
       try{
           DAO.insert(c);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de uma Credito.
     * @param c
     * @throws GeralException 
     */
    public void validarAlterar(Credito c) throws GeralException{
       if(c==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(c.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((c.getEmissao()==null)||(c.getEmissao().toString().isEmpty())){
            throw new GeralException("Erro: Data de Emissão inválida. ");            
        }
        if((c.getVencimento()==null)||(c.getVencimento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Vencimendo inválido. ");            
        }
        if((c.getPagamento()==null)||(c.getPagamento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Pagamento inválida. ");            
        }
        if((c.getValor()==null)||(c.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }   
        if((c.getDesconto()==null)||(c.getDesconto().toString().isEmpty())){
            throw new GeralException("Erro: Desconto inválido. ");            
        } 
        if((c.getJuros()==null)||(c.getJuros().toString().isEmpty())){
            throw new GeralException("Erro: Juros inválido. ");            
        }
        if((c.getTotal()==null)||(c.getTotal().toString().isEmpty())){
            throw new GeralException("Erro: Total inválido. ");            
        }
        if((c.getObservacao()==null)||(c.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");            
        }
        if((c.getStatus()==null)||(c.getStatus().isEmpty())){
            throw new GeralException("Erro: Status inválido. ");            
        }   
    }
    /**
     * Altera os dados do Crédito existente.
     * @param c
     * @throws GeralException 
     */
    public void alterarCredito(Credito c) throws GeralException{
        try{
            DAO.update(c);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Credito. 
     * @param c
     * @throws GeralException 
     */
    public void validarExcluir(Credito c)throws GeralException{
        if(c==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(c.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Crédito existente.
     * @param c
     * @throws GeralException 
     */
    public void excluirCredito (Credito c) throws GeralException{
           try{
            DAO.remove(c);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
    
}
