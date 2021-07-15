package TESTS.MAKE;

import Factory.ActualType.Number.MakeInt;
import Type.ActualType.Number.ActualNumber.TypeInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeIntTest {

    @Test
    void make() {
        MakeInt IntMaker = new MakeInt();
        TypeInt I1 = IntMaker.make("1", new TypeInt(1));
        assertEquals(I1, new TypeInt(1));
        assertEquals(IntMaker.size(), 1);

        TypeInt I2 = IntMaker.make("1", new TypeInt(1));
        assertEquals(I1, I2);
        assertEquals(IntMaker.size(), 1);

        TypeInt I3 = IntMaker.make("2", new TypeInt(1));
        assertEquals(I1, I3);
        assertEquals(IntMaker.size(), 2);
    }

    @Test
    void simpleMake() {
        MakeInt IntMaker = new MakeInt();
        TypeInt I1 = IntMaker.simpleMake( new TypeInt(1));
        assertEquals(I1, new TypeInt(1));
        assertEquals(IntMaker.size(), 1);

        TypeInt I2 = IntMaker.simpleMake( new TypeInt(1));
        TypeInt I3 = IntMaker.simpleMake( new TypeInt(1));
        TypeInt I4 = IntMaker.simpleMake( new TypeInt(1));
        assertEquals(I1, I2);
        assertEquals(IntMaker.size(), 1);

        TypeInt I5 = IntMaker.simpleMake( new TypeInt(2));
        TypeInt I6 = IntMaker.simpleMake( new TypeInt(2));
        TypeInt I7 = IntMaker.simpleMake( new TypeInt(2));
        assertEquals(IntMaker.size(), 2);

    }

    @Test
    void size() {
        MakeInt IntMaker = new MakeInt();
        TypeInt I1 = IntMaker.simpleMake( new TypeInt(1));
        assertEquals(IntMaker.size(), 1);

        TypeInt I2 = IntMaker.simpleMake( new TypeInt(1));
        TypeInt I3 = IntMaker.simpleMake( new TypeInt(1));
        TypeInt I4 = IntMaker.simpleMake( new TypeInt(1));
        assertEquals(I1, I2);
        assertEquals(IntMaker.size(), 1);

        TypeInt I5 = IntMaker.simpleMake( new TypeInt(2));
        TypeInt I6 = IntMaker.simpleMake( new TypeInt(2));
        TypeInt I7 = IntMaker.simpleMake( new TypeInt(2));
        assertEquals(IntMaker.size(), 2);
    }
}