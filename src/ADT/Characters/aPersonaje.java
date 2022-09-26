package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.FlyweightFactory;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

public abstract class aPersonaje {
    protected String nombre;
    protected double vida;
    protected int nivel;
    protected int campos;
    protected int nivelAparicion;
    protected int costo;
    protected ImagenHashTable imagenes;

    public aPersonaje(String nombre, double vida, int nivel, int campos, int nivelAparicion, int costo, ImagenHashTable imagenes) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
    }

    public aPersonaje() {
    }

    public abstract aPersonaje clone();
    public abstract int atacar();
    public abstract void seleccionarArma(aArma arma);
    public abstract boolean mover(Direction direction);


}
