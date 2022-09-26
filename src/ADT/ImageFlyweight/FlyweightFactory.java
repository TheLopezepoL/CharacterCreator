package ADT.ImageFlyweight;

import java.util.ArrayList;

public class FlyweightFactory {
    private static ArrayList<ImagenHashTable> cache;

    public FlyweightFactory(){
        cache = new ArrayList<>();
    }

    public static ImagenHashTable getFlyweight(ImagenHashTable imagenHashTable){
        if (!cache.contains(imagenHashTable))
            cache.add(imagenHashTable);
        return cache.get(cache.indexOf(imagenHashTable));
    }
}
