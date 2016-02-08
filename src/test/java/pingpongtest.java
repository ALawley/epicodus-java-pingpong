import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

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
  @Test
  public void isPingPong_forNumberDivisibleByFifteen_pingpong() {
    PingPong pingPong = new PingPong();
    assertEquals("pingpong", pingPong.isPingPong(60));
  }
  @Test
  public void isPingPong_forNumberNotDivisible_number() {
    PingPong pingPong = new PingPong();
    assertEquals("11", pingPong.isPingPong(11));
  }
  @Test
  public void pingPongCount_forNumber_pingPongCountToNumber() {
    PingPong pingPong = new PingPong();
    ArrayList<String> pingPongCountToFive = new ArrayList<String>();
    pingPongCountToFive.add("1");
    pingPongCountToFive.add("2");
    pingPongCountToFive.add("ping");
    pingPongCountToFive.add("4");
    pingPongCountToFive.add("pong");
    assertEquals(pingPongCountToFive, pingPong.pingPongCount(5));
  }
}
