/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.fachada;

import caixa.basica.Agencia;
import caixa.basica.Banco;
import caixa.basica.Cliente;
import caixa.basica.Credito;
import caixa.basica.Debito;
import caixa.basica.FluxoDeCaixa;
import caixa.basica.Fornecedor;
import caixa.basica.Usuario;
import caixa.erro.GeralException;
import caixa.rn.RNAgencia;
import caixa.rn.RNBanco;
import caixa.rn.RNCliente;
import caixa.rn.RNCredito;
import caixa.rn.RNDebito;
import caixa.rn.RNFluxoDeCaixa;
import caixa.rn.RNFornecedor;
import caixa.rn.RNUsuario;

/**
 *
 * @author BrunoMarques
 */
public class Fachada {
    
    private static Fachada instancia;
    private final RNCliente RNCliente = new RNCliente();
    private final RNFornecedor RNFornecedor = new RNFornecedor();
    private final RNUsuario RNUsuario = new RNUsuario();
    private final RNAgencia RNAgencia = new RNAgencia();
    private final RNBanco RNBanco = new RNBanco();
    private final RNCredito RNCredito = new RNCredito();
    private final RNDebito RNDebito = new RNDebito();
    private final RNFluxoDeCaixa RNFluxoDeCaixa = new RNFluxoDeCaixa();
   
    private Fachada(){
    }
    
    public static Fachada getInstancia(){
        if(instancia==null){
            instancia = new Fachada();
        }
        return instancia;
    }
    
    /**
     * Bloco Cliente
     * @param c
     * @throws GeralException 
     */
    public void salvarCliente(Cliente c)throws GeralException{
        RNCliente.validarCliente(c);
        RNCliente.pesquisar(c.getId());
        RNCliente.duplicidadeId(c.getId());
        RNCliente.inserirCliente(c);
        
    }
    public void alterarCliente(Cliente c)throws GeralException{
        RNCliente.validarAlterar(c);
        RNCliente.validarCliente(c);
        RNCliente.alterarCliente(c);
        
    }
    public void excluirCliente(Cliente c)throws GeralException{
        RNCliente.validarExcluir(c);
        RNCliente.validarCliente(c);
        RNCliente.excluirCliente(c);
        
    }
    public void pesquisarCliente(Cliente c)throws GeralException{
         RNCliente.pesquisar(c.getId());
        
    }
    ///////////////////-Fim do Bloco Cliente-////////////////////
    
    /**
     * Bloco Fornecedor
     * @param f
     * @throws GeralException 
     */
    public void salvarFornecedor(Fornecedor f)throws GeralException{
        RNFornecedor.validarFornecedor(f);
        RNFornecedor.pesquisar(f.getId());
        RNFornecedor.duplicidadeId(f.getId());
        RNFornecedor.inserirFornecedor(f);
    }
    public void alterarFornecedor(Fornecedor f)throws GeralException{
        RNFornecedor.validarAlterar(f);
        RNFornecedor.validarFornecedor(f);
        RNFornecedor.alterarFornecedor(f);
    }
    public void excluirFornecedor(Fornecedor f)throws GeralException{
        RNFornecedor.validarExcluir(f);
        RNFornecedor.validarFornecedor(f);
        RNFornecedor.excluirFornecedor(f);
    }
    public void pesquisarFornecedor(Fornecedor f)throws GeralException{
        RNFornecedor.pesquisar(f.getId());
    } 
    ///////////////////-Fim do Bloco Fornecedor-////////////////////
    
    /**
     * Bloco Usuario
     * @param u
     * @throws GeralException 
     */
    public void salvarUsuario(Usuario u)throws GeralException{
        RNUsuario.validarUsuario(u);
        RNUsuario.pesquisar(u.getId());
        RNUsuario.duplicidadeId(u.getId());
        RNUsuario.inserirUsuario(u);
    }
    public void alterarUsuario(Usuario u)throws GeralException{
        RNUsuario.validarAlterar(u);
        RNUsuario.validarUsuario(u);
        RNUsuario.alterarUsuario(u);
    }
    public void excluirUsuario(Usuario u)throws GeralException{
        RNUsuario.validarExcluir(u);
        RNUsuario.validarUsuario(u);
        RNUsuario.excluirUsuario(u);
    }
    public void pesquisarUsuario(Usuario u)throws GeralException{
        RNUsuario.pesquisar(u.getId());
    } 
    //////////////////////-Fim do Usuario-///////////////////////
    
    /**
     * Bloco Agencia
     * @param a
     * @throws GeralException 
     */
    public void salvarAgencia(Agencia a)throws GeralException{
        RNAgencia.validarAgencia(a);
        RNAgencia.pesquisar(a.getId());
        RNAgencia.duplicidadeId(a.getId());
        RNAgencia.inserirAgencia(a);
    }
    public void alterarAgencia(Agencia a)throws GeralException{
        RNAgencia.validarAlterar(a);
        RNAgencia.validarAgencia(a);
        RNAgencia.alterarAgencia(a);
    }
    public void excluirAgencia(Agencia a)throws GeralException{
        RNAgencia.validarExcluir(a);
        RNAgencia.validarAgencia(a);
        RNAgencia.excluirAgencia(a);
    }
    public void pesquisarAgencia(Agencia a)throws GeralException{
        RNAgencia.pesquisar(a.getId());
    } 
    //////////////////////-Fim do Agencia-///////////////////////
    
    /**
     * Bloco Banco
     * @param b
     * @throws GeralException 
     */
    public void salvarBanco(Banco b)throws GeralException{
        RNBanco.validarBanco(b);
        RNBanco.pesquisar(b.getId());
        RNBanco.duplicidadeId(b.getId());
        RNBanco.inserirBanco(b);
    }
    public void alterarAgencia(Banco b)throws GeralException{
        RNBanco.validarAlterar(b);
        RNBanco.validarBanco(b);
        RNBanco.alterarBanco(b);
    }
    public void excluirBanco(Banco b)throws GeralException{
        RNBanco.validarExcluir(b);
        RNBanco.validarBanco(b);
        RNBanco.excluirBanco(b);
    }
    public void pesquisarBanco(Banco b)throws GeralException{
        RNAgencia.pesquisar(b.getId());
    } 
    //////////////////////-Fim do Banco-///////////////////////
    
    /**
     * Bloco Crédito
     * @param c
     * @throws GeralException 
     */
    public void salvarCredito(Credito c)throws GeralException{
        RNCredito.validarCredito(c);
        RNCredito.pesquisar(c.getId());
        RNCredito.duplicidadeId(c.getId());
        RNCredito.inserirCredito(c);
    }
    public void alterarCredito(Credito c)throws GeralException{
        RNCredito.validarAlterar(c);
        RNCredito.validarCredito(c);
        RNCredito.alterarCredito(c);
    }
    public void excluirCredito(Credito c)throws GeralException{
        RNCredito.validarExcluir(c);
        RNCredito.validarCredito(c);
        RNCredito.excluirCredito(c);
    }
    public void pesquisarCredito(Credito c)throws GeralException{
        RNCredito.pesquisar(c.getId());
    } 
    //////////////////////-Fim do Credito-///////////////////////
    
    /**
     * Bloco Debito
     * @param d
     * @throws GeralException 
     */
    public void salvarDebito(Debito d)throws GeralException{
        RNDebito.validarDebito(d);
        RNDebito.pesquisar(d.getId());
        RNDebito.duplicidadeId(d.getId());
        RNDebito.inserirDebito(d);
    }
    public void alterarDebito(Debito d)throws GeralException{
        RNDebito.validarAlterar(d);
        RNDebito.validarDebito(d);
        RNDebito.alterarDebito(d);
    }
    public void excluirDebito(Debito d)throws GeralException{
        RNDebito.validarExcluir(d);
        RNDebito.validarDebito(d);
        RNDebito.excluirDebito(d);
    }
    public void pesquisarDebito(Debito d)throws GeralException{
        RNCredito.pesquisar(d.getId());
    } 
    //////////////////////-Fim do Credito-///////////////////////
    
    /**
     * Bloco Fluxo de Caixa
     * @param f
     * @throws GeralException 
     */
    public void salvarFluxoDeCaixa(FluxoDeCaixa f)throws GeralException{
        RNFluxoDeCaixa.validarFluxoDeCaixa(f);
        RNFluxoDeCaixa.pesquisar(f.getId());
        RNFluxoDeCaixa.duplicidadeId(f.getId());
        RNFluxoDeCaixa.inserirFluxoDeCaixa(f);
    }
    public void alterarFluxoDeCaixa(FluxoDeCaixa f)throws GeralException{
        RNFluxoDeCaixa.validarAlterar(f);
        RNFluxoDeCaixa.validarFluxoDeCaixa(f);
        RNFluxoDeCaixa.alterarFluxoDeCaixa(f);
    }
    public void excluirFluxoDeCaixa(FluxoDeCaixa f)throws GeralException{
        RNFluxoDeCaixa.validarExcluir(f);
        RNFluxoDeCaixa.validarFluxoDeCaixa(f);
        RNFluxoDeCaixa.excluirFluxoDeCaixa(f);
    }
    public void pesquisarFluxoDeCaixa(FluxoDeCaixa f)throws GeralException{
        RNFluxoDeCaixa.pesquisar(f.getId());
    } 
    //////////////////////-Fim do Fluxo de Caixa-///////////////////////
}
