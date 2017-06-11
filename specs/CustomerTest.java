import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class CustomerTest {

  Customer customer;
  ShoppingBasket shoppingBasket;

  @Before
  public void before() {
    customer = new Customer("Dave", new ShoppingBasket(123));
  }

  @Test
  public void canGetName() {
    assertEquals("Dave", customer.getName());
  }

  @Test
  public void cangetLoyaltyCard() {
    assertEquals(false, customer.getLoyaltyCard());
  }

  @Test
  public void canSetLoyaltyCard() {
    customer.setLoyaltyCard();
    assertEquals(true, customer.getLoyaltyCard());
  }


}