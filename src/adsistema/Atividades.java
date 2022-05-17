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
public class Atividades {
    private static int classId;
    private final int id;
    private String descricao;
    private int horasSemanais;
    private Servidor servidor;
    
    private LocalDate inicio;
    private LocalDate terminio;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    
    
    
    Atividades(String descricao, String horasSemanais, Servidor servidor, String dataInicio, String dataTerminio){
        this.descricao = descricao;
        this.horasSemanais = Formatador.converteMinutos(horasSemanais);
        this.servidor = servidor;
        
        this.inicio = Formatador.converte(dataInicio);
        this.terminio = Formatador.converte(dataTerminio);

        servidor.AddCargaHoraria(this.horasSemanais);
        
        classId++;
        this.id = classId;
        this.registroCriacao = LocalDateTime.now();
        this.registroModificacao = LocalDateTime.now();
        
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public Servidor getServidor() {
        return servidor;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
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

      
    @Override
    public String toString() {
        return "Atividades{" + "id=" + id + ", descricao=" + descricao + ", horasSemanais=" + horasSemanais + ", servidor=" + servidor + ", inicio=" + inicio + ", terminio=" + terminio + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }
    
    
    
}
