package ADT.Weapons.Builders;

import ADT.ImageFlyweight.ImagenHashTable;
import ADT.Weapons.ArmaBlanca;

public class BuilderArmaBlanca implements iBuilderArma{
    private ArmaBlanca armaBlanca;

    public BuilderArmaBlanca(){
        reset();
    }

    public ArmaBlanca getResult(){
        return this.armaBlanca;
    }

    @Override
    public void reset() {
        this.armaBlanca = new ArmaBlanca();
    }

    @Override
    public void agregarNombre(String nombre) { this.armaBlanca.setNombre(nombre); }

    @Override
    public void agregarAlcance(double alcance) { this.armaBlanca.setAlcance(alcance); }

    @Override
    public void agregarDanho(double danho) { this.armaBlanca.setDanho(danho); }

    @Override
    public void agregarRadioExplosion(double radioExplosion) { this.armaBlanca.setRadioExplosion(radioExplosion); }

    @Override
    public void agregarVelocidadDeAtaque(double velocidadDeAtaque) { this.armaBlanca.setVelocidadDeAtaque(velocidadDeAtaque); }

    @Override
    public void agregarNivel(int nivel) { this.armaBlanca.setNivel(nivel); }

    @Override
    public void agregarImagenes(ImagenHashTable imagenes) { this.armaBlanca.setImagenes(imagenes); }
}
