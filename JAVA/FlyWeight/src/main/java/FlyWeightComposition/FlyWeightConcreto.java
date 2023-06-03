package FlyWeightComposition;

/**
 *
 * @author HOME
 */
public class FlyWeightConcreto implements FlyWeight{
    
    private String estadoCompartido;

    public FlyWeightConcreto(String estadoCompartido) {
        this.estadoCompartido = estadoCompartido;
    }

    public void operacionCompartida() {
        System.out.println("Operación compartida llamada. Estado compartido: " + estadoCompartido);
    }
    
    
    
    
}
