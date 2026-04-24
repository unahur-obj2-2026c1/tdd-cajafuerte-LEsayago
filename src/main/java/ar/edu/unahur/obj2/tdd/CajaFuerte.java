package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Integer codigo;
    private boolean abierta;

    public CajaFuerte() {
        this.abierta = true;
        this.codigo = null;
    }


    public void cerrar(Integer nuevoCodigo) {
        this.codigo = nuevoCodigo;
        this.abierta = false;
    }

    public void abrir(Integer codigoIngresado) {
        if (codigoEsCorrecto(codigoIngresado)) {
            this.abierta = true;
        }
    }

    public boolean estaAbierta() {
        return this.abierta;
    }

    private boolean codigoEsCorrecto(Integer codigoIngresado) {
        return this.codigo.equals(codigoIngresado);
    }
}
