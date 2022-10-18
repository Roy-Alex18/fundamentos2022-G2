/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author Alex
 */
public class FondoPanel extends JPanel{
    private Image image;
    String nombreImg="";
    UtilsX obj=new UtilsX();
    @Override
    public void paint(Graphics g){
        image=new ImageIcon(obj.getFile("secrecy-icon.png")).getImage();
        g.drawImage(image,0,0, getWidth(),getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
