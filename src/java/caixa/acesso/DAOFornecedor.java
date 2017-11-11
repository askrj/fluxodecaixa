/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.acesso;

import caixa.basica.Fornecedor;
import caixa.erro.DAOException;

/**
 *
 * @author User
 */
public interface DAOFornecedor {
    
    /**
     * Salva os dados no Banco de Dados.
     * @param f Objeto válidado com os dados
     * @throws DAOException 
     */
//    public void inserir(Fornecedor f)throws DAOException;
    
    /**
     * Remove um registro de Fornecedor do Banco de Dados.
     * @param f Obejto contendo o CNPJ do Fornecedor.
     * @throws DAOException 
     */
//    public void excluir(Fornecedor f)throws DAOException;
    
    /**
     * Altera um Fornecedor no Banco de Dados.
     * @param f Obejto validado contendo os dados, inclusive o CNPJ.
     * @throws DAOException 
     */
 //   public void alterar(Fornecedor f)throws DAOException;
    
    /**
     * Retorna um CNPJ do Fornecedor.
     * @param cnpj
     * @return CPF encontrado ou Nulo.
     * @throws DAOException 
     */
//    public Fornecedor pesquisar(Integer cnpj)throws DAOException;
    
}
