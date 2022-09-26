package ADT.Weapons;

import ADT.ImageFlyweight.ImagenHashTable;

public class ArmaBlanca extends aArma{

    public ArmaBlanca(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque, int nivel, ImagenHashTable imagenes) {
        super(nombre, alcance, danho, radioExplosion, velocidadDeAtaque, nivel, imagenes);
    }

    public ArmaBlanca() {
    }

    @Override
    public aArma clone() {
        return null;
    }

    @Override
    public int utilizar() {
        //Solo hacer danho
        return 0;
    }
}
