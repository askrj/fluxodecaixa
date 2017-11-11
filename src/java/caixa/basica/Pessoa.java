/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa.basica;

/**
 *
 * @author User
 */
public class Pessoa {

    private String nome;
    private String fantasia;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private Integer cep;
    private Integer cnpj;
    private Integer cpf;
    private Integer inscricao;
    private Integer rg;
    private Integer telefone;
    private Integer celular;
    private String email;
    private String observacao;
    private String tipo;
    
    public Pessoa(){
    
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + getNome() + ", fantasia=" + getFantasia() + ", endere\u00e7o=" + getEndereco() + ", bairro=" + getBairro() + ", cidade=" + getCidade() + ", uf=" + getUf() + ", cep=" + getCep() + ", cnpj=" + getCnpj() + ", cpf=" + getCpf() + ", inscricao=" + getInscricao() + ", rg=" + getRg() + ", telefone=" + getTelefone() + ", celular=" + getCelular() + ", email=" + getEmail() + ", observacao=" + getObservacao() + ", tipo=" + getTipo() + '}';
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
     * @return the fantasia
     */
    public String getFantasia() {
        return fantasia;
    }

    /**
     * @param fantasia the fantasia to set
     */
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    /**
     * @return the endereço
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the cep
     */
    public Integer getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(Integer cep) {
        this.cep = cep;
    }

    /**
     * @return the cnpj
     */
    public Integer getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cpf
     */
    public Integer getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the inscricao
     */
    public Integer getInscricao() {
        return inscricao;
    }

    /**
     * @param inscricao the inscricao to set
     */
    public void setInscricao(Integer inscricao) {
        this.inscricao = inscricao;
    }

    /**
     * @return the rg
     */
    public Integer getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(Integer rg) {
        this.rg = rg;
    }

    /**
     * @return the telefone
     */
    public Integer getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public Integer getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
}
