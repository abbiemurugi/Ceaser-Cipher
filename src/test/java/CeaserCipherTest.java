import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest{

    @Test
    public void runEncrypt_ableTo_encrypt() {
        CeaserCipher ceasercipher = new CeaserCipher();
        assertEquals("cd", ceasercipher.isEncrypt("ab",2));

    }
}