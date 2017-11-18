/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.CreditoDAO;
import caixa.acesso.DebitoDAO;
import caixa.basica.Credito;
import caixa.basica.Debito;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author User
 */
public class RNDebito {
    private final DebitoDAO DAO = Factory.getDebitoDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param d
    * @throws GeralException 
    */
    public void validarDebito(Debito d) throws GeralException{
        if(d==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(d.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((d.getEmissao()==null)||(d.getEmissao().toString().isEmpty())){
            throw new GeralException("Erro: Data de Emissão inválida. ");            
        }
        if((d.getVencimento()==null)||(d.getVencimento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Vencimendo inválido. ");            
        }
        if((d.getPagamento()==null)||(d.getPagamento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Pagamento inválida. ");            
        }
        if((d.getValor()==null)||(d.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }   
        if((d.getDesconto()==null)||(d.getDesconto().toString().isEmpty())){
            throw new GeralException("Erro: Desconto inválido. ");            
        } 
        if((d.getJuros()==null)||(d.getJuros().toString().isEmpty())){
            throw new GeralException("Erro: Juros inválido. ");            
        }
        if((d.getTotal()==null)||(d.getTotal().toString().isEmpty())){
            throw new GeralException("Erro: Total inválido. ");            
        }
        if((d.getObservacao()==null)||(d.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");            
        }
        if((d.getStatus()==null)||(d.getStatus().isEmpty())){
            throw new GeralException("Erro: Status inválido. ");            
        }
   }
    
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados de Credito encontrado ou NULL
     * @throws GeralException 
     */
    public Debito pesquisar(Integer id)throws GeralException{
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
     * @param d
     * @throws GeralException 
     */
    public void inserirDebito(Debito d) throws GeralException{
       try{
           DAO.insert(d);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de uma Debito.
     * @param d
     * @throws GeralException 
     */
    public void validarAlterar(Debito d) throws GeralException{
       if(d==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(d.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((d.getEmissao()==null)||(d.getEmissao().toString().isEmpty())){
            throw new GeralException("Erro: Data de Emissão inválida. ");            
        }
        if((d.getVencimento()==null)||(d.getVencimento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Vencimendo inválido. ");            
        }
        if((d.getPagamento()==null)||(d.getPagamento().toString().isEmpty())){
            throw new GeralException("Erro: Data de Pagamento inválida. ");            
        }
        if((d.getValor()==null)||(d.getValor().toString().isEmpty())){
            throw new GeralException("Erro: Valor inválido. ");            
        }   
        if((d.getDesconto()==null)||(d.getDesconto().toString().isEmpty())){
            throw new GeralException("Erro: Desconto inválido. ");            
        } 
        if((d.getJuros()==null)||(d.getJuros().toString().isEmpty())){
            throw new GeralException("Erro: Juros inválido. ");            
        }
        if((d.getTotal()==null)||(d.getTotal().toString().isEmpty())){
            throw new GeralException("Erro: Total inválido. ");            
        }
        if((d.getObservacao()==null)||(d.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");            
        }
        if((d.getStatus()==null)||(d.getStatus().isEmpty())){
            throw new GeralException("Erro: Status inválido. ");            
        }   
    }
    /**
     * Altera os dados do Debito existente.
     * @param d
     * @throws GeralException 
     */
    public void alterarDebito(Debito d) throws GeralException{
        try{
            DAO.update(d);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Debito. 
     * @param d
     * @throws GeralException 
     */
    public void validarExcluir(Debito d)throws GeralException{
        if(d==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(d.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Debito existente.
     * @param d
     * @throws GeralException 
     */
    public void excluirDebito (Debito d) throws GeralException{
           try{
            DAO.remove(d);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
}
