/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.basica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author BrunoMarques
 */
@Entity
public class Agencia implements Serializable {
   
    @Id @GeneratedValue
    @Column(nullable = false)
    private Integer id;
     @Column(nullable = false)
    private String nome;
     @Column(nullable = false) 
    private String conta;
      @Column(nullable = true)
    private String opcao;
     @Column(nullable = false)  
    private String tipo;
     @Column(nullable = true)
    private String dataAtual;
    
        @ManyToOne
	@JoinColumn(name="idbanco")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Banco banco;

    @Override
    public String toString() {
        return "Agencia{" + "id=" + id + ", nome=" + nome + ", conta=" + conta + ", opcao=" + opcao + ", tipo=" + tipo + ", data=" + dataAtual + ", banco=" + banco + '}';
    }
    
    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the conta
     */
    public String getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(String conta) {
        this.conta = conta;
    }

    /**
     * @return the opcao
     */
    public String getOpcao() {
        return opcao;
    }

    /**
     * @param opcao the opcao to set
     */
    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the data
     */
    public String getDataAtual() {
        return dataAtual;
    }

    /**
     * @param dataAtual the data to set
     */
    public void setData(String dataAtual) {
        this.dataAtual = dataAtual;
    }

    void setBanco(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
