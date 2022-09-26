package ADT.Characters.Builders;

import ADT.ImageFlyweight.ImagenHashTable;

public interface iBuilderPersonaje {
    void reset();
    void agregarNombre(String nombre);
    void agregarVida(double vida);
    void agregarNivel(int nivel);
    void agregarCampos(int campos);
    void agregarNivelAparicion(int nivelAparicion);
    void agregarCosto(int costo);
    void agregarImagenes(ImagenHashTable imagenes);
}
