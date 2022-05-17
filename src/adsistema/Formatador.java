/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsistema;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fdsed
 */
public class Formatador {
    
    public static LocalDate converte(String data){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        return LocalDate.parse(data, formatter);
    }
    
    public static LocalDate converteAno(String data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        return LocalDate.parse(data, formatter);
    }
    
    public static LocalDate converteDiaAno(String data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM");
        return LocalDate.parse(data, formatter);
    }
    
    public static int converteMinutos(String horas){
       String[] output = horas.split(":");
       return Integer.parseInt(output[0])*60 + Integer.parseInt(output[1]);
    }
    
    public static String ConverteHoras(int minutos){
        return minutos / 60 + "h" + minutos % 60 + "min";
    }

    
}
