import static org.junit.Assert.*;
import org.junit.*;


public class EncryptTest {
    @Test
    public void isEncrypt_ableTo_encrypt() {
        Encrypt encrypt = new Encrypt();
        assertEquals("ab", encrypt.isEncrypt("ab",3));

    }
}