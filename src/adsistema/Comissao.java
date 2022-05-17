/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import java.time.LocalDateTime;
import java.time.LocalDate;
/**
 *
 * @author fdsed
 */
public class Comissao {
    
    private static int classId;
    private final int id;
    private String nome;
    private int horasSemanais;
    private boolean estado;
    
    private LocalDate inicio;
    private LocalDate terminio;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    Comissao(String nome, int horasSemanais, boolean estado, String dataInicio, String dataTerminio){
        this.nome = nome;
        this.horasSemanais = horasSemanais;
        
        this.inicio = Formatador.converte(dataInicio);
        this.terminio = Formatador.converte(dataTerminio);
        
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

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public boolean isEstado() {
        return estado;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getTerminio() {
        return terminio;
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

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setTerminio(LocalDate terminio) {
        this.terminio = terminio;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    
}
