 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package adsistema;

import com.mycompany.adsistema.enums.CargoEnum;
import com.mycompany.adsistema.enums.PeriodicidadeEnum;
import com.mycompany.adsistema.enums.TipoOrientacaoEnum;
import com.mycompany.adsistema.enums.TipoUsuario;

/**
 *
 * @author fdsed
 */
public class ADSistema {

    public static void main(String[] args) {
        
        Campus[] campus = new Campus[12];
        campus[0] = new Campus("Instituto Federal do Triangulo Mineiro","IFTM", "Uberaba", "Univerde", "38026-300", "03/04/2022");

        Servidor[] servidor = new Servidor[10];
        servidor[0] = new Servidor("Eduardo F", "edu@eddu.com", CargoEnum.PEBTT, campus[0], TipoUsuario.COMUM ,"edu", "001");
        
        Curso[] curso = new Curso[10];
        curso[0] = new Curso("ADS", campus[0], true, "03/05/2020", "10/09/2023");
        
        Atividades[] atividade = new Atividades[10];
        atividade[0] = new Atividades("vender algo", "01:19", servidor[0], "10/03/2022", "10/05/2023");
       
        Orientacoes[] orientacao = new Orientacoes[10];
        orientacao[0] = new Orientacoes(TipoOrientacaoEnum.TCC, "Eduardo", "12:04", servidor[0], "03/04/2022", "05/10/2024");
        
        Disciplina[] disciplina = new Disciplina[10];
        disciplina[0] = new Disciplina("POO", PeriodicidadeEnum.SEMESTRAL, curso[0], "10:00");
        
        OfertaDisciplina[] aula = new OfertaDisciplina[10];
        aula[0] = new OfertaDisciplina(disciplina[0], servidor[0], 2022, 1, 2);

        Relatorios.trabalhoServidor(servidor[0]);
        
    }
    
    
}
