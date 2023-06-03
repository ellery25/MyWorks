package Example;

/**
 *
 * @author HOME
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         tile azulejo1 = new tile(tileFlyweightFactory.obtainTile("textura1.png", "pasto"), 0, 0);
         tile azulejo2 = new tile(tileFlyweightFactory.obtainTile("textura2.png", "tierra"), 1, 0);
         
         
        // ...
    }
    
}
