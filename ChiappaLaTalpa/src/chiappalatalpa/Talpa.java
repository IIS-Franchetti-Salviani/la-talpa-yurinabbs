/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chiappalatalpa;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author bianconi.yurinabil
 */
public class Talpa implements Runnable{
    
    private int valorePunti;
    private int tempoVisibile;
    private String tipo;
    private boolean attiva;
    private JButton[] buche;

    public Talpa(JButton[] buche) {
        this.buche = buche;
    }
     @Override
    public void run() { //METODO IMPLEMENTATO CON AI
        try {
            // scegli una buca casuale
            int index = (int)(Math.random() * buche.length);

            // mostra la talpa
            buche[index].setText("🐹"); // o cambia colore se vuoi
            buche[index].setBackground(Color.GRAY);

            // resta visibile per un tempo casuale 1-3 sec
            Thread.sleep(1000 + (int)(Math.random() * 2000));

            // scompare
            buche[index].setText("");
            buche[index].setBackground(new Color(139,69,19)); // torna marrone

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
