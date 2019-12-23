import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * OrdemTest
 */
public class OrdemTest {

    public static int contador = 0;

    @Test
    public void inicia() {
        contador = 1;
    }

    @Test
    public void verifica() {
        Assertions.assertEquals(1, contador);
    }
    
}