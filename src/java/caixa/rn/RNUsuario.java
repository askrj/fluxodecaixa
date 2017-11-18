/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.rn;


import caixa.acesso.UsuarioDAO;
import caixa.basica.Usuario;
import caixa.erro.GeralException;
import caixa.util.Factory;

/**
 *
 * @author User
 */
public class RNUsuario {
   
    private final UsuarioDAO DAO = Factory.getUsuarioDAO();
    
    /**
    * Metodo para validar os campos, verifica se todos os campos foram preenchidos.
    * @param u
    * @throws GeralException 
    */
    public void validarUsuario(Usuario u) throws GeralException{
        if(u==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(u.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((u.getNome()==null)||(u.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((u.getSetor()==null)||(u.getSetor().isEmpty())){
            throw new GeralException("Erro: Setor inválido. ");            
        }
        if((u.getLogin()==null)||(u.getLogin().isEmpty())){
            throw new GeralException("Erro: Login inválido. ");            
        }
        if((u.getSenha()==null)||(u.getSenha().isEmpty())){
            throw new GeralException("Erro: Senha inválido. ");            
        }    
   }
    
    /**
     * Retorna um registro da ID informada.
     * @param id Chave da pesquisa
     * @return Objeto com os dados do Usuario encontrado ou NULL
     * @throws GeralException 
     */
    public Usuario pesquisar(Integer id)throws GeralException{
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
     * Inseri um Usuario.
     * @param u
     * @throws GeralException 
     */
    public void inserirUsuario(Usuario u) throws GeralException{
   
       try{
           DAO.insert(u);
       }catch(Exception e){
           throw new GeralException("Erro: Na DAO.");
       }
    } 
    /**
     * Valida a alteração de um Usuario.
     * @param u
     * @throws GeralException 
     */
    public void validarAlterar(Usuario u) throws GeralException{
        if(u==null){
            throw new GeralException("Erro: Usuário inválido. ");            
        }
        if(u.getId()==null){
            throw new GeralException("Erro: ID inválido. ");            
        }
        if((u.getNome()==null)||(u.getNome().isEmpty())){
            throw new GeralException("Erro: Nome inválido. ");            
        }
        if((u.getSetor()==null)||(u.getSetor().isEmpty())){
            throw new GeralException("Erro: Setor inválido. ");            
        }
        if((u.getLogin()==null)||(u.getLogin().isEmpty())){
            throw new GeralException("Erro: Login inválido. ");            
        }
        if((u.getSenha()==null)||(u.getSenha().isEmpty())){
            throw new GeralException("Erro: Senha inválido. ");            
        }  
    }
    /**
     * Altera os dados de um Usuario existente.
     * @param u
     * @throws GeralException 
     */
    public void alterarUsuario(Usuario u) throws GeralException{
        try{
            DAO.update(u);
        }catch(Exception e){
            throw new GeralException("ERRO: Na Dao");
        }
    }
    /**
     * Valida a exclusão de um Usuario. 
     * @param u
     * @throws GeralException 
     */
    public void validarExcluir(Usuario u)throws GeralException{
        if(u==null){
            throw new GeralException("Erro: O Cliente não existe.");
        }
        if(u.getId()==null){
            throw new GeralException("Erro: A ID não Existe.");
        }      
    } 
    /**
     * Exclui um Usuario existente.
     * @param u
     * @throws GeralException 
     */
    public void excluirUsuario (Usuario u) throws GeralException{
           try{
            DAO.remove(u);
        }catch(Exception e){
            throw new GeralException("ERRO: Na DAO.");
        }    
    }
}
