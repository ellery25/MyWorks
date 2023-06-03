package FlyWeightComposition;

/**
 *
 * @author HOME
 */
public class Cliente {
    
     public static void main(String[] args) {
        FlyWeightFactory fabrica = new FlyWeightFactory();

        // Obtiene un Flyweight compartido
        FlyWeight flyweight1 = fabrica.getFlyweight("Estado A");
        flyweight1.operacionCompartida();

        // Obtiene otro Flyweight compartido
        FlyWeight flyweight2 = fabrica.getFlyweight("Estado B");
        flyweight2.operacionCompartida();

        // Obtiene un nuevo Flyweight (no compartido)
        FlyWeight flyweight3 = new FlyWeightConcreto("Estado C");
        flyweight3.operacionCompartida();
    }
    
}
