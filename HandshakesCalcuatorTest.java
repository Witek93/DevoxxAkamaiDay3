import org.junit.Assert;
import org.junit.Test;

public class HandshakesCalcuatorTest {

    private HandshakesCalcuator handshakesCalcuator = new HandshakesCalcuator();

    @Test
    public void test() {
        long handshakes0 = handshakesCalcuator.calculateFor(0);
        long handshakes1 = handshakesCalcuator.calculateFor(1);
        long handshakes2 = handshakesCalcuator.calculateFor(2);
        long handshakes3 = handshakesCalcuator.calculateFor(3);
        long handshakes4 = handshakesCalcuator.calculateFor(4);

        Assert.assertEquals(0, handshakes0);
        Assert.assertEquals(0, handshakes1);
        Assert.assertEquals(1, handshakes2);
        Assert.assertEquals(3, handshakes3);
        Assert.assertEquals(6, handshakes4);
    }
}