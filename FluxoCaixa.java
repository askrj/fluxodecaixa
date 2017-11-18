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
public class FluxoCaixa {
    @Id @GeneratedValue
    private int id;
    private String data;
    private String tipo;
    private double valor;
    private int documento;

    @Override
    public String toString() {
        return "FluxoCaixa{" + "id=" + id + ", data=" + data + ", tipo=" + tipo + ", valor=" + valor + ", documento=" + documento + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    
}
