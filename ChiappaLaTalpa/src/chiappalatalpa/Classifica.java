/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chiappalatalpa;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 *
 * @author bianconi.yurinabil
 */
public class Classifica {
    
    private List<String> punteggi;
    
    public Classifica() {
        punteggi = new ArrayList<>();
    }
    
    public void salvaPunteggio(String nome, int punteggio) {
        String record = nome + " - " + punteggio;
        punteggi.add(record);
    }
    
    public void stampaClassifica() {
        for (String s : punteggi) {
            System.out.println(s);
        }
    }
}
