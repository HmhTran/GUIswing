/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import javax.swing.*;
import java.awt.*;
        
/**
 *
 * @author ktsianos
 */
public class GamePlay extends javax.swing.JPanel{
    
    private java.awt.Rectangle R;
    
    public GamePlay(){
        R = new java.awt.Rectangle(0, 0, 15, 15);
    }
            
    
    protected void paintComponent(Graphics G){
        super.paintComponent(G);
        Graphics2D G2 = (Graphics2D) G;
        if(R!=null){
            G2.draw(R);
        }
    }    
    
    public void MoveRect(int dx, int dy){
        
        R.setLocation(R.x+dx, R.y + dy);
        repaint();
    }
}
