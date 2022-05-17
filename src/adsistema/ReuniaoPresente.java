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
public class ReuniaoPresente {
    private static int classId;
    private final int id;
    private Comissao comissao;
    private Reuniao reuniao;
    private Servidor servidor;
    
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    ReuniaoPresente(Comissao comissao, Reuniao reuniao, Servidor servidor){
        this.comissao = comissao;
        this.reuniao = reuniao;
        this.servidor = servidor;
        
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

    public Reuniao getReuniao() {
        return reuniao;
    }

    public Servidor getServidor() {
        return servidor;
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

    public void setReuniao(Reuniao reuniao) {
        this.reuniao = reuniao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ReuniaoPresente{" + "id=" + id + ", comissao=" + comissao + ", reuniao=" + reuniao + ", servidor=" + servidor + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    
}
