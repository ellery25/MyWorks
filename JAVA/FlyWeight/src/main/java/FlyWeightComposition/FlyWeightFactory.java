/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeightComposition;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HOME
 */
public class FlyWeightFactory {
    
    private Map<String, FlyWeight> flyweights;
    
     public FlyWeightFactory() {
        flyweights = new HashMap<>();
    }
     
     public FlyWeight getFlyweight(String estadoCompartido) {
        if (flyweights.containsKey(estadoCompartido)) {
            return flyweights.get(estadoCompartido);
        } else {
            FlyWeight flyweight = new FlyWeightConcreto(estadoCompartido);
            flyweights.put(estadoCompartido, flyweight);
            return flyweight;
        }
    }
    
}
