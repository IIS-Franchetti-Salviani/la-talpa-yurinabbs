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
    
    private boolean giocoAttivo = true;
    private JButton[] buche;
    private int velocita;

    public Talpa(JButton[] buche, int velocita) {
        this.buche = buche;
        this.velocita = velocita;
    }
    
    public void ferma() {
        giocoAttivo = false;
    }
    
    @Override //METODO IMPLEMENTATO CON AI
    public void run() {

        while (giocoAttivo) {

            try {

                int index = (int)(Math.random() * buche.length);

                JButton buca = buche[index];

                // appare
                buca.setText("🐹");
                buca.setBackground(Color.GRAY);

                Thread.sleep(velocita);

                // sparisce
                buca.setText("");
                buca.setBackground(new Color(102,51,0));

                Thread.sleep(300);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
