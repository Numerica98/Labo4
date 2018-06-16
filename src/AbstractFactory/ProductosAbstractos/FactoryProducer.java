/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.ProductosAbstractos;

import AbstractFactory.FabricaAbstracta.AbstractFactory;
import AbstractFactory.FabricasConcretas.FactoryAritmetica;
import AbstractFactory.FabricasConcretas.FactoryConvertir;

/**
 *
 * @author UCA
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int tipo){
        switch (tipo){
            case 1:
                return new FactoryAritmetica();
            case 2:
                return new FactoryConvertir();
        }
        return null;
    }
}
