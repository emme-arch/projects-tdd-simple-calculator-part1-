import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculationTest {

    @Test
    void add(){
        assertEquals(15,SimpleCalculation.add(1,2,3,4,5));
        assertEquals(3,SimpleCalculation.add(1,2));
        assertEquals(-2,SimpleCalculation.add(-1,-1));
    }
    @Test
    void multiply(){
        assertEquals(3,SimpleCalculation.multiply(1,3));
        assertEquals(-3,SimpleCalculation.multiply(-1,3));
        assertEquals(120,SimpleCalculation.multiply(1,2,3,4,5));
        assertEquals(3,SimpleCalculation.multiply(1,3));
        assertEquals(-3,SimpleCalculation.multiply(-1,3));
    }
}