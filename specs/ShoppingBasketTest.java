import static org.junit.Assert.*;
import org.junit.*;
import basket.*;

public class ShoppingBasketTest {

  ShoppingBasket shoppingBasket1;

  @Before
  public void before () {
    shoppingBasket1 = new ShoppingBasket(123);
  }


  @Test
  public void canGetAccountNumber() {
    assertEquals(123, shoppingBasket1.getAccountNumber());
  }

}