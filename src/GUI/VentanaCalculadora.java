/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class VentanaCalculadora extends JPanel{
    public int WIDTH = 450, widthTF= 120, widthB=80;
    public int HEIGHT= 300, heightTF= 30, heightB= 30;
    public JTextField textF1, textF2, textF3, textF4, textF5;
    public JButton button1, button2, button3;
    
    public VentanaCalculadora(){
        textF1= new JTextField();
        textF1.setBounds(new Rectangle(50,40,widthTF,heightTF));
        
        textF2= new JTextField();
        textF2.setBounds(new Rectangle(190,40,widthTF,heightTF));
        
        textF3= new JTextField();
        textF3.setBounds(new Rectangle(10,200,widthTF,heightTF));
        
        textF4= new JTextField();
        textF4.setBounds(new Rectangle(150,200,widthTF,heightTF));
        
        textF5= new JTextField();
        textF5.setBounds(new Rectangle(290,200,widthTF,heightTF));
        
        button1= new JButton("Sumar");
        button1.setBounds(new Rectangle(10,115,widthB,heightB));
        
        button2= new JButton("Restar");
        button2.setBounds(new Rectangle(150,115,widthB,heightB));
        
        button3= new JButton("Convertir");
        button3.setBounds(new Rectangle(290,115,110,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(false);
        textF5.setEditable(false);
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                textF2.setText(textF1.getText());
            }
        });
        
        add(textF1);
        add(textF2);
        add(button1);
        add(textF3);
        add(button2);
        add(textF4);
        add(button3);
        add(textF5);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }
}
