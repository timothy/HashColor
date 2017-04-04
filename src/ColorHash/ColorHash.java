/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorHash;

import java.awt.Color;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * A reusable class for choosing one of the 13 predefined colors in class Color.
 * @author tim
 */
public class ColorHash {

    public static HashMap<String, Color> ColorHash = new HashMap();

    public ColorHash() {
        ColorHash.put("black", Color.black);
        ColorHash.put("blue", Color.blue);
        ColorHash.put("cyan", Color.cyan);
        ColorHash.put("darkGray", Color.darkGray);
        ColorHash.put("gray", Color.gray);
        ColorHash.put("green", Color.green);
        ColorHash.put("yellow", Color.yellow);
        ColorHash.put("lightGray", Color.lightGray);
        ColorHash.put("magenta", Color.magenta);
        ColorHash.put("orange", Color.orange);
        ColorHash.put("pink", Color.pink);
        ColorHash.put("red", Color.red);
        ColorHash.put("white", Color.white);
    }

    /**
     * Used for retrieving all keys.
     * @return a set of all keys
     */
    public static Set getKeySet() {
        return ColorHash.keySet();
    }

    /**
     * Used to retrieve all Color objects
     * @return a collection of all color objects
     */
    public static Collection<Color> getColorCollection() {
        return ColorHash.values();
    }

    /**
     * Get a specified color.
     * @param key the string value of the desired return color
     * @return the color that was specified in the string value
     */
    public static Color getColor(String key) {
        return ColorHash.get(key);
    }

    /**
     * Total amount of color that the class contains
     * @return 
     */
    public static int size() {
        return ColorHash.size();
    }

}
