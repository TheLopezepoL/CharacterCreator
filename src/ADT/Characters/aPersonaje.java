package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.FlyweightFactory;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

import java.util.ArrayList;

public abstract class aPersonaje {
    protected String nombre;
    protected double vida;
    protected int nivel;
    protected int campos;
    protected int nivelAparicion;
    protected int costo;
    protected ArrayList<aArma> armas;
    protected ImagenHashTable imagenes;

    public aPersonaje(String nombre, double vida, int nivel, int campos, int nivelAparicion, int costo, ImagenHashTable imagenes) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
        this.armas = new ArrayList<>();
    }

    public aPersonaje() {
    }

    public abstract aPersonaje clone();
    public abstract int atacar();
    public abstract void seleccionarArma(aArma arma);
    public abstract ArrayList<Integer> mover(Direction direction, int actualX, int actualY);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getNivelAparicion() {
        return nivelAparicion;
    }

    public void setNivelAparicion(int nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public ArrayList<aArma> getArmas() {
        return armas;
    }

    public void setNewArma(aArma arma) {
        this.armas.add(arma);
    }

    public void resetArmas(){
        this.armas = new ArrayList<>();
    }

    public ImagenHashTable getImagenes() {
        return imagenes;
    }

    public void setImagenes(ImagenHashTable imagenes) {
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
    }
}
