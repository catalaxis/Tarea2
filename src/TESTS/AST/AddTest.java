package TESTS.AST;

import AST.NodoOperation.Add;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void testEquals() {
        Add Ast1 = new Add(new TypeString("hola"), new TypeString("mundo"));
        assertEquals(Ast1, new Add(new TypeString("hola"), new TypeString("mundo")));

        Add Ast2 = new Add(Ast1, new TypeString("universal"));
        assertEquals(Ast2, new Add(Ast1, new TypeString("universal")));

        assertNotEquals(Ast1, Ast2);
    }

    @Test
    void get() {
        Add Ast1 = new Add(new TypeString("hola"), new TypeString("mundo"));
        assertEquals(Ast1.get(), new Add(new TypeString("hola"), new TypeString("mundo")));

        Add Ast2 = new Add(Ast1, new TypeString("universal"));
        assertEquals(Ast2.get(), new Add(Ast1, new TypeString("universal")));
    }

    @Test
    void getLeft() {
        Add Ast1 = new Add(new TypeString("hola"), new TypeString("mundo"));
        assertEquals(Ast1.getLeft(), new TypeString("hola"));

        Add Ast2 = new Add(Ast1, new TypeString("universal"));
        assertEquals(Ast2.getLeft(),Ast1);
    }

    @Test
    void getRight() {
        Add Ast1 = new Add(new TypeString("hola"), new TypeString("mundo"));
        assertEquals(Ast1.getRight(), new TypeString("mundo"));

        Add Ast2 = new Add(Ast1, new TypeString("universal"));
        assertEquals(Ast2.getRight(), new TypeString("universal"));
    }

    @Test
    void calculate() {
        Add Ast1 = new Add(new TypeString("hola"), new TypeString("mundo"));
        assertEquals(Ast1.calculate(), new TypeString("holamundo"));

        Add Ast2 = new Add(Ast1, new TypeString("universal"));
        assertEquals(Ast2.calculate(), new TypeString("holamundouniversal"));

        Add Ast3 = new Add(new TypeInt(1), new TypeString("universal"));
        assertEquals(Ast3.calculate(), null);
    }
}