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
    
    private List<Giocatore> lista;
    
    public Classifica() {
        lista = new ArrayList<>();
    }
    
    public void salvaPunteggio(String nome, int punteggio) {
        lista.add(new Giocatore(nome,punteggio));
    }
    
    public void stampaClassifica() {
        lista.sort((a,b) -> b.getPunteggio() - a.getPunteggio());
        
        System.out.println("CLASSIFICA");
        
        for(Giocatore g : lista){
            
            System.out.println(g.getNome() + " - " + g.getPunteggio());
        }
    }
}
