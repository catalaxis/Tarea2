package Type.ActualType.Number.ActualNumber;

import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeIntTest {

    @Test
    void testEquals() {
        TypeInt Int1 = new TypeInt(100);
        TypeInt Int2 = new TypeInt(100);
        assertEquals(Int1,Int2);
        TypeInt Int3 = new TypeInt(10);
        assertEquals(false,Int3.equals(Int1));
        TypeBinary Binary1 = new TypeBinary("0");
        assertEquals(false,Int3.equals(Binary1));
    }

    @Test
    void testToString() {
        TypeInt Int = new TypeInt(100);
        assertEquals("100",Int.toString());
    }

    @Test
    void toFloat() {
        TypeInt Int = new TypeInt(100);
        assertEquals(100,Int.toFloat());

    }

    @Test
    void toTypeInt() {
        TypeInt Int1 = new TypeInt(100);
        TypeInt Int2 = Int1.toTypeInt();
        assertEquals(Int1,Int2);

    }

    @Test
    void toTypeBinary() {
        TypeInt Int1 = new TypeInt(7);
        TypeBinary Binary1 = Int1.toTypeBinary();
        assertEquals(new TypeBinary("111"),Binary1);

        TypeInt Int2 = new TypeInt(-1);
        TypeBinary Binary2 = Int2.toTypeBinary();
        assertEquals(new TypeBinary("11111111111111111111111111111111"),Binary2);
    }
    @Test
    void toTypeString(){
        TypeInt Int = new TypeInt(100);
        TypeString String = Int.toTypeString();
        assertEquals(new TypeString("100"),String);
    }
    @Test
    void toTypeFloat(){
        TypeInt Int = new TypeInt(100);
        TypeFloat Float = Int.toTypeFloat();
        assertEquals(new TypeFloat(100),Float);
    }

    @Test
    void plus() {
        TypeInt Int1 = new TypeInt(2);
        TypeInt Int2 = (TypeInt) Int1.plus(new TypeInt(2));
        assertEquals(new TypeInt(4),Int2);

        TypeInt Int3 = (TypeInt) Int1.plus(new TypeBinary("10"));
        assertEquals(new TypeInt(4),Int3);

        TypeFloat Float = (TypeFloat )Int1.plus(new TypeFloat(2));
        assertEquals(new TypeFloat(4),Float);
    }

    @Test
    void subs() {
        TypeInt Int1 = new TypeInt(4);
        TypeInt Int2 = (TypeInt) Int1.subs(new TypeInt(2));
        assertEquals(new TypeInt(2),Int2);

        TypeInt Int3 = (TypeInt) Int1.subs(new TypeBinary("10"));
        assertEquals(new TypeInt(2),Int3);

        TypeFloat Float = (TypeFloat )Int1.subs(new TypeFloat(2));
        assertEquals(new TypeFloat(2),Float);
    }

    @Test
    void mult() {
        TypeInt Int1 = new TypeInt(2);
        TypeInt Int2 = (TypeInt) Int1.mult(new TypeInt(2));
        assertEquals(new TypeInt(4),Int2);

        TypeInt Int3 = (TypeInt) Int1.mult(new TypeBinary("10"));
        assertEquals(new TypeInt(4),Int3);

        TypeFloat Float = (TypeFloat )Int1.mult(new TypeFloat(2));
        assertEquals(new TypeFloat(4),Float);
    }

    @Test
    void div() {
        TypeInt Int1 = new TypeInt(8);
        TypeInt Int2 = (TypeInt) Int1.div(new TypeInt(2));
        assertEquals(new TypeInt(4),Int2);

        TypeInt Int3 = (TypeInt) Int1.div(new TypeBinary("10"));
        assertEquals(new TypeInt(4),Int3);

        TypeFloat Float = (TypeFloat )Int1.div(new TypeFloat(2));
        assertEquals(new TypeFloat(4),Float);
    }
}