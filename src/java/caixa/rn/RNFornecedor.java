/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;

import caixa.acesso.FornecedorDAO;
import caixa.basica.Fornecedor;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author BrunoMarques
 */
public class RNFornecedor {
    private final FornecedorDAO DAO = Factory.getFornecedorDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param f
    * @throws GeralException 
    */
    public void validarFornecedor(Fornecedor f) throws GeralException{
        if(f==null){
            throw new GeralException("Erro: Cliente inválido. ");            
        }
        if(f.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((f.getNome()==null)||(f.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((f.getFantasia()==null)||(f.getFantasia().isEmpty())){
            throw new GeralException("Erro: Nome Fantasia inválido. ");            
        }
        if((f.getEndereco()==null)||(f.getEndereco().isEmpty())){
            throw new GeralException("Erro: Endereço inválido. ");            
        }
        if((f.getBairro()==null)||(f.getBairro().isEmpty())){
            throw new GeralException("Erro: Bairro inválido. ");            
        }
        if((f.getCidade()==null)||(f.getCidade().isEmpty())){
            throw new GeralException("Erro: Cidade inválida. "); 
        }
         if((f.getUf()==null)||(f.getUf().isEmpty())){
            throw new GeralException("Erro: UF inválido. ");            
        }
        if((f.getCnpj()==null)||(f.getCnpj().toString().isEmpty())){
            throw new GeralException("Erro: CNPJ inválido. ");            
        }
         if((f.getCep()==null)||(f.getCep().toString().isEmpty())){
            throw new GeralException("Erro: CEP inválido. ");            
        }
          if((f.getRg()==null)||(f.getRg().toString().isEmpty())){
            throw new GeralException("Erro: RG inválido. ");            
        }
           if((f.getTelefone()==null)||(f.getTelefone().toString().isEmpty())){
            throw new GeralException("Erro: Telefone inválido. ");            
        }
           if((f.getCelular()==null)||(f.getCelular().toString().isEmpty())){
            throw new GeralException("Erro: Celular inválido. ");            
        }
           if((f.getEmail()==null)||(f.getEmail().isEmpty())){
            throw new GeralException("Erro: Email inválido. ");                    
        }
           if((f.getObservacao()==null)||(f.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");                    
        }
           if((f.getTipo()==null)||(f.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
   
    } 
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados do Fornecdor encontrado ou NULL
     * @throws GeralException 
     */
    public Fornecedor pesquisar(Integer id)throws GeralException{
        try{
            return DAO.searchByKey(id);
        }catch(Exception msg){
            throw new GeralException("ERRO: Problema na DAO");
        }    
    } 
    
  /*  public ArrayList<Cliente> listar(Integer id)throws GeralException{
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
     * @param f
     * @throws GeralException 
     */
    public void inserirFornecedor(Fornecedor f) throws GeralException{
   
       try{
           DAO.insert(f);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    
    /**
     * Valida a alteração de um Aluno.
     * @param f
     * @throws GeralException 
     */
    public void validarAlterar(Fornecedor f) throws GeralException{
    
       if(f==null){
            throw new GeralException("Erro: Cliente inválido. ");            
        }
        if(f.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((f.getNome()==null)||(f.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((f.getFantasia()==null)||(f.getFantasia().isEmpty())){
            throw new GeralException("Erro: Nome Fantasia inválido. ");            
        }
        if((f.getEndereco()==null)||(f.getEndereco().isEmpty())){
            throw new GeralException("Erro: Endereço inválido. ");            
        }
        if((f.getBairro()==null)||(f.getBairro().isEmpty())){
            throw new GeralException("Erro: Bairro inválido. ");            
        }
        if((f.getCidade()==null)||(f.getCidade().isEmpty())){
            throw new GeralException("Erro: Cidade inválida. "); 
        }
         if((f.getUf()==null)||(f.getUf().isEmpty())){
            throw new GeralException("Erro: UF inválido. ");            
        }
        if((f.getCnpj()==null)||(f.getCnpj().toString().isEmpty())){
            throw new GeralException("Erro: CNPJ inválido. ");            
        }
         if((f.getCep()==null)||(f.getCep().toString().isEmpty())){
            throw new GeralException("Erro: CEP inválido. ");            
        }
          if((f.getRg()==null)||(f.getRg().toString().isEmpty())){
            throw new GeralException("Erro: RG inválido. ");            
        }
           if((f.getTelefone()==null)||(f.getTelefone().toString().isEmpty())){
            throw new GeralException("Erro: Telefone inválido. ");            
        }
           if((f.getCelular()==null)||(f.getCelular().toString().isEmpty())){
            throw new GeralException("Erro: Celular inválido. ");            
        }
           if((f.getEmail()==null)||(f.getEmail().isEmpty())){
            throw new GeralException("Erro: Email inválido. ");                    
        }
           if((f.getObservacao()==null)||(f.getObservacao().isEmpty())){
            throw new GeralException("Erro: Observação inválida. ");                    
        }
           if((f.getTipo()==null)||(f.getTipo().isEmpty())){
            throw new GeralException("Erro: Tipo inválido. ");            
        }
    }
    
    /**
     * Altera os dados de um Fornecedor existente.
     * @param f
     * @throws GeralException 
     */
    public void alterarFornecedor(Fornecedor f) throws GeralException{
        try{
            DAO.update(f);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Fornecedor. 
     * @param f
     * @throws GeralException 
     */
    public void validarExcluir(Fornecedor f)throws GeralException{
        if(f==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(f.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Fornecedor existente.
     * @param f
     * @throws GeralException 
     */
    public void excluirFornecedor (Fornecedor f) throws GeralException{
           try{
            DAO.remove(f);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
}
