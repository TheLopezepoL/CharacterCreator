package ADT.Characters;

import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Mapa.Mapa;
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
    public boolean canMove(ArrayList<Integer> newPosition, Mapa mapa) {
        if (newPosition.size() == 2)
            return mapa.verObstaculo(newPosition.get(0), newPosition.get(1)) == 0;
        return false;
    }

}
