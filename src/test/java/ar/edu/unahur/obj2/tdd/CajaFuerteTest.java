package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest { 

    /*  1. La caja fuerte abierta al inicio
    - dado que la caja fuerte ha sido creada
    Entonces la caja fuerte esta abierta */
    @Test
    public void queLaCajaFuierteEsteAbiertaAlCrearse() {
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierta());
    }

    /* 2. Cierre de caja fuerte con codigo
    - dado que la caja fuerte esta abierta
    Cuando cierro la caja fuerte con un codigo
    Entonces la caja fuerte esta cerrada */
    @Test
    void queLaCajaFuerteEsteAbiertaYLaPedaCerrarConUnCodigo() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertTrue(caja.estaCerrada());

    }
    /* 3. Apertura de caja fuerte con codigo correcto
    - dado que la caja fuerte esta cerrada con un codigo
    Cuando intento abrir la caja fuerte con el codigo correcto
    Entonces la caja fuerte esta abierta*/
    @Test
    void queLaCajaFuerteEsteCerradaYSePuedaAbrirConElCodigoCorrecto() {
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    @Test
    void testEstaCerrada() {

    }
}
