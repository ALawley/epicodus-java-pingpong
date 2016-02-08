import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public String isPingPong(Integer number) {
    String pingPongResult = "";
    if ( number % 15 == 0 ) {
      pingPongResult = "pingpong";
    } else if ( number % 3 == 0 ) {
      pingPongResult = "ping";
    } else if ( number % 5 == 0 ) {
      pingPongResult = "pong";
    } else {
      pingPongResult = number.toString();
    }
    return pingPongResult;
  }
  public ArrayList<String> pingPongCount(Integer number) {
    ArrayList<String> resultArray = new ArrayList<String>();
    for (Integer i = 1; i <= number; i++){
      resultArray.add(isPingPong(i));
    }
    return resultArray;
  }
}
