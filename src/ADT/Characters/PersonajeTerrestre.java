package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

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
        // Ataca con todas las armas activas, si no tienes armas debe de darsele un arma default
        return 0;
    }

    @Override
    public void seleccionarArma(aArma arma) {
        // Pone Activa un arma (Pensar cuando desactivar armas)
    }

    @Override
    public boolean mover(Direction direction) {
        // Mover 1 casilla en la direccion dada, devuelve true si se pudo mover
        return false;
    }
}
