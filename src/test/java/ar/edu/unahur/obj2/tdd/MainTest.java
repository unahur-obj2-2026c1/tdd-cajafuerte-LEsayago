package ar.edu.unahur.obj2.tdd;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMain() {

    }
}

/*
como huesped del hotel,
quiero  utilizar una caja fuerte personal, 
para guardar mis objetos de valor
para que este seguro durante mi estadia.
Criterios de aceptación:


    1. La caja fuerte abierta al inicio
    - dado que la caja fuerte ha sido creada
    Entonces la caja fuerte esta abierta

    2. Cierre de caja fuerte con codigo
    - dado que la caja fuerte esta abierta
    Cuando cierro la caja fuerte con un codigo
    Entonces la caja fuerte esta cerrada

    3. Apertura de caja fuerte con codigo correcto
    - dado que la caja fuerte esta cerrada con un codigo
    Cuando intento abrir la caja fuerte con el codigo correcto
    Entonces la caja fuerte esta abierta

    4. Apertura de caja fuerte con codigo incorrecto
    - dado que la caja fuerte esta cerrada con un codigo
    Cuando intento abrir la caja fuerte con un codigo incorrecto
    Entonces la caja fuerte sigue cerrada
 */