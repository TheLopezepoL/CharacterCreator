package ADT.Characters.Builders;

import ADT.Characters.PersonajeVolador;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

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
        this.personajeVolador = new PersonajeVolador();
    }

    @Override
    public void agregarNombre(String nombre) {
        this.personajeVolador.setNombre(nombre);
    }

    @Override
    public void agregarVida(double vida) {
        this.personajeVolador.setVida(vida);
    }

    @Override
    public void agregarNivel(int nivel) {
        this.personajeVolador.setNivel(nivel);
    }

    @Override
    public void agregarCampos(int campos) {
        this.personajeVolador.setCampos(campos);
    }

    @Override
    public void agregarNivelAparicion(int nivelAparicion) {
        this.personajeVolador.setNivelAparicion(nivelAparicion);
    }

    @Override
    public void agregarCosto(int costo) {
        this.personajeVolador.setCosto(costo);
    }

    @Override
    public void agregarArma(aArma arma) {
        this.personajeVolador.setNewArma(arma);
    }

    @Override
    public void resetArmas() {
        this.personajeVolador.resetArmas();
    }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) {
        this.personajeVolador.setImagenes(imagenes);
    }
}
