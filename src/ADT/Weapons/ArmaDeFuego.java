package ADT.Weapons;

import ADT.ImageFlyweight.ImagenHashTable;

public class ArmaDeFuego extends aArma{

    private int cargador; // Balas dentro del arma
    private  int municion; // Balas totoales


    public ArmaDeFuego(String nombre, double alcance, double danho, double radioExplosion, double velocidadDeAtaque, int nivel, ImagenHashTable imagenes, int cargador, int municion) {
        super(nombre, alcance, danho, radioExplosion, velocidadDeAtaque, nivel, imagenes);
        this.cargador = cargador;
        this.municion = municion;
    }

    public ArmaDeFuego(ArmaDeFuego armaDeFuego){
        super(armaDeFuego.nombre, armaDeFuego.alcance, armaDeFuego.danho, armaDeFuego.radioExplosion, armaDeFuego.velocidadDeAtaque , armaDeFuego.nivel, armaDeFuego.imagenes);
        this.cargador = armaDeFuego.cargador;
        this.municion = armaDeFuego.municion;
    }

    public ArmaDeFuego() {
    }

    public void recargar(){
        // Agarra la municion y se la pasa al cargador
    }

    @Override
    public aArma clone() {
        return new ArmaDeFuego(this);
    }

    @Override
    public int utilizar() {
        // if municion disparar y retorna el danho del arma
        return 0;
    }
}
