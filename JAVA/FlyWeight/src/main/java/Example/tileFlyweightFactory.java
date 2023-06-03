package Example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HOME
 */
public class tileFlyweightFactory {
    
    private static Map<String, tileFlyweight> azulejos = new HashMap<>();

    public static tileFlyweight obtainTile(String textura, String tipoTerreno) {
        String key = textura + "_" + tipoTerreno;

        if (!azulejos.containsKey(key)) {
            azulejos.put(key, new tileFlyweight(textura, tipoTerreno));
        }

        return azulejos.get(key);
    }
    
}

/*Esta clase mantendrá una referencia a todos los objetos TileFlyweight creados
y reutilizará los objetos existentes cuando sea necesario.*/

