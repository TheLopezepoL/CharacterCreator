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
    protected boolean activo;
    protected ImagenHashTable imagenes;

    public aArma(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque,int nivel, ImagenHashTable imagenes) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.danho = danho;
        this.radioExplosion = radioExplosion;
        this.nivel = nivel;
        this.velocidadDeAtaque = velocidadDeAtaque;
        this.activo = true;
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
    }

    public aArma() {
    }

    public abstract aArma clone();
    public abstract int utilizar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public void setDanho(double danho) {
        this.danho = danho;
    }

    public double getRadioExplosion() {
        return radioExplosion;
    }

    public void setRadioExplosion(double radioExplosion) {
        this.radioExplosion = radioExplosion;
    }

    public double getVelocidadDeAtaque() {
        return velocidadDeAtaque;
    }

    public void setVelocidadDeAtaque(double velocidadDeAtaque) {
        this.velocidadDeAtaque = velocidadDeAtaque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public ImagenHashTable getImagenes() {
        return imagenes;
    }

    public void setImagenes(ImagenHashTable imagenes) {
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
    }
}
