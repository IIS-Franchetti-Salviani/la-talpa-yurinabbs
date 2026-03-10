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
    
    private boolean giocoAttivo;
    private JButton[] buche;

    public Talpa(JButton[] buche) {
        this.buche = buche;
        giocoAttivo = true;
    }
    
    public void fermaGioco() {
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

                Thread.sleep(1200);

                // sparisce
                buca.setText("");
                buca.setBackground(new Color(102,51,0));

                Thread.sleep(800);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
