/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.FabricasConcretas;

import AbstractFactory.FabricaAbstracta.AbstractFactory;
import AbstractFactory.OperacionAritmetica;
import AbstractFactory.OperacionConvertir;
import AbstractFactory.ProductosConcretos.Binario;

/**
 *
 * @author LN710Q
 */
public class FactoryConvertir implements AbstractFactory {

    @Override
    public OperacionAritmetica getOperacionAritmetica(int tipo) {
        return null;
    }

    @Override
    public OperacionConvertir getOperacionConvertir(int tipo) {
        switch(tipo){
            case 1:
                return new Binario();
            
        }
        return null;
    }
    
}
