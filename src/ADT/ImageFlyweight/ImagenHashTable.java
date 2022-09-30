package ADT.ImageFlyweight;

import ADT.State;

import java.awt.*;
import java.util.*;

public class ImagenHashTable {
    protected static int FINAL_ID = 0;
    private int id;
    private Hashtable<Integer, Hashtable<State, Image>> imagenes;  // Lvl - Estado - Imagen

    public ImagenHashTable(){
        this.id = ++FINAL_ID;
        this.imagenes = new Hashtable<>();
    }

    public void agregarNivel(int lvl) {
        imagenes.putIfAbsent(lvl, new Hashtable<>());
    }

    public void agregarEstado(State state) {
        Enumeration<Integer> keys = imagenes.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            imagenes.get(key).putIfAbsent(state, null);
        }
    }

    public void agregarImagen(int lvl, State state, Image image) {
        imagenes.get(lvl).put(state, image);
    }
}
