package ADT.Weapons;

import ADT.ImageFlyweight.FlyweightFactory;
import ADT.ImageFlyweight.ImagenHashTable;

public abstract class aArma {
    protected String nombre;
    protected double alcance;
    protected double danho;
    protected double radioExplosion;
    protected double velocidadDeAtaque;
    protected int nivel;
    protected boolean estaActivo;
    protected ImagenHashTable imagenes;

    public aArma(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque,int nivel, ImagenHashTable imagenes) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.danho = danho;
        this.radioExplosion = radioExplosion;
        this.nivel = nivel;
        this.velocidadDeAtaque = velocidadDeAtaque;
        this.estaActivo = true;
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
    }

    public aArma() {
    }

    public abstract aArma clone();
    public abstract int utilizar();
}
