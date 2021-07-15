package TESTS.AST;

import AST.NodoOperation.Numerical.Mult;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultTest {

    @Test
    void testEquals() {
        Mult Ast1 = new Mult(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1, new Mult(new TypeInt(2), new TypeInt(4)));
        Mult Ast2 = new Mult(Ast1,new TypeInt(8));
        assertEquals(Ast2, new Mult(Ast1,new TypeInt(8)));
        assertNotEquals(Ast1, Ast2);
    }

    @Test
    void get() {
        //hay un testeo de get implicito en el testEquals, sin embargo se haran los tests de todas formas
        Mult Ast1 = new Mult(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.get(), new Mult(new TypeInt(2), new TypeInt(4)));

        Mult Ast2 = new Mult(Ast1,new TypeInt(8));
        assertEquals(Ast2.get(), new Mult(Ast1,new TypeInt(8)));
    }

    @Test
    void getLeft() {
        Mult Ast1 = new Mult(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getLeft(), new TypeInt(2));

        Mult Ast2 = new Mult(Ast1,new TypeInt(8));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        Mult Ast1 = new Mult(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getRight(),  new TypeInt(4));

        Mult Ast2 = new Mult(Ast1,new TypeInt(8));
        assertEquals(Ast2.getRight(), new TypeInt(8));
    }

    @Test
    void calculate() {
        Mult Ast1 = new Mult(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.calculate(),  new TypeInt(8));

        Mult Ast2 = new Mult(Ast1,new TypeInt(8));
        assertEquals(Ast2.calculate(), new TypeInt(64));

        Mult Ast3 = new Mult(Ast1,new TypeString("holamundo"));
        assertEquals(Ast3.calculate(), null);
    }
}