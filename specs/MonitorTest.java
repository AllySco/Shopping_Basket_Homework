import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class MonitorTest {

  Monitor monitor1;
  Monitor monitor2;
  Monitor monitor3;

  @Before
  public void before() {
    monitor1 = new Monitor("BenQ", 250);
    monitor2 = new Monitor("Samsung", 190);
    monitor3 = new Monitor("LG", 200);
  }



}