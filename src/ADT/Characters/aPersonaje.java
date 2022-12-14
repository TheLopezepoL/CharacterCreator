package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.FlyweightFactory;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Mapa.Mapa;
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
    protected int posX;
    protected int posY;

    public aPersonaje(String nombre, double vida, int nivel, int campos, int nivelAparicion, int costo, ImagenHashTable imagenes) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.imagenes = FlyweightFactory.getFlyweight(imagenes);
        this.armas = new ArrayList<>();
        this.posX = 0;
        this.posY = 0;
    }

    public aPersonaje() {
    }

    public abstract aPersonaje clone();
    public abstract int atacar(Direction direction);   // Ver como hacer que el arma ataque segun la posicion del personaje
    public abstract void seleccionarArma(aArma arma);
    public abstract boolean canMove(ArrayList<Integer> newPositionp, int obstaculo); // Puede recibir el obstaculo y no el mapa (trabajo del controlador)
    public ArrayList<Integer> mover(Direction direction) {
        // Mover 1 casilla en la direccion dada, devuelve true si se pudo mover (Puede volar, no pega con muros segun la altura del vuelo)
        // Para saber si puede atravesar terreno deberiamos de pasarle el campo de juego... no se si sea buen diseño
        // Ahora devuelve las coordenadas en las que se deberia ubicar
        // Podemos hacer 2 funciones, esta que devuelve la coordenadas y otra que de True si puede estar en esa coordenada (ya se que son coordenadas imposibles o que haya obstaculos)
        ArrayList<Integer> result = new ArrayList<>();
        switch (direction){
            case UP -> this.posX--;
            case UP_RIGHT -> {
                this.posX--;
                this.posY++;
            }
            case RIGHT -> this.posY++;
            case DOWN_RIGHT -> {
                this.posX++;
                this.posY++;
            }
            case DOWN -> this.posX++;
            case DOWN_LEFT -> {
                this.posX++;
                this.posY--;
            }
            case LEFT -> this.posY--;
            case UP_LEFT -> {
                this.posX--;
                this.posY--;
            }
            case DEFAULT -> {}
        }
        result.add(this.posX);
        result.add(this.posY);
        return result;
    }

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

    public void subirNivel(){
        this.nivel++;
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

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
