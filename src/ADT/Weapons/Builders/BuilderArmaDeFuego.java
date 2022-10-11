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
    public void agregarNombre(String nombre) { this.armaDeFuego.setNombre(nombre); }

    @Override
    public void agregarAlcance(double alcance) { this.armaDeFuego.setAlcance(alcance); }

    @Override
    public void agregarDanho(double danho) { this.armaDeFuego.setDanho(danho); }

    @Override
    public void agregarRadioExplosion(double radioExplosion) { this.armaDeFuego.setRadioExplosion(radioExplosion); }

    @Override
    public void agregarVelocidadDeAtaque(double velocidadDeAtaque) { this.armaDeFuego.setVelocidadDeAtaque(velocidadDeAtaque); }

    @Override
    public void agregarNivel(int nivel) { this.armaDeFuego.setNivel(nivel); }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) { this.armaDeFuego.setImagenes(imagenes); }
}
