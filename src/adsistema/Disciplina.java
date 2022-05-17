/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import com.mycompany.adsistema.enums.PeriodicidadeEnum;
import java.time.LocalDateTime;

/**
 *
 * @author fdsed
 */
public class Disciplina {
    private static int classId;
    private final int id;
    private String nome;
    private PeriodicidadeEnum periodicidade;
    private int cargaHoraria;
    private Curso curso;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    
    Disciplina(String nomeDisciplina, PeriodicidadeEnum periodoDisciplina, Curso cursoDisciplina, String cargaHoraria){
        this.nome = nomeDisciplina;
        this.periodicidade = periodoDisciplina;
        this.curso = cursoDisciplina;
        this.cargaHoraria = Formatador.converteMinutos(cargaHoraria);
        
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

    public String getNome() {
        return nome;
    }

    public PeriodicidadeEnum getPeriodicidade() {
        return periodicidade;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
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

    public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
        this.periodicidade = periodicidade;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", periodicidade=" + periodicidade + ", cargaHoraria=" + cargaHoraria + ", curso=" + curso + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

}
