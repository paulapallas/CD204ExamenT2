package paulapallas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    int[] miArray = new int[] { 4, 1, 5, 2 };
    ArrayUtils array; // guarda el array miarray1 en operacionesArray

    @Before
    public void setUp() throws Exception {
        array = new ArrayUtils(miArray);
    }

    @Test

    public void TestencontrarMaximo() {

        assertEquals(ArrayUtils.encontrarMaximo(miArray), 5);
  

    }


    @Test

    public void TestencontrarMinimo() {

        assertEquals(ArrayUtils.encontrarMinimo(miArray), 1);
  

    }


    @Test

    public void TestCalcularPromedio() {

        assertEquals(ArrayUtils.calcularPromedio(miArray), 3);
  

    }

    


    
    







}
