package paulapallas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    


    @Test
    public void comprobarGetters(){
        CuentaBancaria cuenta1 = new CuentaBancaria("Pepe", 1000);

        assertTrue(cuenta1.getTitular().equals("Pepe"));
        assertEquals(cuenta1.getSaldo(), 1000);
        
    }


    @Test
    void testExcepcionCantidadCero() {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pepe", 1000);

        assertThrows(IllegalArgumentException.class, () -> cuenta1.depositar(0));
       
    }


    @Test
    void testExcepcionRetirarCantidad() {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pepe", 100);

        assertThrows(IllegalArgumentException.class, () -> cuenta1.retirar(130));
        assertThrows(IllegalArgumentException.class, () -> cuenta1.retirar(-130));
    }




       
                                         
      
}
