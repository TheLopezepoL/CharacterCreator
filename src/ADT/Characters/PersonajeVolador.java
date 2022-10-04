package ADT.Characters;

import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Mapa.Mapa;
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
        if (newPosition.size() == 2) {
            double obstaculo = mapa.verObstaculo(newPosition.get(0), newPosition.get(1));
            return !(obstaculo > this.altura) && obstaculo != -1;
        }
        return false;
    }

}
