import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArifmeticsTests {
    @Test
    void testSum() {
        int a = 10;
        int b = 22;
        assertEquals(32, a + b, "Sum = " + (a + b));
    }
}
