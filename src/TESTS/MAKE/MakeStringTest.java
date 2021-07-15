package TESTS.MAKE;

import Factory.ActualType.MakeString;
import Type.ActualType.TypeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeStringTest {

    @Test
    void make() {
        //se testea el metodo make que deberia crear
        MakeString StringMaker = new MakeString();
        TypeString S1 = StringMaker.make("holamundo", new TypeString("holamundo"));
        assertEquals(S1, new TypeString("holamundo")); //crea correctamente el objeto

        TypeString S2 = StringMaker.make("holauniverso", new TypeString("holamundo"));
        assertEquals(S2, new TypeString("holamundo"));
        //solo se deberian crear 2 entradas en el diccionario de StringMaker
        assertEquals(StringMaker.size(), 2);

    }
    @Test
    void simpleMake() {
        MakeString StringMaker = new MakeString();
        TypeString S1 = StringMaker.simpleMake(new TypeString("holamundo"));
        assertEquals(S1, new TypeString("holamundo")); //crea correctamente el metodo
        TypeString S2 = StringMaker.simpleMake(new TypeString("holamundo"));
        TypeString S3 = StringMaker.simpleMake(new TypeString("holamundo"));
        TypeString S4 = StringMaker.simpleMake(new TypeString("holamundo"));

        assertEquals(StringMaker.size(), 1); //en este caso solo crea 1 entrada

        TypeString S5 = StringMaker.simpleMake(new TypeString("holauniverso"));
        assertEquals(StringMaker.size(), 2); //y ahora creamos nuestra segunda entrada
        TypeString S6 = StringMaker.simpleMake(new TypeString("holauniverso"));
        assertEquals(StringMaker.size(), 2); //nuevamente, como s5 es igual a s6 existen solo dos entradas
    }

    @Test
    void size() {
        MakeString StringMaker = new MakeString();
        TypeString S1 = StringMaker.make("holamundo", new TypeString("holamundo"));
        TypeString S2 = StringMaker.make("holamundo", new TypeString("holamundo"));
        assertEquals(StringMaker.size(), 1); //para este caso tambien solo se crea una entrada

    }
}