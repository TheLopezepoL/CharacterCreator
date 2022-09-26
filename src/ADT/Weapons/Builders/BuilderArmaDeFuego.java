package ADT.Weapons.Builders;

import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.ArmaDeFuego;

public class BuilderArmaDeFuego implements iBuilderArma{
    private ArmaDeFuego armaDeFuego;

    public BuilderArmaDeFuego(){
        reset();
    }

    public ArmaDeFuego getResult(){
        return armaDeFuego;
    }

    @Override
    public void reset() {
        this.armaDeFuego = new ArmaDeFuego();
    }

    @Override
    public void agregarNombre(String nombre) {

    }

    @Override
    public void agregarAlcance(double alcance) {

    }

    @Override
    public void agregarDanho(double danho) {

    }

    @Override
    public void agregarRadioExplosion(double radioExplosion) {

    }

    @Override
    public void agregarVelocidadDeAtaque(double velocidadDeAtaque) {

    }

    @Override
    public void agregarNivel(int nivel) {

    }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) {
        // Flyweight
    }
}
