/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluxodecaixa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author casa
 */
@Entity
public class Debito {
    @Id @GeneratedValue
    private int id;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double desconto;
    private double juros;
    private double total;
    private String observacao;
    private String status;

    Agencia agencia;
    Fornecedor fornecedor;

  
}
