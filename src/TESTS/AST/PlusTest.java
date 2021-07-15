package TESTS.AST;

import AST.NodoOperation.Numerical.Plus;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusTest {

    @Test
    void testEquals() {
        Plus Ast1 = new Plus(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1, new Plus(new TypeInt(2), new TypeInt(4)));
        Plus Ast2 = new Plus(Ast1,new TypeInt(8));
        assertEquals(Ast2, new Plus(Ast1,new TypeInt(8)));
        assertNotEquals(Ast1, Ast2);
    }

    @Test
    void get() {
        //hay un testeo de get implicito en el testEquals, sin embargo se haran los tests de todas formas
        Plus Ast1 = new Plus(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.get(), new Plus(new TypeInt(2), new TypeInt(4)));

        Plus Ast2 = new Plus(Ast1,new TypeInt(8));
        assertEquals(Ast2.get(), new Plus(Ast1,new TypeInt(8)));
    }

    @Test
    void getLeft() {
        Plus Ast1 = new Plus(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getLeft(), new TypeInt(2));

        Plus Ast2 = new Plus(Ast1,new TypeInt(8));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        Plus Ast1 = new Plus(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getRight(),  new TypeInt(4));

        Plus Ast2 = new Plus(Ast1,new TypeInt(8));
        assertEquals(Ast2.getRight(), new TypeInt(8));
    }

    @Test
    void calculate() {
        Plus Ast1 = new Plus(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.calculate(),  new TypeInt(6));

        Plus Ast2 = new Plus(Ast1,new TypeInt(8));
        assertEquals(Ast2.calculate(), new TypeInt(14));

        Plus Ast3 = new Plus(Ast1,new TypeString("holamundo"));
        assertEquals(Ast3.calculate(), null);
    }
}