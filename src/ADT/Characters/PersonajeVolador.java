package ADT.Characters;

import ADT.Direction;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

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
    public boolean mover(Direction direction) {
        // Mover 1 casilla en la direccion dada, devuelve true si se pudo mover (Puede volar, no pega con muros segun la altura del vuelo)
        return false;
    }


}
