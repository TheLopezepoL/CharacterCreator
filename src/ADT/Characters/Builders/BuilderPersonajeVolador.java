package ADT.Characters.Builders;

import ADT.Characters.PersonajeVolador;
import ADT.ImageFlyweight.ImagenHashTable;

public class BuilderPersonajeVolador implements iBuilderPersonaje{
    private PersonajeVolador personajeVolador;

    public BuilderPersonajeVolador() {
        reset();
    }

    public PersonajeVolador getResult(){
        return personajeVolador;
    }

    @Override
    public void reset() {

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
        //Flyweight
    }
}
