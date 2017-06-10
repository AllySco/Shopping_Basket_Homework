import static org.junit.Assert.*;
import org.junit.*;
import basket.*;
public class CaseTest {

  Case case1;

  @Before
  public void before() {
    case1 = new Case("NZXT", 150, "Full Tower");
  }

  @Test
  public void canGetCaseSizeType() {
    assertEquals("Full Tower", case1.getCaseSizeType());
  }
  
}