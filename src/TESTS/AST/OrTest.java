package TESTS.AST;

import AST.NodoOperation.Or;
import Type.ActualType.Number.ActualNumber.TypeBinary;
import Type.ActualType.Number.ActualNumber.TypeInt;
import Type.ActualType.TypeBool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrTest {

    @Test
    void testEquals() {
        //se testea si dos arboles iguales son iguales para el caso de un arbol compuesto por una operacion y dos hojas
        Or Ast1 = new Or(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1, new Or(new TypeBinary("1"), new TypeBinary("1")));

        //se testea el caso para la operacion entre un nodo y una hoja
        Or Ast2 = new Or(Ast1, new TypeBinary("0"));
        assertEquals(Ast2, new Or(Ast1, new TypeBinary("0")));


    }

    @Test
    void get() {
        //get para un arbol compuesto de hojas
        Or Ast1 = new Or(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.get(), new Or(new TypeBinary("1"), new TypeBinary("1")));

        //get para un arbol compuesto de un nodo y una hoja
        Or Ast2 = new Or(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.get(), new Or(Ast1, new TypeBinary("0")));
    }

    @Test
    void getLeft() {
        //homologo a get
        Or Ast1 = new Or(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.getLeft(), new TypeBinary("1"));

        Or Ast2 = new Or(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.getLeft(), Ast1);
    }

    @Test
    void getRight() {
        //homologo a get
        Or Ast1 = new Or(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.getRight(), new TypeBinary("1"));

        Or Ast2 = new Or(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.getRight(),new TypeBinary("0"));
    }

    @Test
    void calculate() {
        //OPERACIONES VALIDAS
        //Arbol de dos hojas
        Or Ast1 = new Or(new TypeBinary("1"), new TypeBinary("1"));
        assertEquals(Ast1.calculate(), new TypeBinary("1"));

        //Arbol de un nodo y una hoja 1er caso
        Or Ast2 = new Or(Ast1, new TypeBinary("0"));
        assertEquals(Ast2.calculate(),  new TypeBinary("1"));

        //Arbol de un nodo y una hoja 2do caso
        Or Ast3 = new Or(Ast1, new TypeBool(false));
        assertEquals(Ast3.calculate(), new TypeBinary("1"));

        //Arbol de un nodo y una hoja 3er caso
        Or Ast4 = new Or(new TypeBool(false), Ast1);
        assertEquals(Ast4.calculate(), new TypeBinary("1"));

        //OPERACIONES NO VALIDAS, cada una deberia retornar null
        Or Ast5 = new Or(new TypeInt(1), Ast1);
        assertEquals(Ast5.calculate(), null);

        Or Ast6 = new Or(Ast1, new TypeInt(1));
        assertEquals(Ast6.calculate(), null);
    }
}