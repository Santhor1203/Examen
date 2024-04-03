/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrioska;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Stack;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Pila  extends JPanel {
  JPanel bar1,bar2,bar3,bar4,bar5,bar6,bar7,bar8,bar9;
 
    int contador = 0;
     JTextField incrementar;
    Stack <Integer> pila=new Stack <Integer>();
    public Pila (){
    bar1= new JPanel();
    bar1.setBackground(Color.BLACK);
    bar2= new JPanel();
    bar2.setBackground(Color.BLUE);
    bar3= new JPanel();
    bar3.setBackground(Color.CYAN);
    bar4=new JPanel();
    bar4.setBackground(Color.DARK_GRAY);
    bar5=new JPanel();
    bar5.setBackground(Color.GREEN);
    bar6=new JPanel();
    bar6.setBackground(Color.ORANGE);
    bar7=new JPanel();
    bar7.setBackground(Color.PINK);
    bar8=new JPanel();
    bar8.setBackground(Color.RED);
    bar9= new JPanel();
    bar9.setBackground(Color.BLACK);
    
    
    incrementar= new JTextField();
    incrementar.setBounds(300, 10, 150, 30);
    incrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementarContadorRecursivo();
            }
        });
        
    }
    public void incrementarContadorRecursivo() {    
        String contador2= incrementar.getText();
        contador = Integer.parseInt(contador2);

        pila.push(contador);
        bar1.setVisible(true);
        bar1.setBounds(1000,285,16,10);
    if (contador==2){
        bar2.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
    }
    if (contador==3){
        bar3.setVisible(true);
         bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
    }
    if(contador==4){
        bar4.setVisible(true);
       bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
    }
    if (contador==5){
        bar5.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
        bar5.setBounds(500,285,48,50);
    }
    if (contador==6){
        bar6.setVisible(true);
        bar7.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
        bar5.setBounds(500,285,48,50);
        bar6.setBounds(400,285,56,60);
    }
    if (contador==7){
        bar7.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
        bar5.setBounds(500,285,48,50);
        bar6.setBounds(400,285,56,60);
        bar7.setBounds(300,285,64,70);
    }
    if (contador==8){
        bar8.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
        bar5.setBounds(500,285,48,50);
        bar6.setBounds(400,285,56,60);
        bar7.setBounds(300,285,64,70);
        bar8.setBounds(200,285,72,80);
       
        
    }
    if (contador==9){
        bar9.setVisible(true);
        bar1.setBounds(1000,285,16,10);
        bar2.setBounds(800,285,24,20);
        bar3.setBounds(700,285,32,30);
        bar4.setBounds(600,285,40,40);
        bar5.setBounds(500,285,48,50);
        bar6.setBounds(400,285,56,60);
        bar7.setBounds(300,285,64,70);
        bar8.setBounds(200,285,72,80);
        bar9.setBounds(100,285,80,90);
        
        JOptionPane.showMessageDialog(null,"Limite de barras alcanzado " + contador); 
        
    }
    pila.pop();
    }

  
    public JTextField getIncrementar() {
        return incrementar;
    }

}   
