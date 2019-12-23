import com.gradletdd.gradletdd.entities.Usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * AssertTest
 */
public class AssertTest {

    @Test
    public void test() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);

        Assertions.assertEquals(1, 1, "Erro na comparação");
        Assertions.assertEquals(0.51234, 0.512, 0.001);
        Assertions.assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer i2 = 5;
        Assertions.assertEquals(Integer.valueOf(i), i2);
        Assertions.assertEquals(i, i2.intValue());

        Assertions.assertEquals("bola", "bola");
        Assertions.assertNotEquals("bola", "casa");
        Assertions.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assertions.assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");
        Usuario u3 = null;

        Assertions.assertEquals(u1, u2);

        Assertions.assertSame(u2, u2);
        Assertions.assertNotSame(u1, u2);

        Assertions.assertNull(u3);
        Assertions.assertNotNull(u2);
    }
    
}