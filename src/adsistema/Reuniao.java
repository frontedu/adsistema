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
public class Reuniao {
    
    private static int classId;
    private final int id;
    private Comissao comissao;
    private String conteudo;
    private Servidor secretario;
    
    private LocalDate dataReuniao;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    
    Reuniao(Comissao comissao, String conteudo, Servidor secretario, String dataReuniao){
        this.comissao = comissao;
        this.conteudo = conteudo;
        this.secretario = secretario;
        
        this.dataReuniao = Formatador.converte(dataReuniao);
        
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

    public Comissao getComissao() {
        return comissao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Servidor getSecretario() {
        return secretario;
    }

    public LocalDate getDataReuniao() {
        return dataReuniao;
    }

    public LocalDateTime getRegistroCriacao() {
        return registroCriacao;
    }

    public LocalDateTime getRegistroModificacao() {
        return registroModificacao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setSecretario(Servidor secretario) {
        this.secretario = secretario;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setDataReuniao(LocalDate dataReuniao) {
        this.dataReuniao = dataReuniao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Reuniao{" + "id=" + id + ", comissao=" + comissao + ", conteudo=" + conteudo + ", secretario=" + secretario + ", dataReuniao=" + dataReuniao + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    
}
