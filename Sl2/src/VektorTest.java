import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test für die Klasse Vektor.
 */
public class VektorTest extends Vektor {
    @Test
    void isDifferentObjectTest() {
        Vektor vector1 = new Vektor(1, 2, 3);
        assertNotSame(vector1, vector1.addVectorTo(vector1));
    }
    @Test
    void vectorAdditionTest() {
        Vektor vector1 = new Vektor(4, 0, 8);
        Vektor vector2 = new Vektor(-1, 4, 7);
        assertArrayEquals(new Vektor(3, 4, 15).makeArray(),
                vector1.addVectorTo(vector2).makeArray());
        assertArrayEquals(new Vektor(3, 4, 15).makeArray(),
                vector2.addVectorTo(vector1).makeArray());

    }
    @Test
    void vectorSubtractionTest() {
        Vektor vector1 = new Vektor(4, 0, 8);
        Vektor vector2 = new Vektor(-1, 4, 7);
        assertArrayEquals(new Vektor(5, -4, 1).makeArray(),
                vector1.subtractVectorFrom(vector2).makeArray());
    }
    @Test
    void multiplicationOfVectorWithScalarTest() {
        Vektor vector1 = new Vektor(1, -5, 3);
        Vektor vector2 = new Vektor(1, -5, 3);
        double scalar1 = 6;
        double scalar2 = -3;
        assertArrayEquals(new Vektor(6, -30, 18).makeArray(),
                vector1.multiplyWithScalar(scalar1).makeArray());
        assertArrayEquals(new Vektor(-3, 15, -9).makeArray(),
                vector2.multiplyWithScalar(scalar2).makeArray());
    }
    @Test
    void makeScalarProductTest() {
        Vektor vector1 = new Vektor(1, 2, 3);
        Vektor vector2 = new Vektor(-7, 8, 9);
        Vektor vector3 = new Vektor(-5, 9, 7);
        Vektor vector4 = new Vektor(10, 3, 8);
        assertEquals(36, vector1.makeScalarProduct(vector2));
        assertEquals(33, vector3.makeScalarProduct(vector4));
    }
    @Test
    void makeCrossProductTest() {
        Vektor vector1 = new Vektor(1, 2, 3);
        Vektor vector2 = new Vektor(-7, 8, 9);
        Vektor vector3 = new Vektor(1, 2, 8);
        Vektor vector4 = new Vektor(4, 3, 5);
        assertArrayEquals(new Vektor(-6, -30, 22).makeArray(),
                vector1.makeCrossProduct(vector2).makeArray());
        assertArrayEquals(new Vektor(-14, 27, -5).makeArray(),
                vector3.makeCrossProduct(vector4).makeArray());
    }
    @Test
    void absoluteValueTest() {
        Vektor vector1 = new Vektor(1, 1, 1);
        Vektor vector2 = new Vektor(5, 4, 3);
        assertEquals(Math.sqrt(3), vector1.getAbsoluteValue());
        assertEquals(Math.sqrt(50), vector2.getAbsoluteValue());
    }
    @Test
    void isColinearToTest() {
        Vektor vector1 = new Vektor(4, 5, 7);
        assertTrue(vector1.isCoLinearTo(new Vektor(16, 20, 28)));
        assertFalse(vector1.isCoLinearTo(new Vektor(16, 20, 21)));
    }
    @Test
    void calcImplicitAngleTest() {
        assertEquals("58,3", new Vektor(3, -1, 2)
                .getImplicitAngle(new Vektor(1, 2, 4)));
    }
    @Test
    void complexCalculationsTest() {
        assertEquals(-31, (new Vektor(-1, 5, -2)
                .makeCrossProduct(new Vektor(2, 1, 2)))
                .makeScalarProduct(new Vektor(2, 0, 5)));
    }
}