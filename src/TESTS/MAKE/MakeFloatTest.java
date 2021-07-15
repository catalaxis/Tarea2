package TESTS.MAKE;

import Factory.ActualType.Number.MakeFloat;
import Type.ActualType.Number.ActualNumber.TypeFloat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeFloatTest {

    @Test
    void make() {
        MakeFloat FloatMaker = new MakeFloat();
        TypeFloat F1 = FloatMaker.make("1", new TypeFloat(1.0));
        assertEquals(F1, new TypeFloat(1.0));
        assertEquals(FloatMaker.size(), 1);

        TypeFloat F2 = FloatMaker.make("1", new TypeFloat(1.0));
        assertEquals(F1, F2);
        assertEquals(FloatMaker.size(), 1);
    }

    @Test
    void simpleMake() {
        MakeFloat FloatMaker = new MakeFloat();
        TypeFloat F1 = FloatMaker.simpleMake(new TypeFloat(1.0));
        assertEquals(F1, new TypeFloat(1.0));
        assertEquals(FloatMaker.size(), 1);

        TypeFloat F2 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F3 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F4 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F5 = FloatMaker.simpleMake(new TypeFloat(1.0));
        assertEquals(FloatMaker.size(), 1);

        TypeFloat F6 = FloatMaker.simpleMake(new TypeFloat(0.0));
        assertEquals(FloatMaker.size(), 2);
    }

    @Test
    void size() {
        MakeFloat FloatMaker = new MakeFloat();
        TypeFloat F1 = FloatMaker.simpleMake(new TypeFloat(1.0));
        assertEquals(FloatMaker.size(), 1);

        TypeFloat F2 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F3 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F4 = FloatMaker.simpleMake(new TypeFloat(1.0));
        TypeFloat F5 = FloatMaker.simpleMake(new TypeFloat(1.0));
        assertEquals(FloatMaker.size(), 1);

        TypeFloat F6 = FloatMaker.simpleMake(new TypeFloat(0.0));
        assertEquals(FloatMaker.size(), 2);
    }
}