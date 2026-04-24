package ar.edu.unahur.obj2.tdd;

public class Usuario {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void abrirCaja(CajaFuerte caja, Integer codigo) {
        caja.abrir(codigo);
    }

    public void cerrarCaja(CajaFuerte caja, Integer nuevoCodigo) {
        caja.cerrar(nuevoCodigo);
    }

    public String getNombre() {
        return nombre;
    }
}
