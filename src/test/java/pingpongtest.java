import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forNumberDivisibleByThree_ping() {
    PingPong pingPong = new PingPong();
    assertEquals("ping", pingPong.isPingPong(6));
  }
  @Test
  public void isPingPong_forNumberDivisibleByFive_pong() {
    PingPong pingPong = new PingPong();
    assertEquals("pong", pingPong.isPingPong(5));
  }
}
