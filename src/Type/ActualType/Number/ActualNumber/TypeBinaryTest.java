package Type.ActualType.Number.ActualNumber;

import Type.ActualType.TypeBool;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeBinaryTest {

    @Test
    void setBinary(){
        TypeBinary Binary1 = new TypeBinary("0101");
        Binary1.setBinary("100");
        assertEquals(new TypeBinary("0100"),Binary1);
    }
    @Test
    void getBinary(){
        TypeBinary Binary1 = new TypeBinary("0101");
        assertEquals("00000000000000000000000000000101",Binary1.getBinary());
    }
    @Test
    void testequals() {
        TypeBinary Binary1 = new TypeBinary("0101");
        TypeBinary Binary2 = new TypeBinary("0101");
        assertEquals(Binary1,Binary2);
        assertEquals(false, Binary1.equals(new TypeBinary("0")));
    }

    @Test
    void testToString() {
        TypeBinary Binary = new TypeBinary("1001");
        TypeString String = Binary.toTypeString();
        TypeString result = new TypeString("00000000000000000000000000001001");
        assertEquals(result,String);
    }

    @Test
    void toFloat() {
        TypeBinary Binary = new TypeBinary("1");
        assertEquals(1.0,Binary.toFloat());
    }

    @Test
    void toTypeInt() {
        TypeBinary Binary = new TypeBinary("111");
        TypeInt Int = Binary.toTypeInt();
        TypeInt result = new TypeInt(7);
        assertEquals(result, Int);

        TypeBinary BinaryNeg = new TypeBinary("11111111111111111111111111111111");
        TypeInt IntNeg = BinaryNeg.toTypeInt();
        TypeInt resultNeg = new TypeInt(-1);
        assertEquals(resultNeg, IntNeg);

        TypeBinary BinaryNeg2 = new TypeBinary("11111111111111111111111111111110");
        TypeInt IntNeg2 = BinaryNeg2.toTypeInt();
        TypeInt resultNeg2 = new TypeInt(-2);
        assertEquals(resultNeg2, IntNeg2);
    }
    @Test
    void toTypeBinary(){
        TypeBinary Binary1 = new TypeBinary("00000000000000000000000000001001");
        TypeBinary Binary2 = Binary1.toTypeBinary();
        assertEquals(Binary1,Binary2);
    }
    @Test
    void toTypeFloat(){
        TypeBinary Binary = new TypeBinary("111");
        TypeFloat Float = Binary.toTypeFloat();
        TypeFloat result = new TypeFloat(7);
        assertEquals(result, Float);
    }
    @Test
    void toTypeString(){
        TypeBinary Binary = new TypeBinary("1001");
        TypeString String = Binary.toTypeString();
        TypeString result = new TypeString("00000000000000000000000000001001");
        assertEquals(result,String);
    }


    @Test
    void or() {
        TypeBinary Binary1 = new TypeBinary("0");
        TypeBinary Binary2 = new TypeBinary("1");
        TypeBinary Binary3 = Binary2.or(Binary1);
        TypeBinary result = new TypeBinary("1");
        assertEquals(result, Binary3);
        assertEquals(Binary1, Binary1.or(Binary1));
        assertEquals(Binary2, Binary2.or(Binary2));

        TypeBool Bool1 = new TypeBool(true);
        TypeBool Bool2 = new TypeBool(false);
        Binary3 = Binary1.or(Bool1);
        assertEquals(result, Binary3);
        assertEquals(new TypeBinary("0"), Binary1.or(Bool2));
    }

    @Test
    void and() {
        TypeBinary Binary1 = new TypeBinary("0");
        TypeBinary Binary2 = new TypeBinary("1");
        TypeBinary Binary3 = Binary2.and(Binary1);
        TypeBinary result = new TypeBinary("0");
        assertEquals(result, Binary3);

        TypeBool Bool1 = new TypeBool(true);
        Binary3 = Binary1.and(Bool1);
        assertEquals(result, Binary3);
    }

    @Test
    void plus() {
        TypeBinary Binary1 = new TypeBinary("111");
        TypeBinary Binary2 = (TypeBinary) Binary1.plus(new TypeBinary("1"));
        assertEquals(new TypeBinary("1000"), Binary2);

        TypeBinary Binary3 = (TypeBinary) Binary1.plus(new TypeInt(1));
        assertEquals(new TypeBinary("1000"), Binary3);

        TypeFloat Float = (TypeFloat) Binary1.plus(new TypeFloat(1));
        assertEquals(new TypeFloat(8), Float);
    }

    @Test
    void subs() {
        TypeBinary Binary1 = new TypeBinary("111");
        TypeBinary Binary2 = (TypeBinary) Binary1.subs(new TypeBinary("1"));
        assertEquals(new TypeBinary("110"), Binary2);

        TypeBinary Binary3 = (TypeBinary) Binary1.subs(new TypeInt(1));
        assertEquals(new TypeBinary("110"), Binary3);

        TypeFloat Float = (TypeFloat) Binary1.subs(new TypeFloat(1));
        assertEquals(new TypeFloat(6), Float);
    }

    @Test
    void mult() {
        TypeBinary Binary1 = new TypeBinary("10");
        TypeBinary Binary2 = (TypeBinary) Binary1.mult(new TypeBinary("10"));
        assertEquals(new TypeBinary("100"), Binary2);

        TypeBinary Binary3 = (TypeBinary) Binary1.mult(new TypeInt(2));
        assertEquals(new TypeBinary("100"), Binary3);

        TypeFloat Float = (TypeFloat) Binary1.mult(new TypeFloat(2));
        assertEquals(new TypeFloat(4), Float);
    }

    @Test
    void div() {
        TypeBinary Binary1 = new TypeBinary("100");
        TypeBinary Binary2 = (TypeBinary) Binary1.div(new TypeBinary("10"));
        assertEquals(new TypeBinary("10"), Binary2);

        TypeBinary Binary3 = (TypeBinary) Binary1.div(new TypeInt(2));
        assertEquals(new TypeBinary("10"), Binary3);

        TypeFloat Float = (TypeFloat) Binary1.div(new TypeFloat(2));
        assertEquals(new TypeFloat(2), Float);
    }
}