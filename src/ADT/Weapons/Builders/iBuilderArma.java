package ADT.Weapons.Builders;

import ADT.ImageFlyweight.ImagenHashTable;

public interface iBuilderArma {
    void reset();

    void agregarNombre(String nombre);
    void agregarAlcance(double alcance);
    void agregarDanho(double danho);
    void agregarRadioExplosion(double radioExplosion);
    void agregarVelocidadDeAtaque(double velocidadDeAtaque);
    void agregarNivel(int nivel);
    void agregarImagenes(ImagenHashTable imagenes);
}
