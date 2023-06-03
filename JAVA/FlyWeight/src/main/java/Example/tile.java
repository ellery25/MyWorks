package Example;

/**
 *
 * @author HOME
 */
/*
Supongamos que estamos desarrollando un sistema de renderizado de mapas en un videojuego o una aplicación de navegación.
El mapa está compuesto por una gran cantidad de azulejos (tiles) y cada azulejo tiene diferentes atributos, como textura, posición,
tipo de terreno, pero muchos azulejos comparten características comunes.
*/

public class tile {
    
    tileFlyweight shareds;
    int x;
    int y;

    public tile(tileFlyweight shareds, int x, int y) {
        this.shareds = shareds;
        this.x = x;
        this.y = y;
    }
    
    
    
}
