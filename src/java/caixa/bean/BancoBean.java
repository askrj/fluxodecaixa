/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.bean;

import caixa.basica.Banco;
import caixa.erro.GeralException;
import caixa.fachada.Fachada;
import caixa.rn.RNBanco;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="bancoBean")
@SessionScoped
public class BancoBean {
    //testando alteraçao de arquivo
    private Banco bancoselecionado = new Banco();
    
    public void salvar() throws GeralException{
        Fachada fachada = Fachada.getInstancia();
        fachada.salvarBanco(bancoselecionado);
        FacesMessage faces = new FacesMessage("Banco cadastrado com sucesso!");
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, faces);
        
    }

    public Banco getBancoselecionado() {
        return bancoselecionado;
    }

    public void setBancoselecionado(Banco bancoselecionado) {
        this.bancoselecionado = bancoselecionado;
    }
   
}
