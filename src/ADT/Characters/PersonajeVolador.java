package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

import java.util.ArrayList;

public class PersonajeVolador extends aPersonaje{
    private double altura;

    public PersonajeVolador(String nombre, double vida, int nivel, int campos, int nivelAparicion, int costo, ImagenHashTable imagenes, double altura) {
        super(nombre, vida, nivel, campos, nivelAparicion, costo, imagenes);
        this.altura = altura;
    }

    public PersonajeVolador(PersonajeVolador personajeVolador){
        super(personajeVolador.nombre, personajeVolador.vida, personajeVolador.nivel, personajeVolador.campos, personajeVolador.nivelAparicion, personajeVolador.costo, personajeVolador.imagenes);
        this.altura = personajeVolador.altura;
    }

    public PersonajeVolador() {
    }

    @Override
    public aPersonaje clone() {
        return new PersonajeVolador(this);
    }

    @Override
    public int atacar() {
        // Ataca con todas las armas activas, si no tienes armas debe de darsele un arma default
        return 0;
    }

    @Override
    public void seleccionarArma(aArma arma) {
        // Pone Activa un arma (Pensar cuando desactivar armas)
    }

    @Override
    public ArrayList<Integer> mover(Direction direction, int x, int y) {
        // Mover 1 casilla en la direccion dada, devuelve true si se pudo mover (Puede volar, no pega con muros segun la altura del vuelo)
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
