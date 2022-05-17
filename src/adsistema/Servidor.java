/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;
import com.mycompany.adsistema.enums.CargoEnum;
import com.mycompany.adsistema.enums.TipoUsuario;
import java.time.LocalDateTime;
/**
 *
 * @author fdsed
 */
public class Servidor {
    private static int classId;
    private final int id;
    private Campus campus;
    private TipoUsuario tipoUsuario;
    private String nome;
    private String email;
    private int cargaHoraria = Formatador.converteMinutos("00:00");
    private CargoEnum cargo;
    private String login;
    private String senha;
    private final LocalDateTime registroCriacao;
    private LocalDateTime registroModificacao;
    
    Servidor(String nomeServidor, String emailServidor, CargoEnum cargoServidor, Campus campusServidor, TipoUsuario tipoUsuario,String loginServidor, String senhaServidor){
        this.nome = nomeServidor;
        this.email = emailServidor;
        this.campus = campusServidor;
        this.cargo = cargoServidor;
        this.tipoUsuario = tipoUsuario;
        
        this.login = loginServidor;
        this.senha = senhaServidor;
        
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

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public CargoEnum getCargo() {
        return cargo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
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

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setEmail(String email) {
        this.email = email;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setCargo(CargoEnum cargo) {
        this.cargo = cargo;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setLogin(String login) {
        this.login = login;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setSenha(String senha) {
        this.senha = senha;
        this.registroModificacao = LocalDateTime.now();
    }

    public void setRegistroModificacao(LocalDateTime registroModificacao) {
        this.registroModificacao = registroModificacao;
        this.registroModificacao = LocalDateTime.now();
    }

    public String getCargaHoraria() {
        return Formatador.ConverteHoras(cargaHoraria);
    }
    
    public void AddCargaHoraria(int hrs){
        this.cargaHoraria += hrs;
    }

    @Override
    public String toString() {
        return "Servidor{" + "id=" + id + ", campus=" + campus + ", tipoUsuario=" + tipoUsuario + ", nome=" + nome + ", email=" + email + ", cargo=" + cargo + ", login=" + login + ", senha=" + senha + ", registroCriacao=" + registroCriacao + ", registroModificacao=" + registroModificacao + '}';
    }


}
