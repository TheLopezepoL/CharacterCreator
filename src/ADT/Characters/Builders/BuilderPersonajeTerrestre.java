package ADT.Characters.Builders;

import ADT.Characters.PersonajeTerrestre;
import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.aArma;

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
        this.personajeTerrestre.setNombre(nombre);
    }

    @Override
    public void agregarVida(double vida) {
        this.personajeTerrestre.setVida(vida);
    }

    @Override
    public void agregarNivel(int nivel) {
        this.personajeTerrestre.setNivel(nivel);
    }

    @Override
    public void agregarCampos(int campos) {
        this.personajeTerrestre.setCampos(campos);
    }

    @Override
    public void agregarNivelAparicion(int nivelAparicion) {
        this.personajeTerrestre.setNivelAparicion(nivelAparicion);
    }

    @Override
    public void agregarCosto(int costo) {
        this.personajeTerrestre.setCosto(costo);
    }

    @Override
    public void agregarArma(aArma arma) {
        this.personajeTerrestre.setNewArma(arma);
    }

    @Override
    public void resetArmas() {
        this.personajeTerrestre.resetArmas();
    }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) {
        this.personajeTerrestre.setImagenes(imagenes);
    }
}
