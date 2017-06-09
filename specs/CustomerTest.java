import static org.junit.Assert.*;
import org.junit.*;
import basket.*;


public class CustomerTest {

  @Before
  public void before() {
    Customer customer = new Customer("Dave");
  }


@Test
public void canGetName() {
  assetEquals("Dave", customer.getName());
}


}