package TESTS.AST;

import AST.NodoOperation.Numerical.Subs;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsTest {

    @Test
    void testEquals() {
        Subs Ast1 = new Subs(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1, new Subs(new TypeInt(2), new TypeInt(4)));
        Subs Ast2 = new Subs(Ast1,new TypeInt(8));
        assertEquals(Ast2, new Subs(Ast1,new TypeInt(8)));
        assertNotEquals(Ast1, Ast2);
    }

    @Test
    void get() {
        //hay un testeo de get implicito en el testEquals, sin embargo se haran los tests de todas formas
        Subs Ast1 = new Subs(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.get(), new Subs(new TypeInt(2), new TypeInt(4)));

        Subs Ast2 = new Subs(Ast1,new TypeInt(8));
        assertEquals(Ast2.get(), new Subs(Ast1,new TypeInt(8)));
    }

    @Test
    void getLeft() {
        Subs Ast1 = new Subs(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getLeft(), new TypeInt(2));

        Subs Ast2 = new Subs(Ast1,new TypeInt(8));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        Subs Ast1 = new Subs(new TypeInt(2), new TypeInt(4));
        assertEquals(Ast1.getRight(),  new TypeInt(4));

        Subs Ast2 = new Subs(Ast1,new TypeInt(8));
        assertEquals(Ast2.getRight(), new TypeInt(8));
    }

    @Test
    void calculate() {
        Subs Ast1 = new Subs(new TypeInt(6), new TypeInt(4));
        assertEquals(Ast1.calculate(),  new TypeInt(2));

        Subs Ast2 = new Subs(Ast1,new TypeInt(1));
        assertEquals(Ast2.calculate(), new TypeInt(1));

        Subs Ast3 = new Subs(Ast1,new TypeString("holamundo"));
        assertEquals(Ast3.calculate(), null);
    }
}