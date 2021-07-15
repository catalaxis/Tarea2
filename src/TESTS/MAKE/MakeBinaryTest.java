package TESTS.MAKE;

import Factory.ActualType.Number.MakeBinary;
import Type.ActualType.Number.ActualNumber.TypeBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeBinaryTest {

    @Test
    void make() {
        MakeBinary BinaryMaker = new MakeBinary();
        TypeBinary B1 = BinaryMaker.make("1", new TypeBinary("1"));
        assertEquals(B1, new TypeBinary("1"));
        assertEquals(BinaryMaker.size(), 1);

    }

    @Test
    void simpleMake() {
        MakeBinary BinaryMaker = new MakeBinary();
        TypeBinary B1 = BinaryMaker.simpleMake(new TypeBinary("1"));
        TypeBinary B2 = BinaryMaker.simpleMake(new TypeBinary("1"));
        assertEquals(B1, B2);
        assertEquals(BinaryMaker.size(), 1);

        TypeBinary B3 = BinaryMaker.simpleMake(new TypeBinary("0"));
        assertEquals(BinaryMaker.size(), 2);
    }

    @Test
    void size() {
        MakeBinary BinaryMaker = new MakeBinary();
        TypeBinary B1 = BinaryMaker.simpleMake(new TypeBinary("1"));
        TypeBinary B2 = BinaryMaker.simpleMake(new TypeBinary("1"));
        assertEquals(B1, B2);
        assertEquals(BinaryMaker.size(), 1);

        TypeBinary B3 = BinaryMaker.simpleMake(new TypeBinary("0"));
        assertEquals(BinaryMaker.size(), 2);

        TypeBinary B4 = BinaryMaker.simpleMake(new TypeBinary("0"));
        TypeBinary B5 = BinaryMaker.simpleMake(new TypeBinary("0"));
        assertEquals(BinaryMaker.size(), 2);
    }
}