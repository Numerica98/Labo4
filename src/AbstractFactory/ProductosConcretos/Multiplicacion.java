/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.ProductosConcretos;

import AbstractFactory.OperacionAritmetica;

/**
 *
 * @author UCA
 */
public class Multiplicacion implements OperacionAritmetica{

    @Override
    public int operar(int num1, int num2) {
        return num1*num2;
    }
    
}
