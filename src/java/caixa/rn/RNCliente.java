/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.ClienteDAO;
import caixa.basica.Cliente;
import caixa.erro.GeralException;
import caixa.util.Factory;
//import java.util.ArrayList;

/**
 *
 * @author BrunoMarques
 */
public class RNCliente {
    
    private final ClienteDAO DAO = Factory.getClienteDAO(); 

    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param c
    * @throws GeralException 
    */
    public void validarCliente(Cliente c) throws GeralException{
        if(c==null){
            throw new GeralException("Erro: Cliente inválido. ");            
        }
        if(c.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((c.getNome()==null)||(c.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((c.getFantasia()==null)||(c.getFantasia().isEmpty())){
            throw new GeralException("Erro: Nome Fantasia inválido. ");            
        }
        if((c.getEndereco()==null)||(c.getEndereco().isEmpty())){
            throw new GeralException("Erro: Endereço inválido. ");            
        }
        if((c.getBairro()==null)||(c.getBairro().isEmpty())){
            throw new GeralException("Erro: Bairro inválido. ");            
        }
        if((c.getCidade()==null)||(c.getCidade().isEmpty())){
            throw new GeralException("Erro: Cidade inválida. "); 
        }
         if((c.getUf()==null)||(c.getUf().isEmpty())){
            throw new GeralException("Erro: UF inválido. ");            
        }
        if((c.getCnpj()==null)||(c.getCnpj().toString().isEmpty())){
            throw new GeralException("Erro: CNPJ inválido. ");            
        }
         if((c.getCep()==null)||(c.getCep().toString().isEmpty())){
            throw new GeralException("Erro: CEP inválido. ");            
        }
          if((c.getRg()==null)||(c.getRg().toString().isEmpty())){
            throw new GeralException("Erro: RG inválido. ");            
        }
           if((c.getTelefone()==null)||(c.getTelefone().toString().isEmpty())){
            throw new GeralException("Erro: Telefone inválido. ");            
        }
           if((c.getCelular()==null)||(c.getCelular().toString().isEmpty())){
            throw new GeralException("Erro: Celular inválido. ");            
        }
           if((c.getEmail()==null)||(c.getEmail().isEmpty())){
            throw new GeralException("Erro: Email inválido. ");                    
        }
           if((c.getObservacao()==null)||(c.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");                    
        }
           if((c.getTipo()==null)||(c.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
   
    } 
    /**
     * Retorna um registro do id informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados de um Cliente encontrado ou NULL
     * @throws GeralException 
     */
    public Cliente pesquisar(Integer id)throws GeralException{
        try{
            return DAO.searchByKey(id);
        }catch(Exception msg){
            throw new GeralException("ERRO: Problema na DAO!");
        }    
    } 
    
  /*public ArrayList<Cliente> listar(Integer id)throws GeralException{
        try{
            return DAO.listar();
        }catch(DAOException msg){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }*/
    
    /**
     * Verificar se a id já existe no Bando de Dados.
     * @param id
     * @throws GeralException 
     */
    public void duplicidadeId(Integer id) throws GeralException{
       if(pesquisar(id)!=null){
           throw new GeralException("Erro: Id já existe.");
       }
    }
    /**
     * Inseri um Cliente.
     * @param c
     * @throws GeralException 
     */
    public void inserirCliente(Cliente c) throws GeralException{
   
       try{
           DAO.insert(c);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    
    /**
     * Valida a alteração de um Cliente.
     * @param c
     * @throws GeralException 
     */
    public void validarAlterar(Cliente c) throws GeralException{
    
       if(c==null){
            throw new GeralException("Erro: Cliente inválido. ");            
        }
        if(c.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((c.getNome()==null)||(c.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((c.getFantasia()==null)||(c.getFantasia().isEmpty())){
            throw new GeralException("Erro: Nome Fantasia inválido. ");            
        }
        if((c.getEndereco()==null)||(c.getEndereco().isEmpty())){
            throw new GeralException("Erro: Endereço inválido. ");            
        }
        if((c.getBairro()==null)||(c.getBairro().isEmpty())){
            throw new GeralException("Erro: Bairro inválido. ");            
        }
        if((c.getCidade()==null)||(c.getCidade().isEmpty())){
            throw new GeralException("Erro: Cidade inválida. "); 
        }
         if((c.getUf()==null)||(c.getUf().isEmpty())){
            throw new GeralException("Erro: UF inválido. ");            
        }
        if((c.getCnpj()==null)||(c.getCnpj().toString().isEmpty())){
            throw new GeralException("Erro: CNPJ inválido. ");            
        }
         if((c.getCep()==null)||(c.getCep().toString().isEmpty())){
            throw new GeralException("Erro: CEP inválido. ");            
        }
          if((c.getRg()==null)||(c.getRg().toString().isEmpty())){
            throw new GeralException("Erro: RG inválido. ");            
        }
           if((c.getTelefone()==null)||(c.getTelefone().toString().isEmpty())){
            throw new GeralException("Erro: Telefone inválido. ");            
        }
           if((c.getCelular()==null)||(c.getCelular().toString().isEmpty())){
            throw new GeralException("Erro: Celular inválido. ");            
        }
           if((c.getEmail()==null)||(c.getEmail().isEmpty())){
            throw new GeralException("Erro: Email inválido. ");                    
        }
           if((c.getObservacao()==null)||(c.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");                    
        }
           if((c.getTipo()==null)||(c.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
    }
    
    /**
     * Altera os dados de um Cliente existente.
     * @param c
     * @throws GeralException 
     */
    public void alterarCliente(Cliente c) throws GeralException{
        try{
            DAO.update(c);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Cliente. 
     * @param c
     * @throws GeralException 
     */
    public void validarExcluir(Cliente c)throws GeralException{
        if(c==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(c.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Cliente existente.
     * @param c
     * @throws GeralException 
     */
    public void excluirCliente (Cliente c) throws GeralException{
           try{
            DAO.remove(c);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
}
