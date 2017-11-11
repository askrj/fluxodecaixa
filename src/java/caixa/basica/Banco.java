/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.basica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Banco implements Serializable {

    @Id
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    
    public Banco(){
    
    }
    
    @Override
    public String toString() {
        return "Banco{" + "id=" + getId() + ", nome=" + getNome() + '}';
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
}
