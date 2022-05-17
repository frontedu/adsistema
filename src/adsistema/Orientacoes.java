/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import com.mycompany.adsistema.enums.TipoOrientacaoEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *=>CRUD de orientações. Informações importantes:  id, tipo de orientação
 * (ensino, pesquisa, extensão, estagio, tcc, mestrado, doutorado)
 * nome do aluno, horas semanais, servidor, data início, data término, data criação e data modificação.
 * @author fdsed
 */
public class Orientacoes {
    
    private static int classId;
    private final int id;
    private TipoOrientacaoEnum tipo;
    private String aluno;
    private int horasSemanais;
    private Servidor servidor;
    
    private LocalDate inicio;
    private LocalDate terminio;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    
   Orientacoes(TipoOrientacaoEnum tipo, String nomeAluno, String horasSemanais, Servidor servidor, String dataInicio, String dataTerminio){
       this.tipo = tipo;
       this.aluno = nomeAluno;
       this.horasSemanais = Formatador.converteMinutos(horasSemanais);
       this.servidor = servidor;
       
       servidor.AddCargaHoraria(this.horasSemanais);
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

    public TipoOrientacaoEnum getTipoOrientacao() {
        return tipo;
    }

    public String getAluno() {
        return aluno;
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

    public void setTipoOrientacao(TipoOrientacaoEnum tipoOrientacao) {
        this.tipo = tipoOrientacao;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
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
        return "Orientacoes{" + "id=" + id + ", tipoOrientacao=" + tipo + ", aluno=" + aluno + ", horasSemanais=" + horasSemanais + ", servidor=" + servidor + ", inicio=" + inicio + ", terminio=" + terminio + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }


}
