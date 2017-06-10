import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class CpuTest {

  Cpu cpu;

  @Before
  public void before() {
    cpu = new Cpu("Intel", 200, "i5");
  }

  @Test
  public void canGetCpuType() {
    assertEquals("i5", cpu.getCpuType());
  }

 
}