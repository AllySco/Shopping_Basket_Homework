import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class CustomerTest {

  Customer customer;

  @Before
  public void before() {
    customer = new Customer("Dave");
  }

  @Test
  public void canGetName() {
    assetEquals("Dave", customer.getName());
  }


}