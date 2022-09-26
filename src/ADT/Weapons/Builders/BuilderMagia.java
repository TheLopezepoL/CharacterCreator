package ADT.Weapons.Builders;

import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.Magia;

public class BuilderMagia implements iBuilderArma{
    private Magia magia;

    public BuilderMagia(){
        reset();
    }

    public Magia getResult(){
        return magia;
    }

    @Override
    public void reset() {
        this.magia = new Magia();
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
