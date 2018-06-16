/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.FabricaAbstracta;

import AbstractFactory.OperacionAritmetica;
import AbstractFactory.OperacionConvertir;

/**
 *
 * @author UCA
 */
public interface AbstractFactory {
    OperacionAritmetica getOperacionAritmetica(int tipo);
    OperacionConvertir getOperacionConvertir(int tipo);
}
