import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class CpuTest {

  Cpu cpu1;

  @Before
  public void before() {
    cpu1 = new Cpu("Intel", 200, "i5");
  }

  @Test
  public void canGetCpuType() {
    assertEquals("i5", cpu1.getCpuType());
  }

 
}