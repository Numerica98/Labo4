/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.FabricaAbstracta.AbstractFactory;
import AbstractFactory.OperacionAritmetica;
import AbstractFactory.OperacionConvertir;
import AbstractFactory.ProductosAbstractos.FactoryProducer;
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
    public int WIDTH = 730, widthTF= 120, widthB=80;
    public int HEIGHT= 300, heightTF= 30, heightB= 30;
    public JTextField textF1, textF2, textF3;
    public JButton button1, button2, button3, button4, button5;
    
    public VentanaCalculadora(){
        textF1= new JTextField();
        textF1.setBounds(new Rectangle(190,40,widthTF,heightTF));
        
        textF2= new JTextField();
        textF2.setBounds(new Rectangle(330,40,widthTF,heightTF));
        
        textF3= new JTextField();
        textF3.setBounds(new Rectangle(290,200,widthTF,heightTF));
        
        button1= new JButton("Sumar");
        button1.setBounds(new Rectangle(30,115,widthB,heightB));
        
        button2= new JButton("Restar");
        button2.setBounds(new Rectangle(170,115,widthB,heightB));
        
        button3= new JButton("Binario");
        button3.setBounds(new Rectangle(290,115,110,heightB));
        
        button4= new JButton("Multiplicar");
        button4.setBounds(new Rectangle(430,115,110,heightB));
        
        button5= new JButton("Dividir");
        button5.setBounds(new Rectangle(570,115,110,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        AbstractFactory factory1, factory2;
        factory1= FactoryProducer.getFactory(1);
        OperacionAritmetica suma = factory1.getOperacionAritmetica(1);
        OperacionAritmetica resta= factory1.getOperacionAritmetica(2);
        OperacionAritmetica mult= factory1.getOperacionAritmetica(3);
        OperacionAritmetica div= factory1.getOperacionAritmetica(4);
        
        factory2= FactoryProducer.getFactory(2);
        OperacionConvertir binario= factory2.getOperacionConvertir(1);
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){                
                textF3.setText(String.valueOf(suma.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){                
                textF3.setText(String.valueOf(resta.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){                
                textF3.setText(binario.convertir(Integer.parseInt(textF1.getText())));
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){                
                textF3.setText(String.valueOf(mult.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
            }
        });
        
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){                
                textF3.setText(String.valueOf(div.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
            }
        });
        
        add(textF1);
        add(textF2);
        add(button1);
        add(textF3);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }
}
