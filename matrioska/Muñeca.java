/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrioska;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Muñeca extends JFrame {
    

JPanel BaG2,BaG1,bag4,tor1,tor2,tor3,bas;
    Pila acciones = new Pila();
     JLabel txt1,txt2;    
   
    public Muñeca (){
    setTitle("Muñecas matrioska"); 
    setSize(1200, 700);
    setLayout(null); 
    cuerpo(); 
    this.setResizable(Boolean.FALSE); 
    setLocationRelativeTo(null); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); 


        
    }
    public final void cuerpo(){
    bag4 = new JPanel();
    bag4.setBackground(Color.GRAY);//gris fondo
    bag4.setBounds(0,0,1200, 700);
    BaG2 = new JPanel();
    BaG2.setBackground(new Color (148,60,5));//mesa
    BaG2.setBounds(90,350,1000,350);
    BaG1 = new JPanel();
    BaG1.setBackground(Color.GRAY);//gris fondo 2 
   BaG1.setBounds(117,400,950,300);
    bas = new JPanel();
    txt1 = new JLabel("Cuantas muñecas quieres?(el limite son 9)");
    txt1.setBounds(10, 10, 500, 30);
    


    JTextField incrementar = acciones.getIncrementar();
    
  
    JPanel bar1 = acciones.bar1;
    JPanel bar2 = acciones.bar2;
    JPanel bar3 =acciones.bar3;
    JPanel bar4 = acciones.bar4;
    JPanel bar5 =acciones.bar5;
    JPanel bar6 = acciones.bar6;
    JPanel bar7 = acciones.bar7;
    JPanel bar8 = acciones.bar8;
    JPanel bar9 = acciones.bar9;
   
    add(txt1);   
    add(incrementar);
    
    add(bar1);
    add(bar2);
    add(bar3);
    add(bar4);
    add(bar5);
    add(bar6);
    add(bar7);
    add(bar8);
    add(bar9);

    add(BaG1);  
    add(BaG2);
    add(bag4);    
    }
}
