package ADT.Weapons;

import ADT.ImageFlyweight.ImagenHashTable;

public class Magia extends aArma{
    private int costoMana;
    private int mana;

    public Magia(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque, int nivel, ImagenHashTable imagenes, int costoMana, int mana) {
        super(nombre, alcance, danho, radioExplosion, velocidadDeAtaque, nivel, imagenes);
        this.costoMana = costoMana;
        this.mana = mana;
    }

    public Magia(Magia magia){
        super(magia.nombre, magia.alcance, magia.danho, magia.radioExplosion, magia.velocidadDeAtaque, magia.nivel, magia.imagenes);
        this.costoMana = magia.costoMana;
        this.mana = magia.mana;
    }

    public Magia() {
    }

    @Override
    public aArma clone() {
        return new Magia(this);
    }

    @Override
    public int utilizar() {
        // if mana >= costoMana lanzarHechizo()
        return 0;
    }
}
