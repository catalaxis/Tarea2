package Type.ActualType.Number.ActualNumber;

import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeFloatTest {

    @Test
    void testEquals() {
        TypeFloat Float1 = new TypeFloat(1);
        TypeFloat Float2 = new TypeFloat(1);
        TypeFloat Float3 = new TypeFloat(0);
        TypeBinary Binary = new TypeBinary("1");
        assertEquals(Float1,Float2);
        assertEquals(false, Float1.equals(Float3));
        assertEquals(false, Float1.equals(Binary));
    }

    @Test
    void testToString() {
        TypeFloat Float1 = new TypeFloat(1);
        assertEquals("1.0",Float1.toString());
    }

    @Test
    void toFloat() {
        TypeFloat Float1 = new TypeFloat(1);
        assertEquals(1,Float1.toFloat());
    }
    @Test
    void toTypeFloat(){
        TypeFloat Float1 = new TypeFloat(1);
        TypeFloat Float2 = Float1.toTypeFloat();
        assertEquals(Float2,Float1);
    }
    @Test
    void toTypeString(){
        TypeFloat Float1 = new TypeFloat(1);
        TypeString String1 = Float1.toTypeString();
        assertEquals(new TypeString("1.0"),String1);
    }

    @Test
    void plus() {
        TypeFloat Float1 = new TypeFloat(2);
        TypeFloat Float2 = new TypeFloat(4);
        TypeFloat Float3 = Float1.plus(Float2);
        assertEquals(new TypeFloat(6),Float3);

        TypeFloat Int1 = Float1.plus(new TypeInt(4));
        assertEquals(new TypeFloat(6),Int1);

        TypeFloat Binary1 = Float1.plus(new TypeBinary("100"));
        assertEquals(new TypeFloat(6),Binary1);

    }

    @Test
    void subs() {
        TypeFloat Float1 = new TypeFloat(6);
        TypeFloat Float2 = new TypeFloat(4);
        TypeFloat Float3 = Float1.subs(Float2);
        assertEquals(new TypeFloat(2),Float3);

        TypeFloat Int1 = Float1.subs(new TypeInt(4));
        assertEquals(new TypeFloat(2),Int1);

        TypeFloat Binary1 = Float1.subs(new TypeBinary("100"));
        assertEquals(new TypeFloat(2),Binary1);
    }

    @Test
    void mult() {
        TypeFloat Float1 = new TypeFloat(2);
        TypeFloat Float2 = new TypeFloat(2);
        TypeFloat Float3 = Float1.mult(Float2);
        assertEquals(new TypeFloat(4),Float3);

        TypeFloat Int1 = Float1.mult(new TypeInt(2));
        assertEquals(new TypeFloat(4),Int1);

        TypeFloat Binary1 = Float1.mult(new TypeBinary("10"));
        assertEquals(new TypeFloat(4),Binary1);
    }

    @Test
    void div() {
        TypeFloat Float1 = new TypeFloat(4);
        TypeFloat Float2 = new TypeFloat(2);
        TypeFloat Float3 = Float1.div(Float2);
        assertEquals(new TypeFloat(2),Float3);

        TypeFloat Int1 = Float1.div(new TypeInt(2));
        assertEquals(new TypeFloat(2),Int1);

        TypeFloat Binary1 = Float1.div(new TypeBinary("10"));
        assertEquals(new TypeFloat(2),Binary1);
    }
}