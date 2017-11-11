/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.basica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author BrunoMarques
 */
@Entity
public class FluxoDeCaixa implements Serializable {
@Id @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date caixaData;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false, precision =7, scale = 2)
    private BigDecimal valor;
    @Column(nullable = false)
    private Integer documento;

        @ManyToOne
	@JoinColumn(name="idcredito")
	@Cascade(CascadeType.SAVE_UPDATE)
        private Credito credito;
   
        @ManyToOne
	@JoinColumn(name="iddebito")
	@Cascade(CascadeType.SAVE_UPDATE)
        private Debito debito;
    
    public FluxoDeCaixa(){
    
    }
    
    @Override
    public String toString() {
        return "FluxoCaixa{" + "id=" + getId() + ", data=" + getCaixaData() + ", tipo=" + getTipo() + ", valor=" + getValor() + ", documento=" + getDocumento() + '}';
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
     * @return the caixaData
     */
    public Date getCaixaData() {
        return caixaData;
    }

    /**
     * @param caixaData the caixaData to set
     */
    public void setCaixaData(Date caixaData) {
        this.caixaData = caixaData;
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
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return the documento
     */
    public Integer getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
}
