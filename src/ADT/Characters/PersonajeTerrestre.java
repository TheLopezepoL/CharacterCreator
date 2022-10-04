package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

import java.util.ArrayList;

public class PersonajeTerrestre extends aPersonaje{
    public PersonajeTerrestre(String nombre, double vida, int nivel, int campos, int nivelAparicion, int costo, ImagenHashTable imagenes) {
        super(nombre, vida, nivel, campos, nivelAparicion, costo, imagenes);
    }

    public PersonajeTerrestre(PersonajeTerrestre personajeTerrestre){
        super(personajeTerrestre.nombre, personajeTerrestre.vida, personajeTerrestre.nivel, personajeTerrestre.campos, personajeTerrestre.nivelAparicion, personajeTerrestre.costo, personajeTerrestre.imagenes);
    }

    public PersonajeTerrestre() {
    }

    @Override
    public aPersonaje clone() {
        return new PersonajeTerrestre(this);
    }

    @Override
    public int atacar() {
        int danhoTotal = 0;
        for (aArma arma : this.armas)
            danhoTotal += arma.utilizar();
        return danhoTotal;
    }

    @Override
    public void seleccionarArma(aArma arma) {
        // Pone Activa un arma (Pensar cuando desactivar armas)
        for (aArma armaActual : this.armas){
            armaActual.setActivo(armaActual == arma);
        }
    }

    @Override
    public ArrayList<Integer> mover(Direction direction, int x, int y) {
        // Mover 1 casilla en la direccion dada, devuelve true si se pudo mover
        // Para saber si puede atravesar terreno deberiamos de pasarle el campo de juego... no se si sea buen diseño
        // Ahora devuelve las coordenadas en las que se deberia ubicar
        // Podemos hacer 2 funciones, esta que devuelve la coordenadas y otra que de True si puede estar en esa coordenada (ya se que son coordenadas imposibles o que haya obstaculos)
        ArrayList<Integer> result = new ArrayList<>();
        switch (direction){
            case UP -> x--;
            case UP_RIGHT -> {
                x--;
                y++;
            }
            case RIGHT -> y++;
            case DOWN_RIGHT -> {
                x++;
                y++;
            }
            case DOWN -> x++;
            case DOWN_LEFT -> {
                x++;
                y--;
            }
            case LEFT -> y--;
            case UP_LEFT -> {
                x--;
                y--;
            }
            case DEFAULT -> {}
        }
        result.add(x);
        result.add(y);
        return result;
    }
}
