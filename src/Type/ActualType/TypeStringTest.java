package Type.ActualType;

import Type.ActualType.Number.ActualNumber.TypeBinary;
import Type.ActualType.Number.ActualNumber.TypeFloat;
import Type.ActualType.Number.ActualNumber.TypeInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeStringTest {

    @Test
    void testEquals() {
        TypeString String1 = new TypeString("Hola Mundo!");
        TypeString String2 = new TypeString("Hola Mundo!");
        assertEquals(String1,String2);
        TypeString String3 = new TypeString("Hola Universo!");
        assertEquals(false,String1.equals(String3));
        TypeBinary Binary1 = new TypeBinary("0");
        assertEquals(false,String1.equals(Binary1));
    }

    @Test
    void testToString() {
        TypeString String1 = new TypeString("Hola Mundo!");
        String Str = String1.toString();
        assertEquals("Hola Mundo!", Str);
    }

    @Test
    void add() {
        TypeString String1 = new TypeString("Hola");
        TypeBool Bool1 = new TypeBool(true);
        TypeBinary Binary1 = new TypeBinary("0");
        TypeInt Int1 = new TypeInt(1);
        TypeFloat Float1 = new TypeFloat(2);
        TypeString expected = new TypeString("Holatrue0000000000000000000000000000000012.0");
        TypeString String2 = String1.add(Bool1);
        String2 = String2.add(Binary1);
        String2 = String2.add(Int1);
        String2 = String2.add(Float1);
        assertEquals(expected,String2);
    }
}