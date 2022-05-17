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
public class Curso {
    private static int classId;
    private final int id;
    private Campus campus;
    private String nome;
    private boolean status;
    private LocalDate inicio;
    private LocalDate terminio;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    Curso(String nomeCurso, Campus campusServidor, boolean statusCurso, String dataInicio, String dataTerminio){
        this.nome = nomeCurso;
        this.campus = campusServidor;
        this.status = statusCurso;
        
        
        this.inicio = Formatador.converte(dataInicio);
        this.terminio = Formatador.converte(dataTerminio);
        
        classId++;
        this.id = classId;
        this.registroCriacao = LocalDateTime.now();
        this.registroModificacao = LocalDateTime.now();
    }

    public static int getClassId() {
        return classId;
    }

    public int getId() {
        return id;
    }

    public Campus getCampus() {
        return campus;
    }

    public String getNome() {
        return nome;
    }

    public boolean isStatus() {
        return status;
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

    public void setCampus(Campus campus) {
        this.campus = campus;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setStatus(boolean status) {
        this.status = status;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public void setTerminio(LocalDate terminio) {
        this.terminio = terminio;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", campus=" + campus + ", nome=" + nome + ", status=" + status + ", inicio=" + inicio + ", terminio=" + terminio + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    


    
}
