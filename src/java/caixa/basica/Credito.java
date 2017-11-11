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
 * @author User
 */
@Entity
public class Credito implements Serializable {

    @Id @GeneratedValue
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date emissao;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date vencimento;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pagamento;
    @Column(nullable = true, precision =7, scale = 2)
    private BigDecimal valor;
    @Column(nullable = true, precision =7, scale = 2)
    private BigDecimal desconto;
    @Column(nullable = true, precision =7, scale = 2)
    private BigDecimal juros;
    @Column(nullable = true, precision =7, scale = 2)
    private BigDecimal total;
    private String observacao;
    private String status;
    
        @ManyToOne
	@JoinColumn(name="idagencia")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Agencia agencia;

        @ManyToOne
	@JoinColumn(name="idbanco")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Banco banco;
   
        @ManyToOne
	@JoinColumn(name="idcliente")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Cliente cliente;
    
    
    public Credito(){
    
    }

    @Override
    public String toString() {
        return "Credito{" + "id=" + id + ", emissao=" + emissao + ", vencimento=" + vencimento + ", pagamento=" + pagamento + ", valor=" + valor + ", desconto=" + desconto + ", juros=" + juros + ", total=" + total + ", observacao=" + observacao + ", status=" + status + ", agencia=" + agencia + ", banco=" + banco + ", cliente=" + cliente + '}';
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
     * @return the emissao
     */
    public Date getEmissao() {
        return emissao;
    }

    /**
     * @param emissao the emissao to set
     */
    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    /**
     * @return the vencimento
     */
    public Date getVencimento() {
        return vencimento;
    }

    /**
     * @param vencimento the vencimento to set
     */
    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    /**
     * @return the pagamento
     */
    public Date getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
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
     * @return the desconto
     */
    public BigDecimal getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the juros
     */
    public BigDecimal getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(BigDecimal juros) {
        this.juros = juros;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the agencia
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
}
