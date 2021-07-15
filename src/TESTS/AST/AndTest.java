package TESTS.AST;

import AST.NodoOperation.And;
import Type.ActualType.Number.ActualNumber.TypeBinary;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeBool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndTest {

    @Test
    void testEquals() {
        And Ast1 = new And(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1, new And(new TypeBinary("1"), new TypeBinary("1")));

        And Ast2 = new And(Ast1, new TypeBinary("0"));
        assertEquals(Ast2, new And(Ast1, new TypeBinary("0")));
    }

    @Test
    void get() {
        And Ast1 = new And(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.get(), new And(new TypeBinary("1"), new TypeBinary("1")));

        And Ast2 = new And(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.get(), new And(Ast1, new TypeBinary("0")));
    }

    @Test
    void getLeft() {
        And Ast1 = new And(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.getLeft(), new TypeBinary("1"));

        And Ast2 = new And(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        And Ast1 = new And(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.getRight(), new TypeBinary("1"));

        And Ast2 = new And(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.getRight(),new TypeBinary("0"));
    }

    @Test
    void calculate() {
        And Ast1 = new And(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.calculate(), new TypeBinary("1"));

        And Ast2 = new And(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.calculate(),  new TypeBinary("0"));

        And Ast3 = new And(Ast1, new TypeBool(false));
        assertEquals(Ast3.calculate(), new TypeBinary("0"));

        And Ast4 = new And(new TypeBool(false), Ast1);
        assertEquals(Ast4.calculate(), new TypeBinary("0"));

        And Ast5 = new And(new TypeInt(1), Ast1);
        assertEquals(Ast5.calculate(), null);

        And Ast6 = new And(Ast1, new TypeInt(1));
        assertEquals(Ast6.calculate(), null);
    }
}