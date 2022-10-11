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
        this.magia.setNombre(nombre);
    }

    @Override
    public void agregarAlcance(double alcance) {
        this.magia.setAlcance(alcance);
    }

    @Override
    public void agregarDanho(double danho) {
        this.magia.setDanho(danho);
    }

    @Override
    public void agregarRadioExplosion(double radioExplosion) {
        this.magia.setRadioExplosion(radioExplosion);
    }

    @Override
    public void agregarVelocidadDeAtaque(double velocidadDeAtaque) {
        this.magia.setVelocidadDeAtaque(velocidadDeAtaque);
    }

    @Override
    public void agregarNivel(int nivel) {
        this.magia.setNivel(nivel);
    }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) {
        this.magia.setImagenes(imagenes);
    }
}
