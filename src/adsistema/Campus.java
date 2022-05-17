/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author fdsed
 */
public class Campus {
    private static int classId;
    private final int id;
    private String nome;
    private String abreviacao;
    private String cidade;
    private String bairro;
    private String cep;
    private LocalDate criacao;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    Campus(String nomeCampus, String abreviacaoCampus, String cidade, String bairro, String cep, String criacao){
        this.nome = nomeCampus;
        this.abreviacao = abreviacaoCampus;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.criacao = Formatador.converte(criacao);
        
        classId++;
        this.id = classId;
        this.registroCriacao = LocalDateTime.now();
        this.registroModificacao = LocalDateTime.now();

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public LocalDateTime getRegistroCriacao() {
        return registroCriacao;
    }

    public LocalDateTime getRegistroModificacao() {
        return registroModificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCep(String cep) {
        this.cep = cep;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Campus{" + "id=" + id + ", nome=" + nome + ", abreviacao=" + abreviacao + ", cidade=" + cidade + ", bairro=" + bairro + ", cep=" + cep + ", criacao=" + criacao + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    
    

    
}
