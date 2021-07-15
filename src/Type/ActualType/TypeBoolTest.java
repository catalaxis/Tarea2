package Type.ActualType;

import Type.ActualType.Number.ActualNumber.TypeBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeBoolTest {

    @Test
    void testEquals() {
        TypeBool Bool1 = new TypeBool(false);
        TypeBool Bool2 = new TypeBool(false);
        assertEquals(Bool1, Bool2);
        TypeBool Bool3 = new TypeBool(true);
        assertEquals(false, Bool1.equals(Bool3));
        assertEquals(false, Bool1.equals(new TypeString("")));

    }

    @Test
    void testToString() {
        TypeBool Bool1 = new TypeBool(true);
        assertEquals("true", Bool1.toString());
    }

    @Test
    void toTypeBool() {
        TypeBool Bool1 = new TypeBool(false);
        TypeBool Bool2 = Bool1.toTypeBool();
        assertEquals(Bool1, Bool2);
    }

    @Test
    void toTypeString(){
        TypeBool Bool1 = new TypeBool(false);
        TypeString String1 = Bool1.toTypeString();
        TypeString result = new TypeString("false");
        assertEquals(result, String1);
    }

    @Test
    void or() {
        TypeBool Bool1 = new TypeBool(true);
        TypeBool Bool2 = new TypeBool(false);
        TypeBool Bool3 = (TypeBool) Bool1.or(Bool2);
        TypeBool result = new TypeBool(true);
        assertEquals(result, Bool3);

        TypeBinary Binary1 = new TypeBinary("0");
        TypeBinary Binary2 = Binary1.or(Bool1);
        assertEquals(new TypeBinary("1"),Binary2);

        TypeBinary Binary3 = Binary1.or(Bool2);
        assertEquals(new TypeBinary("0"),Binary3);
    }

    @Test
    void and() {
        TypeBool Bool1 = new TypeBool(true);
        TypeBool Bool2 = new TypeBool(false);
        TypeBool Bool3 = (TypeBool) Bool1.and(Bool2);
        TypeBool result = new TypeBool(false);
        assertEquals(result, Bool3);
        TypeBinary Binary1 = new TypeBinary("1");
        TypeBinary Binary2 = (TypeBinary) Binary1.and(Bool2);
        assertEquals(new TypeBinary("0"),Binary2);
    }
}