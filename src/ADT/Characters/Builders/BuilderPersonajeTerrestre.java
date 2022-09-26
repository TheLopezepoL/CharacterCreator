package ADT.Characters.Builders;

import ADT.Characters.PersonajeTerrestre;
import ADT.ImageFlyweight.ImagenHashTable;

public class BuilderPersonajeTerrestre implements iBuilderPersonaje{
    private PersonajeTerrestre personajeTerrestre;

    public BuilderPersonajeTerrestre() {
        reset();
    }

    public PersonajeTerrestre getResult() {
        return personajeTerrestre;
    }


    @Override
    public void reset() {
        this.personajeTerrestre = new PersonajeTerrestre();
    }

    @Override
    public void agregarNombre(String nombre) {

    }

    @Override
    public void agregarVida(double vida) {

    }

    @Override
    public void agregarNivel(int nivel) {

    }

    @Override
    public void agregarCampos(int campos) {

    }

    @Override
    public void agregarNivelAparicion(int nivelAparicion) {

    }

    @Override
    public void agregarCosto(int costo) {

    }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) {
        // Flyweight
    }
}
