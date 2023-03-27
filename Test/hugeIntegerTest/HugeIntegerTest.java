package hugeIntegerTest;

import chapter8.hugeInteger.HugeInteger;
import chapter8.hugeInteger.HugeIntegerException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HugeIntegerTest {
    HugeInteger hugeInteger;
    @BeforeEach
    void alwaysDoThisFirst(){
        hugeInteger = new HugeInteger(new int[40]);
    }
    @Test
    void testThatHugeIntegerExist(){
        assertNotNull(hugeInteger);
    }
}
