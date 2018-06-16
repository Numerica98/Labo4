/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.ProductosConcretos;

import AbstractFactory.OperacionConvertir;


/**
 *
 * @author LN710Q
 */
public class Binario implements OperacionConvertir {

    @Override
    public String convertir(int num) {
        String binario="";
        int residuo;
        
        while(num>0){
           residuo= num%2;
           binario= residuo+ binario;
           num= num/2;
        }
        return binario;
    }
    
}
