package TESTS.MAKE;

import Factory.ActualType.MakeBool;
import Type.ActualType.TypeBool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeBoolTest {

    @Test
    void make() {
        MakeBool BoolMaker = new MakeBool();
        TypeBool B1 = BoolMaker.make("Booling", new TypeBool(true));
        assertEquals(B1, new TypeBool(true));
        assertEquals(BoolMaker.size(), 1);
    }

    @Test
    void simpleMake() {
        MakeBool BoolMaker = new MakeBool();
        TypeBool B1 = BoolMaker.simpleMake(new TypeBool(true));
        assertEquals(B1, new TypeBool(true));

        TypeBool B2 = BoolMaker.simpleMake(new TypeBool(true));
        assertEquals(BoolMaker.size(), 1);

        TypeBool B3 = BoolMaker.simpleMake(new TypeBool(false));
        assertEquals(BoolMaker.size(), 2);
    }

    @Test
    void size() {
        MakeBool BoolMaker = new MakeBool();
        TypeBool B1 = BoolMaker.simpleMake(new TypeBool(true));
        assertEquals(BoolMaker.size(), 1);
        TypeBool B2 = BoolMaker.simpleMake(new TypeBool(true));
        assertEquals(BoolMaker.size(), 1);
        TypeBool B3 = BoolMaker.simpleMake(new TypeBool(false));
        assertEquals(BoolMaker.size(), 2);
    }
}