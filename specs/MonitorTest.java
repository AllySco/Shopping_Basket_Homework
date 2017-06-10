import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class MonitorTest {

  Monitor monitor1;

  @Before
  public void before() {
    monitor1 = new Monitor("BenQ", 250, 24);
  }

  @Test
  public void cangetMonitorSize() {
    assertEquals(24, monitor1.getMonitorSize());
  }
}