package ADT.Weapons;

import ADT.ImageFlyweight.ImagenHashTable;

public class ArmaBlanca extends aArma{

    public ArmaBlanca(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque, int nivel, ImagenHashTable imagenes) {
        super(nombre, alcance, danho, radioExplosion, velocidadDeAtaque, nivel, imagenes);
    }

    public ArmaBlanca(ArmaBlanca armaBlanca){
        super(armaBlanca.nombre, armaBlanca.alcance, armaBlanca.danho, armaBlanca.radioExplosion, armaBlanca.velocidadDeAtaque, armaBlanca.nivel, armaBlanca.imagenes);
    }
    public ArmaBlanca() {
    }

    @Override
    public aArma clone() {
        return new ArmaBlanca(this);
    }

    @Override
    public double utilizar() {
        return danho;
    }
}
