package TESTS.AST;

import AST.NodoOperation.Numerical.Div;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivTest {

    @Test
    void testEquals() {
        Div Ast1 = new Div(new TypeInt(4), new TypeInt(2));
        assertEquals(Ast1, new Div(new TypeInt(4), new TypeInt(2)));
        Div Ast2 = new Div(Ast1,new TypeInt(1));
        assertEquals(Ast2, new Div(Ast1,new TypeInt(1)));
        assertNotEquals(Ast1, Ast2);
    }

    @Test
    void get() {
        //hay un testeo de get implicito en el testEquals, sin embargo se haran los tests de todas formas
        Div Ast1 = new Div(new TypeInt(4), new TypeInt(2));
        assertEquals(Ast1.get(), new Div(new TypeInt(4), new TypeInt(2)));

        Div Ast2 = new Div(Ast1,new TypeInt(1));
        assertEquals(Ast2.get(), new Div(Ast1,new TypeInt(1)));
    }

    @Test
    void getLeft() {
        Div Ast1 = new Div(new TypeInt(4), new TypeInt(2));
        assertEquals(Ast1.getLeft(), new TypeInt(4));

        Div Ast2 = new Div(Ast1,new TypeInt(1));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        Div Ast1 = new Div(new TypeInt(4), new TypeInt(2));
        assertEquals(Ast1.getRight(),  new TypeInt(2));

        Div Ast2 = new Div(Ast1,new TypeInt(1));
        assertEquals(Ast2.getRight(), new TypeInt(1));
    }

    @Test
    void calculate() {
        Div Ast1 = new Div(new TypeInt(4), new TypeInt(2));
        assertEquals(Ast1.calculate(),  new TypeInt(2));

        Div Ast2 = new Div(Ast1,new TypeInt(1));
        assertEquals(Ast2.calculate(), new TypeInt(2));

        Div Ast3 = new Div(Ast1,new TypeString("holamundo"));
        assertEquals(Ast3.calculate(), null);
    }
}