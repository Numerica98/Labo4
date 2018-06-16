/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.FabricasConcretas;

import AbstractFactory.FabricaAbstracta.AbstractFactory;
import AbstractFactory.OperacionAritmetica;
import AbstractFactory.OperacionConvertir;
import AbstractFactory.ProductosConcretos.Division;
import AbstractFactory.ProductosConcretos.Multiplicacion;
import AbstractFactory.ProductosConcretos.Resta;
import AbstractFactory.ProductosConcretos.Suma;

/**
 *
 * @author UCA
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public OperacionAritmetica getOperacionAritmetica(int tipo) {
        switch(tipo){
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
        }
        return null;
    }

    @Override
    public OperacionConvertir getOperacionConvertir(int tipo) {
        return null;
    }
    
}
