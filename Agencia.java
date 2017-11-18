/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluxodecaixa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author casa
 */
@Entity
public class Agencia {
    @Id
    private int id;
    private String nome;
    private String conta;
    private String opcao;
    private String tipo;
    private String data;
    
    private Banco banco;

    @Override
    public String toString() {
        return "Agencia{" + "id=" + id + ", nome=" + nome + ", conta=" + conta + ", opcao=" + opcao + ", tipo=" + tipo + ", data=" + data + ", banco=" + banco + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    
    
}
