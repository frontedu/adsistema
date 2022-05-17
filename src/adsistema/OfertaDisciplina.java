/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;

import java.time.LocalDateTime;

/**
 *
 * @author fdsed
 */
public final class OfertaDisciplina {
    int classId;
    private final int id;
    private Disciplina disciplina;
    private Servidor professor;
    private int ano;
    private int semestre;
    private int aulasSemanais;
    private int cargaHoraria = Formatador.converteMinutos("00:00");
    private int duracaoAula = Formatador.converteMinutos("00:50");
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    OfertaDisciplina(Disciplina disciplina, Servidor professor, int ano, int semestre, int aulasSemanais){
        this.disciplina = disciplina;
        this.professor = professor;
        this.ano = ano;
        this.semestre = semestre;
        this.aulasSemanais = aulasSemanais;
        cargaHoraria();
        
        classId++;
        this.id = classId;
        this.registroCriacao = LocalDateTime.now();
        this.registroModificacao = LocalDateTime.now();
        
    }

    public int getClassId() {
        return classId;
    }

    public int getId() {
        return id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Servidor getProfessor() {
        return professor;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getAulasSemanais() {
        return aulasSemanais;
    }

    public LocalDateTime getRegistroCriacao() {
        return registroCriacao;
    }

    public LocalDateTime getRegistroModificacao() {
        return registroModificacao;
    }

    public void setClassId(int classId) {
        this.classId = classId;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setProfessor(Servidor professor) {
        this.professor = professor;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setAno(int ano) {
        this.ano = ano;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setAulasSemanais(int aulasSemanais) {
        this.aulasSemanais = aulasSemanais;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
        
    }

    public int getDuracaoAula() {
        return duracaoAula;
    }

    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
        this.registroModificacao = LocalDateTime.now();
    }
    
    
    int cargaHoraria(){
        this.cargaHoraria = this.duracaoAula * this.aulasSemanais;
        professor.AddCargaHoraria(cargaHoraria);
        return this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "OfertaDisciplina{" + "classId=" + classId + ", id=" + id + ", disciplina=" + disciplina + ", professor=" + professor + ", ano=" + ano + ", semestre=" + semestre + ", aulasSemanais=" + aulasSemanais + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    
}
