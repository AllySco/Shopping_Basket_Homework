import static org.junit.Assert.*;
import org.junit.*;
import basket.*;
import product_type.*;

public class CaseTest {

  Case case1;
  Case case2;
  Case case3;

  @Before
  public void before() {
    case1 = new Case("NZXT", 150);
    case2 = new Case("Zalman", 120);
    case3 = new Case("CoolerMaster", 180);
  }

  @Test
  public void canGetName() {
    assetEquals("Zalman", case2.getName());
  }
  
}