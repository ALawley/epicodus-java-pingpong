public class PingPong {
  public static void main(String[] args) {}

  public String isPingPong(Integer number) {
    String result = "";
    if ( number % 15 == 0 ) {
      result = "pingpong";
    } else if ( number % 3 == 0 ) {
      result = "ping";
    } else if ( number % 5 == 0 ) {
      result = "pong";
    }
    return result;
  }
}
