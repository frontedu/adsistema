/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import com.mycompany.adsistema.enums.PapelEnum;
import java.time.LocalDateTime;
import java.time.LocalDate;
/**
 *=>CRUD vinculo de servidores a comissões. Informações importantes: 
 * id, comissão, servidor, papel (presidente, vice, secretario, participante, suplemente),
 * data entrada, data saída, data criação e data modificação. 
 * Deve ser possível encerrar uma comissão. Ao encerrar a comissão o vínculo dos servidores a comissão é encerrado.
 * Basta modificar a data de término.
 * @author fdsed
 */
public class ServidorComissao {
    private static int classId;
    private final int id;
    private Comissao comissao;
    private Servidor servidor;
    private PapelEnum papel;
    
    private LocalDate entrada;
    private LocalDate saida;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    
    ServidorComissao(Comissao comissao, Servidor servidor, PapelEnum papel, String entrada, String saida){
        this.comissao = comissao;
        this.servidor = servidor;
        this.papel = papel;
        
        this.entrada = Formatador.converte(entrada);
        this.saida = Formatador.converte(saida);
        
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

    public Servidor getServidor() {
        return servidor;
    }

    public PapelEnum getPapel() {
        return papel;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public LocalDate getSaida() {
        return saida;
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

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setPapel(PapelEnum papel) {
        this.papel = papel;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
    }

    @Override
    public String toString() {
        return "ServidorComissao{" + "id=" + id + ", comissao=" + comissao + ", servidor=" + servidor + ", papel=" + papel + ", entrada=" + entrada + ", saida=" + saida + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }

    
}
